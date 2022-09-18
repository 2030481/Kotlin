// default arguments in function definition name,standard and roll_no
fun student( name: String="Praveen", standard: String="IX" , roll_no: Int=11 ) {
	println("Name of the student is: $name")
	println("Standard of the student is: $standard")
	println("Roll no of the student is: $roll_no")
}

fun main(args: Array<String>) {
	val name_of_student = "Gaurav"
	val standard_of_student = "VIII"
	val roll_no_of_student = 25
	// passing the argument name_of_student to name
	// and roll_no_of_student to standard
	student(name_of_student,roll_no_of_student)
}
