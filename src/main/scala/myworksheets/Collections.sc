object Collections {

  //Array, List, Vector, Buffer, Range

  //Vector - Indexable Sequence, Immutable, Array + List,
  //Very Quickly find an Element, Organised as tree - 32 way tree

  //Array - Mutate

  //List - Can't index quickly

  //Buffer - Highly Mutable, Java Array List
  //Array Buffer - Quickly Indexable, List Buffer - Not Indexable

  //Range - 1 to 10 by 2

  val arr1 = Array(1,2,3)

  val arr2 = new Array[Int](100)
  val arr3 = new Array[String](100)

  val arr4 = Array.fill(10)(0)
  val arr5 = Array.fill(10)(math.random)

  def littleArray(i:Int):Array[Int] = Array(i,i,i)
  littleArray(5)
  littleArray(util.Random.nextInt(10))

  val arr6 = Array.tabulate(10)(i => i)

  val arr7 = Vector(1,2,3)

  val arr8 = collection.mutable.Buffer(1,2,3)
  val arr9 = collection.mutable.ListBuffer(1,2,3)

  //Range
  1 to 10 by 2

  1+2
  //In scala - Number 1 has a method +, so could be re-written as
  (1).+(2)
  (1).to(10).by(1)

  //If you have method takes one Argument - Can use it in in fix notation
  //and get rid of . and paranthesis

}

