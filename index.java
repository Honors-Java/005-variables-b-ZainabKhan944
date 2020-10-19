void setup()  {
	size(500, 500);
  frameRate(20);
}


void draw() {

  fill(int (random(0, 255)), int (random(1, 255)), int (random(1, 255)));
  ellipse(mouseX +  int (random(-10, 30)),mouseY + int (random(-10, 30)), 10, 10);
}

void mousePressed() {
 
 background(255);
  fill(int (random(1, 225)), int (random(1, 225)), int (random(1, 225)));
   rect(int (random(1, 500)), int (random (1,500)), int (random (75,200)), int (random (75,240)));
 }





