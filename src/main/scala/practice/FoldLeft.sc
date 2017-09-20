object FoldLeft {
	var list:List[Int] = List(1,2,3,4,5)
	
	//foldLeft(0) -> Starting value
	//(_+_) -> first one is the accumulator which holds the intermediate value.
	//For the first time the initial value will be use, then the accumulated value will be used
	list.foldLeft(0)(_+_)
	//With a custom function that takes 2 paramaters - accumulator and the current value in collection
	list.foldLeft(0)((acc,i) => acc+i)

	//Creating a Linked List
	case class LinkedList[T](element : T, next : LinkedList[T])
	
	type P = LinkedList[String]

	//var testList = 1.to(10).map(_.toString)
  var firstItem = LinkedList("0",null)
	var testList = 1.to(10).map(_.toString).foldLeft(firstItem)((acc, i) => LinkedList(i, acc))
		
	def createList[T](l : LinkedList[T], value : String) : LinkedList[T] = {
		l match {
		 case  LinkedList(h, null) =>
		 case LinkedList(h, t) =>
		}
	}
			
	def reverse2[T](l : LinkedList[T]) : LinkedList[T] = {
		l match {
		 case exit @ LinkedList(_, null) => exit
		 case LinkedList(value, nextItem) => createList(reverse2(nextItem), value)
		}
	}
	

	
	
	
	
}
