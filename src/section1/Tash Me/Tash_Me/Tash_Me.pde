PImage mustache;
PImage friend;
void setup() {
friend = loadImage("face.jpeg.jpg");
size(400, 600);
friend.resize(width,height);
 mustache = loadImage("mustache.png");
}

void draw() {
background(friend);
image(mustache, 150, 100);
}
