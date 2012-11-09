println "Please enter a series of numbers, ending with -1: "
int firstEntry = Integer.parseInt(System.console().readLine())
int fallBackA, fallBackD
int firstEntrySave = firstEntry
boolean consecutive = true
boolean ascending = false
boolean descending = false
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
			if (secondEntry > firstEntry) {
			fallBackA = firstEntry
			firstEntry = secondEntry
			ascending = true
			descending = false
			}
		}
		else if ((secondEntry == firstEntry - 1) && (secondEntry == fallBackD)) {
			if (secondEntry < firstEntry) {
			firstEntry = secondEntry
			secondEntry = fallBackD
			fallBackD = fallBackD - 1
			descending = true
			ascending = false
			}
		}
	}
	else { 
	finished = true
	}
}
}
if (!consecutive) {
println "No."
}
if ((ascending) && (descending)) {
println "No."
}
else if ((!ascending) && (!descending)) {
println "No."
}
else if ((!ascending) && (descending)){
println "Yes."
}
else if ((ascending) && (!descending)) {
println "Yes."
}

//if last entry is greater than next to lastÉ >! <! or something -- need to rule out sequences like 7656, which currently return yes.


