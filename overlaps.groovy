class Point {
	int x;
	int y;
}
class Rectangle {
	Point upLeft = new Point();
	Point downRight = new Point();
}
Rectangle rec = new Rectangle();
Rectangle rec2 = new Rectangle();
println "WELCOME TO... OVERLAPS"
println "This program creates two rectangles based on inputs from the user defining the top left corners and the bottom right corners. A fifth point will then be requested from the user; the program will determine if it falls inside or outside one rectangle, both, or neither."
println "First rectangle: please enter the coordinates of the top left corner: "
print "x: "
rec.upLeft.x = Integer.parseInt(System.console().readLine())
print "y: "
rec.upLeft.y = Integer.parseInt(System.console().readLine())
println "Now enter the coordinates of the bottom right corner: "
print "x: "
rec.downRight.x = Integer.parseInt(System.console().readLine())
print "y: "
rec.downRight.y = Integer.parseInt(System.console().readLine())
println "Second rectangle: please enter the coordinates of the top left corner: "
print "x: "
rec2.upLeft.x = Integer.parseInt(System.console().readLine())
print "y: "
rec2.upLeft.y = Integer.parseInt(System.console().readLine())
println "Now enter the coordinates of the bottom right corner: "
print "x: "
rec2.downRight.x = Integer.parseInt(System.console().readLine())
print "y: "
rec2.downRight.y = Integer.parseInt(System.console().readLine())
println "Lastly, enter the coordinates for the fifth point: "
print "x: "
Point fifth = new Point();
fifth.x = Integer.parseInt(System.console().readLine())
print "y: "
fifth.y = Integer.parseInt(System.console().readLine())
if ((fifth.y <= rec.upLeft.y) && (fifth.y <= rec2.upLeft.y)) {
	if ((fifth.y >= rec.downRight.y) && (fifth.y >= rec2.downRight.y)) { //vertically within bounds of both
		if ((fifth.x <= rec.upLeft.x) && (fifth.x <= rec2.downRight.x)) { //horizontally within both
			if ((fifth.x > rec2.upLeft.x) && (fifth.x < rec.downRight.x)) {
				println "The fifth point lies in the overlap between both rectangles."
			}
			else if 
			
		
		
// test for within bounds of both, horizontally and vertically, then use an else if to ascertain if it's in the overlap, or just in one or the other.  At end, else -- in neither

