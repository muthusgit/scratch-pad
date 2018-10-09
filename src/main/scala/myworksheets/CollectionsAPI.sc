object CollectionsAPI {


  val arr1 = Array(1,2,3)
  val arr2 = new Array[Int](10)
  val arr3 = new Array[String](100)

  arr1 ++ arr2
  arr1 ++: arr2 //If ends with : right associated

  2 +: arr2 :+ 2 //Prefix and Suffix
  arr1.size

  val lst = List(1,2,3,4)

  val arr4 = Array.fill(10)(0)
  val arr5 = Array.fill(10)(math.random)

  val arr7 = Vector(1,2,3)

  val arr8 = collection.mutable.Buffer(1,2,3)
  val arr9 = collection.mutable.ListBuffer(1,2,3)


  //Array, List, Vector, Buffer, Range
  //Array - Isn't part of Scala collections hierarchy - Array gets implicitly converted to ArrayOps when
  //an Array in passed in for a Sequence

  //Scala doesn't have static method, instead have companion object
  //Symbolic methods - +, :: etc

  //Returns all valid indices on collection
  arr2.indices

  //Seq to Parallel
  arr2.par

  lst.updated(1,10)

  arr2.patch(2, Array(1,2,3),3)
}

