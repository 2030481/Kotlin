fun main(args: Array<String>) {
// raw string - multiline string
    /*var str = """My
        |name
        |is
        |Yash
        |Raj
        |Movies
    """.trimMargin()
    println(str) */
    var x = "HelloThisIsRavi"
    var y = "HelloThisIsRavi"
    var z = "Ravi"
    println(x===y) // true , as both are pointing to the same StringPool
    println(x==z) //false since values are not equal
    println(x===z) //false
}
