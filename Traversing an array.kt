
/*
*Traversing an array in kotlin
*/

fun main()
{
    val num = arrayOf<Int>(1, 2, 3, 4, 5)
    num.set(0, 10)
    num.set(1, 6)
    for (i in num.indices)
    {
        println(num[i])
    }
}
