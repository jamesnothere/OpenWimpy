#version 330

#moj_import <minecraft:dynamictransforms.glsl>

in vec4 vertexColor;
in float lineEdge;

out vec4 fragColor;

void main() {
	float edge = abs(lineEdge);
	float soft = pow(clamp(1.0 - edge, 0.0, 1.0), 1.25);
	float bloom = pow(clamp(1.0 - edge * 0.78, 0.0, 1.0), 2.2) * 0.62;
	float strength = clamp(soft + bloom, 0.0, 1.0);

	vec4 color = vertexColor * ColorModulator;
	color.rgb = mix(color.rgb, min(color.rgb * 1.4 + vec3(0.1), vec3(1.0)), bloom);
	color.a *= strength;

	if (color.a < 0.004) {
		discard;
	}

	fragColor = color;
}
