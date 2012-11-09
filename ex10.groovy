println "Please enter a series of numbers, ending with -1: "
boolean ascending = true
boolean descending = false
String s = System.console().readLine()
int a = Integer.parseInt(s)
	if (a == -1) {
	ascending = false
	descending = false
	}
	else {
	boolean finished = false
		while (!finished) { 
		String t = System.console().readLine()
		int b = Integer.parseInt(t)
			if (b != -1) {
				if (b == a + 1) {
				a = b
				ascending = true
				}
				else if (b != a + 1) {
				ascending = false
				}
				else if (!ascending) {
					if (b == a - 1) {
					a = b
					descending = true
					}
				}
				else if (!ascending) {
					if (b != a - 1) {
					descending = false
					}
				}
			}
			else {
				finished = true
			}
		}
if (ascending) {
println "Yes."
}
else if (descending) {
println "Yes."
}
else {
println "No."
}

// test if ascending (like in 9), then if it's not, test whether descending - if one or other is true, yes, if neither no.




