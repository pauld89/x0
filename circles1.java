//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(700, 800);
  // Try changing the width & height.
  x=  width/7;
  y=  height/8;
}
// changed height and width
// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 80, 80);
  ellipse(x+60, y+60, 40, 40);
  ellipse(x+90, y+90, 20, 20);
  fill(255,0,0);
 // made them red
  // Move them???? //--           
  x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // They move
  // to uncomment the above code,
}
