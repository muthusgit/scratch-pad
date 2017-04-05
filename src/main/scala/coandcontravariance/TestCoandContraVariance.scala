package coandcontravariance

/**
  * Created by SubramanianM on 28/02/2017.
  */
object TestCoandContraVariance extends App {

  //Define a method that takes an Object as parameter, and the Object takes any subtypes of Mammal
  def method1(animalObj: Box1[Mammal]){}

  //Define a method that takes an Object as parameter, and the Object takes any super class of Mammal
  def method2(animalObj: Box2[Mammal]){}

  //Define a method that takes an Object as parameter, and the Object takes only Mammal
  def method3(animalObj: Box3[Mammal]){}

  /*covariance*/
  //method1(new Box1[Animal]) //compile fails
  method1(new Box1[Mammal])
  method1(new Box1[Dog])

  /*contravariance*/
  method2(new Box2[Animal])
  method2(new Box2[Mammal])
  //method2(new Box2[Dog]) //compile fails

  /*invariance*/
  //method3(new Box3[Animal]) //compile fails
  method3(new Box3[Mammal])
  //method3(new Box3[Dog]) //compile fails

  new Box4[Animal]
}


/*Box1 is covariant in T
Box[Dog] can be used for Box[Mammal] not Box[Animal]
Only subtypes of Mammal are ok*/
//In java ? extends Mammal
class Box1[+T]{}

/*Box2 is contravariant in T
Box[Animal] can be used for Box[Mammal] not Box[Dog]
Only supertypes of Mammal are ok*/
//In java ? super Mammal
class Box2[-T]{}

/*Box3 is invariant in T
Only Mammal is ok*/
//Mammal
class Box3[T]{}

class Box4[+Mammal]{}