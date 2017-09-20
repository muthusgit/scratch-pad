package practice

object jpm {

  case class LinkedList[T](elem: T, next: LinkedList[T])

  val listA = LinkedList("a", null)
  val listB = LinkedList("a", LinkedList("b", LinkedList("c", null)))

  val listC = 1.to(10).map(_.toString).foldLeft(LinkedList("0", null))((ll, s) => LinkedList(s, ll))

  def append[T](l: LinkedList[T], elem: T): LinkedList[T] = l match {
    case LinkedList(h, null) => LinkedList(h, LinkedList(elem, null))
    case LinkedList(h, t)    => LinkedList(h, append(t, elem))
  }

  
  def reverse2[T](l: LinkedList[T]): LinkedList[T] = l match {
    case end @ LinkedList(_, null) => end
    case LinkedList(h, t)          => append(reverse2(t), h)
  }

  
  def main(args: Array[String]) {
    println(listA)
    reverse2(listA)
    println(listA)
    
    println(listB)
    reverse2(listB)
    println(listB)
    
    println(listC)
    reverse2(listC)
    println(listC)
  }

}
