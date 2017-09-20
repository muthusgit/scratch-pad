package practice

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello World!");
    val s = "test";
    println(s);
    val n = 100;
    println(n);
    
    var i = 100;
    i=200;
    println(i);
    
    var x : String = "x";
    val y : Integer = 100;
    x = "text";
    
    println(x);
    println(y);
    
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
    println(myVar1);
    println(myVar2);
    
  }
}