package practice

class Sum (i : Int, j : Int) {
  var x : Int = i;
  var y : Int = j;
  
  def add(i1 : Int, i2 : Int){
    x = x + i1;
    y = y + i2;
    println(x)
    println(y)
  }
  
}


object doSum {
  def main(args : Array[String]){
    val s = new Sum(0, 0);
    s.add(100, 200);
  }
}