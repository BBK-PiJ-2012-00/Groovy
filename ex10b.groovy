println "Please enter a series of numbers, ending with -1: "
int firstEntry = Integer.parseInt(System.console().readLine())
int fallBackA, fallBackD
boolean consecutive = false
if (firstEntry == -1) {
	consecutive = false
} 		// a fallback for if first entry is -1.
else {
fallBackA = firstEntry - 1
fallBackD = firstEntry -1
boolean finished = false
while (!finished) {
	int secondEntry = Integer.parseInt(System.console().readLine())
	if (secondEntry != -1) {
		if ((secondEntry == firstEntry + 1) && (secondEntry == fallBackA + 2)) {
		fallBackA = firstEntry
		firstEntry = secondEntry
		consecutive = true
		}
	}
	else { 
	finished = true
	}
}
while (finished) {
	if (secondEntry != -1) {
		if ((secondEntry == firstEntry - 1) && (secondEntry == fallBackD)) {
		firstEntry = secondEntry
		fallBackD = fallBackD - 1
		consecutive = true
		}
	}
	else { 
	finished = false
	}
}
}
if (consecutive) {
println "Yes."
}
else {
println "No."
}
