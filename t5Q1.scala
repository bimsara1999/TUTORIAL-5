package FIRST

object t5Q1 {
  
    def main(args:Array[String]){
      
      
          print("Input a value: ");
          var value = scala.io.StdIn.readInt();
          print(prime(value));
  
      
    def prime(a:Int, b:Int = 2): Boolean = b match{
        case x if x==a =>true;
        case x if a%x==0 => false;
        case x => prime(a,x+1);
    }
  
}
}