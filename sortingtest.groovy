println "Please enter 5 numbers: "
rank1 = Integer.parseInt(System.console().readLine())
rank2 = Integer.parseInt(System.console().readLine())
rank3 = Integer.parseInt(System.console().readLine())
rank4 = Integer.parseInt(System.console().readLine())
rank5 = Integer.parseInt(System.console().readLine())
int sortMax, sort4, sort3, sort2, sortMin
sortMax = rank1
if (rank2 >= sortMax) {
	sort4 = sortMax
	sortMax = rank2
	}
//works
	else if (rank2 < sortMax) {
		sort4 = rank2
	}
if (rank3 >= sortMax) {
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank3
	}
	else if (rank3 >= sort4) {
		sort3 = sort4
		sort4 = rank3
	}
	else if (rank3 < sort4) {
		sort3 = rank3
	}
if (rank4 >= sortMax) {
	sort2 = sort3
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank4
 	}
 	else if (rank4 >= sort4) {
 		sort2 = sort3
 		sort3 = sort4
 		sort4 = rank4
 	}
 	else if (rank4 >= sort3) {
 		sort2 = sort3
 		sort3 = rank4
 	}
 	else if (rank4 < sort3) {
 		sort2 = rank4
 	}
if (rank5 >= sortMax) {
	sortMin = sort2
	sort2 = sort3
	sort3 = sort4
	sort4 = sortMax
	sortMax = rank5
	}
	else if (rank5 >= sort4) {
		sortMin = sort2
		sort2 = sort3
		sort3 = sort4
		sort4 = rank5
	}
	else if (rank5 >= sort3) {
		sortMin = sort2
		sort2 = sort3
		sort3 = rank5
	}
	else if (rank5 >= sort2) {
		sortMin = sort2
		sort2 = rank5
		}
	else if (rank5 < sort2) {
		sortMin = rank5
	}
println sortMax
println sort4
println sort3
println sort2
println sortMin