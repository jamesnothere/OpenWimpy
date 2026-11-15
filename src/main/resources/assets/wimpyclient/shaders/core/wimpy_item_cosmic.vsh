#version 330

#moj_import <minecraft:globals.glsl>
#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in vec2 UV1;
in ivec2 UV2;
in vec3 Normal;

out vec4 vertexColor;
out vec2 texCoord0;
out vec3 modelPos;

void main() {
	vec4 view = ModelViewMat * vec4(Position, 1.0);
	gl_Position = ProjMat * view;
	vertexColor = Color;
	texCoord0 = UV0;
	// Hands bake invert(camera) into Position while ModelView has camera.
	// The product is hand-local and stays put when looking around.
	modelPos = view.xyz;
}
