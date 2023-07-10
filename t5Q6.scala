package FIRST

object t5Q6 {
  
  
         def main(args:Array[String]){
           
           
           def fibonaci(number:Int):Int = number match{
             
             case 0 =>0
             case 1 =>1
             case _ =>fibonaci(number-1) + fibonaci(number-2)
           }
           
           def fibonaciSeq(number:Int):Unit = {
             
             
             if(number>0){
               
               fibonaciSeq(number - 1)
               println(fibonaci(number))
             }
           }
           
           fibonaciSeq(8)
           
         }
}