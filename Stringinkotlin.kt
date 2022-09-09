fun main(args: Array<String>){
	// accessing string elements one by one
	var str = "Hello"
	println(str[0])
	println(str[1])
	println(str[2])
	println(str[3])
	println(str[4])
	
	// accessing the string elements using for loop
	var str2 = "Geeks"
	for(i in str2.indices){
		print(str2[i]+" ")
	}
}
