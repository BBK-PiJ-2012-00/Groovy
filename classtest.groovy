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
println fifth.x
println fifth.y
if (fifth.x > rec.downRight.x) {
	println "YEAH!!"
}
