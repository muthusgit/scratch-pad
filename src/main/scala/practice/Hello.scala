package practice

class Hello {
  
  def printName(s : String) = {
    println("Hello World " + s);
  }
  
}


object helloObj{
  
  def main(args : Array[String]){
    var h = new Hello;
    h.printName("Muthu");
    
    //Factorial
    println(Factorial(1))
    
    
    //Array
    var a = new Array[String](1)
    a(0)="Hi";
    a.foreach { x => println(x); println("test")}
    
    //List
    val lst1 = List(1,2)
    val lst2 = List(3,4)
    
    //For Loop
    lst1.foreach{x => println(x)}
    lst2.foreach{x => println(x)}
    
    //Combining List
    var combinedLst = lst1 ::: lst2  //new List
    combinedLst.foreach{x => println(x)}
    
    //Print array string without side effects
    a.mkString("/n")
    
  }
  

  //Factorial - Recursive Program
  def Factorial(i : BigInt) : BigInt = {
    if(i<1) 1
    else
      i*Factorial(i-1)
  }

}