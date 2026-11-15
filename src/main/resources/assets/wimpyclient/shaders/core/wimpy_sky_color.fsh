#version 330

#moj_import <minecraft:dynamictransforms.glsl>

in vec4 vertexColor;
in vec2 quadUv;

out vec4 fragColor;

void main() {
	vec2 p = quadUv * 2.0 - 1.0;
	float r = length(p);
	if (r > 1.0) {
		discard;
	}

	float core = exp(-r * r * 14.0);
	float halo = exp(-r * r * 3.4) * 0.55;
	float ax = abs(p.x);
	float ay = abs(p.y);
	float spikeX = pow(max(1.0 - ax * 12.0, 0.0), 2.2) * pow(max(1.0 - ay * 1.35, 0.0), 1.6);
	float spikeY = pow(max(1.0 - ay * 12.0, 0.0), 2.2) * pow(max(1.0 - ax * 1.35, 0.0), 1.6);
	float spikes = (spikeX + spikeY) * 0.22 * core;

	float shape = clamp(core + halo + spikes, 0.0, 1.0);
	if (shape < 0.02) {
		discard;
	}

	vec4 color = vertexColor * ColorModulator;
	color.rgb *= 0.55 + 0.45 * core;
	color.a *= shape;
	if (color.a < 0.004) {
		discard;
	}
	fragColor = color;
}
