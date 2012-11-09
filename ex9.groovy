println "Please enter a series of numbers, ending with -1: "
boolean ascending = true
String s = System.console().readLine()
int a = Integer.parseInt(s)
	if (a == -1) {
	ascending = false
	}
	else {
	boolean finished = false
		while (!finished) { 
		String t = System.console().readLine()
		int b = Integer.parseInt(t)
			if (b == a + 1) {
			a = b
			}
			else if (b != a + 1) {
			ascending = false	
			}
			if (b == -1) {
			finished = true
			}
		}
	}
if (ascending) {
println "Yes."
}
else {
	println "No."
}

	
		