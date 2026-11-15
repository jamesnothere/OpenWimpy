#version 330

#moj_import <minecraft:fog.glsl>
#moj_import <minecraft:dynamictransforms.glsl>

in float sphericalVertexDistance;
in float cylindricalVertexDistance;
in vec4 vertexColor;
in float lineEdge;

out vec4 fragColor;

void main() {
	// Soft neon core: bright center, feathered edges.
	float edge = abs(lineEdge);
	float soft = pow(clamp(1.0 - edge, 0.0, 1.0), 1.35);
	float bloom = pow(clamp(1.0 - edge * 0.82, 0.0, 1.0), 2.4) * 0.55;
	float strength = clamp(soft + bloom, 0.0, 1.0);

	vec4 color = vertexColor * ColorModulator;
	color.rgb = mix(color.rgb, min(color.rgb * 1.35 + vec3(0.08), vec3(1.0)), bloom);
	color.a *= strength;

	if (color.a < 0.004) {
		discard;
	}

	fragColor = apply_fog(
			color,
			sphericalVertexDistance,
			cylindricalVertexDistance,
			FogEnvironmentalStart,
			FogEnvironmentalEnd,
			FogRenderDistanceStart,
			FogRenderDistanceEnd,
			FogColor
	);
}
