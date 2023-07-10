package FIRST

object t5Q4 {
  
         def main(args:Array[String]){
           
           
           def isEven(n :Int):Boolean = n match{
             
             case 0 => true 
             case _  => isOdd(n-1)
             
           
           }
           def isOdd(n:Int):Boolean = n match{
             
             
             case 0 => false
             case _  => isEven(n-1)
           }
           
               println(isEven(5))
               println(isEven(8))
               println(isOdd(3))
               println(isOdd(10))
           
         }
  
}