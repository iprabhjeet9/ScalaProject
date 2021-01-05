package lectures.part2

object Generics extends App{

  class MyList[A]
  val myList1=new MyList[Int]
  val myList2=new MyList[String]

  class Animal
  class Dog extends Animal
  class Cat extends Animal

  class Covar[+A]
  val covar: Covar[Animal]=new Covar[Dog]

  class Invar[A]
  val invar: Invar[Animal]=new Invar[Animal]

  class Contra[-A]
  val trainer: Contra[Cat]=new Contra[Animal]

  class Sub[T<:Animal]
  val sub: Sub[Dog]=new Sub[Dog]

  class Dummy extends Animal
  val dummy: Sub[Dummy]= new Sub[Dummy]

}
