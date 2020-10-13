  x = 100;
   y = 100;

void setup()  {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  background(225);
  fill(180);
  rect(20, 20, 125, 125);
  fill(255);
  ellipse(x, y, 75, 75);
   x = x + 11;
   y = y + 10;
  


}