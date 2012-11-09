println "Please enter a suit: "
String Suit = System.console().readLine()
if (Suit == "Diamonds"){
	println "Works."
	}
else { 
	println "Didn't match."
}
println "Please enter a letter: "
char s = System.console().readLine()
	if (s == 'K') {
		println "Valid method."
	}
	else if (s == '2') {
		println "This too."
		}

		
	//This is all valid.
	
char z = '\u0061' 
println z
char y = '\u0062'
if (z < y) {
println "Yes."
}

// This is valid - you could use this method to determine difference between a letter and number (or any other symbol).  Would only have to test first character - the rest can be a string, and if it's valid, a new variable can be assigned to take input as a whole.  e.g. 677 is input - test if 6 is a number, if yes, add string 77 to char 6.  A bit sloppy and not failsafe, but it's a start.

	
	