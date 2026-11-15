#version 330

#moj_import <minecraft:globals.glsl>
#moj_import <minecraft:dynamictransforms.glsl>

uniform sampler2D Sampler0;

in vec4 vertexColor;
in vec2 texCoord0;
in vec3 modelPos;

out vec4 fragColor;

float hash13(vec3 p) {
	p = fract(p * 0.1031);
	p += dot(p, p.yzx + 33.33);
	return fract((p.x + p.y) * p.z);
}

float hash12(vec2 p) {
	vec3 p3 = fract(vec3(p.xyx) * 0.1031);
	p3 += dot(p3, p3.yzx + 33.33);
	return fract((p3.x + p3.y) * p3.z);
}

float noise3(vec3 p) {
	vec3 i = floor(p);
	vec3 f = fract(p);
	f = f * f * (3.0 - 2.0 * f);
	float n000 = hash13(i);
	float n100 = hash13(i + vec3(1.0, 0.0, 0.0));
	float n010 = hash13(i + vec3(0.0, 1.0, 0.0));
	float n110 = hash13(i + vec3(1.0, 1.0, 0.0));
	float n001 = hash13(i + vec3(0.0, 0.0, 1.0));
	float n101 = hash13(i + vec3(1.0, 0.0, 1.0));
	float n011 = hash13(i + vec3(0.0, 1.0, 1.0));
	float n111 = hash13(i + vec3(1.0, 1.0, 1.0));
	float x00 = mix(n000, n100, f.x);
	float x10 = mix(n010, n110, f.x);
	float x01 = mix(n001, n101, f.x);
	float x11 = mix(n011, n111, f.x);
	return mix(mix(x00, x10, f.y), mix(x01, x11, f.y), f.z);
}

float fbm(vec3 p) {
	float v = 0.0;
	float a = 0.5;
	for (int i = 0; i < 4; i++) {
		v += a * noise3(p);
		p = p * 2.07 + 13.7;
		a *= 0.5;
	}
	return v;
}

float star2(vec2 uv, float threshold, float size) {
	vec2 cell = floor(uv);
	vec2 f = fract(uv) - 0.5;
	float n = hash12(cell);
	if (n < threshold) {
		return 0.0;
	}
	vec2 jitter = vec2(hash12(cell + 17.1), hash12(cell + 91.7)) - 0.5;
	vec2 d = f - jitter * 0.38;
	float r = length(d);
	float core = smoothstep(size, 0.0, r);
	float halo = smoothstep(size * 5.5, 0.0, r) * 0.35;
	vec2 a = abs(d);
	float spark = smoothstep(size * 1.8, 0.0, min(a.x, a.y)) * smoothstep(size * 6.5, 0.0, max(a.x, a.y));
	float twinkle = 0.55 + 0.45 * sin(GameTime * 24000.0 * 0.35 + n * 6.28318);
	return (core + halo + spark * 0.85) * mix(0.55, 1.35, n) * twinkle;
}

void main() {
	vec4 tex = texture(Sampler0, texCoord0);
	float mask = tex.a;
	if (mask < 0.08) {
		discard;
	}

	float time = GameTime * 24000.0;
	// Hand-local position, linear — do not sphericalize. Block cubes sit in 0–1
	// model space with the origin at a corner; per-fragment normalize painted
	// a radial blob instead of a face-stable galaxy.
	vec3 field = modelPos * 5.0;
	field += vec3(texCoord0 * 2.0, 0.0);

	vec3 drift = vec3(time * 0.055, time * 0.033, -time * 0.027);
	float nebula = fbm(field * 0.55 + drift * 0.35);
	float wisps = fbm(field * 1.15 - drift * 0.22 + 4.2);

	vec3 deep = vec3(0.04, 0.07, 0.16);
	vec3 navy = vec3(0.08, 0.14, 0.28);
	vec3 cyan = vec3(0.45, 0.82, 1.0);
	vec3 ice = vec3(0.90, 0.97, 1.0);
	vec3 violet = vec3(0.22, 0.28, 0.55);

	vec3 galaxy = mix(deep, navy, clamp(nebula, 0.0, 1.0));
	galaxy = mix(galaxy, violet, clamp(wisps * 0.45, 0.0, 0.4));
	galaxy += cyan * pow(max(nebula * wisps, 0.0), 1.5) * 0.45;

	vec2 uv1 = vec2(dot(field, vec3(0.73, 0.21, 0.47)), dot(field, vec3(0.18, 0.81, 0.36)));
	vec2 uv2 = vec2(dot(field, vec3(0.41, 0.62, 0.19)), dot(field, vec3(0.88, 0.12, 0.54)));
	uv1 += vec2(time * 0.085, -time * 0.052);
	uv2 += vec2(-time * 0.063, time * 0.041);

	float stars =
			star2(uv1 * 1.15, 0.62, 0.07) +
			star2(uv1 * 2.05 + 8.3, 0.74, 0.045) * 0.85 +
			star2(uv2 * 0.72 + 3.7, 0.70, 0.11) * 1.15 +
			star2(uv2 * 3.1 - 5.2, 0.82, 0.03) * 0.7;
	galaxy += ice * stars;
	galaxy = max(galaxy, deep);
	galaxy = clamp(galaxy, 0.0, 1.0);

	fragColor = vec4(galaxy, 1.0);
}
