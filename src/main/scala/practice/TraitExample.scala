package practice

sealed trait Base {
  def message: String
  def printMessage = println(message);
}

class PrintHello extends Base {
  val message = "Hello"
}

class PrintHi extends Base {
  val message = "Hi"
}

object TraitExample {
  def main(args: Array[String]) {
    new PrintHello().printMessage
    new PrintHi().printMessage
  }
}

