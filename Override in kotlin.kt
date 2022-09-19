/*
*
*/
open class ABC {
   open val count: Int = 0
   
   open fun think () {
      println("Hey!! i am thinking ")
   }
}
class BCD: ABC() {
   override val count: Int
   
   init{
      count = 100
   }

   override fun think() {
      println("I am from Child")
   }
   
   fun displayCount(){
      println("Count value is $count")
   }
}
fun main(args: Array<String>) {
   var  a = BCD()
   a.displayCount()
}
