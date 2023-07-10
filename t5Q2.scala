package FIRST

object t5Q2 {
  
 def main(args:Array[String]){
         
         
    def prime(a:Int, b:Int = 2):Boolean = b match{
        case x if x==a =>true;
        case x if a%x==0 => false;
        case x => prime(a,x+1);
    }
    def primeSeq(n:Int):Unit={
        if(n>1){
            primeSeq(n-1);
            if (prime(n))
            println(n);
        }
        
    }

    print("Input a value:");
    var value = scala.io.StdIn.readInt();
    primeSeq(value);
         
         
       }
  
}
