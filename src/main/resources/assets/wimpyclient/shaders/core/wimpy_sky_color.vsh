#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;
in vec4 Color;

out vec4 vertexColor;
out vec2 quadUv;

void main() {
	gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
	vertexColor = Color;
	int corner = gl_VertexID & 3;
	quadUv = vec2(float(corner == 1 || corner == 2), float(corner >= 2));
}
