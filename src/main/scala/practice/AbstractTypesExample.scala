package practice

trait BaseType {
  def message: String
  def printMessage = println(message);
}

class PrintHelloWorld extends BaseType {
  val message = "HelloWorld"
}

class PrintHiWorld extends BaseType {
  val message = "HiWorld"
}


class AbsTypeExample[customtype <: BaseType](var x:List[customtype]){
  x.foreach { x => x.printMessage }
}

object AbstractTypesExample {
  def main(args: Array[String]) {
        
    var y:BaseType = new PrintHelloWorld    
    type T = BaseType
    val z:T = new PrintHelloWorld()
    
    var t = List[T](new PrintHelloWorld(), new PrintHelloWorld())  
    var l = List(1,2,3)
    
    new AbsTypeExample(t)
    
    /* Incorrect
    var x:customtype=new PrintHelloWorld()
    var g = List[customtype](new PrintHelloWorld(), new PrintHelloWorld())    
    def print[x<:BaseType]{ x.printMessage }
    */
    
    new PrintHello().printMessage
    new PrintHi().printMessage
    
  }
}

