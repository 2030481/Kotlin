open class ABC {
   fun think () {
      println("Hey!! i am thiking ")
   }
}
class BCD: ABC(){ // inheritence happend using default constructor 
}

fun main(args: Array<String>) {
   var  a = BCD()
   a.think()
}
