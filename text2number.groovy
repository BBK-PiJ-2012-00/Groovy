println "This program reads a number with a commas and a decimal place and outputs half of it.  Please enter a number: "
String s = System.console().readLine()
int length = s.length() 
int charCount = 0
String number = ""
String decimal = ""
char c
boolean postDecimal = false
while (charCount < length) {
	if (!postDecimal) {
		c = s.charAt(charCount)
		charCount++
		if (c == '\u002C') {
		//do nothing
		}
		else if (c >= '\u0030') {
		number = number + c
		}
		else if (c == '\u002E') {
		postDecimal = true
		}
	}
	if (postDecimal) {
		c = s.charAt(charCount)
		charCount++
		decimal = decimal + c
	}
}
int decimalLength = decimal.length()
String finalNumber = number + decimal
int fNum  = Integer.parseInt(finalNumber)
println fNum
println decimalLength


//times by 10E(amount of decimal places), divide by 2, divide by 10E(decimal places)