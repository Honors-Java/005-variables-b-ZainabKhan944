int rectX = 100;
int rectY = 100;
int rectW = 200;
int rectH= 200;
int r = random(0,255);
int g = random(0,255);
int b = random(0,255);

void setup()  {
	size(500, 500);
  frameRate(30);
}


void draw() {
  stroke(0);
  fill(r, g, b);
  rect(rectX, rectY, rectW, rectH);
  fill((int) random(0,255), (int) random(0,255), (int) random(0,255));
  ellipse(mouseX +  int (random(-30, 30)),mouseY + int (random(-30, 30)), 10, 10);
}

void mousePressed() {
 r = (int) random(0,255); 
 g = (int) random(0,255);
 b = (int) random(0,255);
 background(255);
 rectX = (int) random(0,500);
 rectY = (int) random(0,500);
 rectWidth = (int) random (50, 400);
 rectHeight = (int) random (50,400);
 }





