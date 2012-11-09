println "Please enter a series of numbers, finishing with -1: "
int i = Integer.parseInt(System.console().readLine())
int j = Integer.parseInt(System.console().readLine()) // Take two for initial comparison.
boolean ascending = false
boolean descending = false
boolean finished = false
if ((i == -1) || (j == -1)) {    // Allows program to always be terminated with -1, without a series being entered.
	ascending = false
	descending = false
}
else {
	if (j == i + 1) {     // Determines from first two ints whether series begins ascending or descending
	ascending = true	
		while (!finished) {
			int k = Integer.parseInt(System.console().readLine())
			if (k != -1) {
				if (k == j + 1) {
					if (ascending) {  // Ensures that once ascending is set to false, it stays that way
					j = k	          // thus preventing a series that both ascends and descends outputting ''yes.''
				        }
				}
				else if (k <= j) {   // Could perhaps substitute these two rows with a simple ELSE, meaning that anything 
				ascending = false    // other than k = j + 1 sets ascending to false without need to be so explicit.
				}
				else if (k > (j + 1)) {
				ascending = false
				}
			}
			else {
			finished = true
			}
		}
	}
	else if (j == i - 1) {
	descending = true
		while (!finished) {
			int k = Integer.parseInt(System.console().readLine())
			if (k != -1) {
				if (k == j - 1) {
					if (descending) {
					j = k
					}
				}
				else if (k >= j) {
				descending = false
				}
				else if (k < (j - 1)) {
				descending = false
				}
			}
			else { 
			finished = true
			}
		}
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









	