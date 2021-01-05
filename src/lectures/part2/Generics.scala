package lectures.part2

object Generics extends App{

  class MyList[+A]{
    def add[B>:A](element: B): MyList[B]= ???
  }
  val myList1=new MyList[Int]
  val myList2=new MyList[String]

  class Animal
  class Dog extends Animal
  class Cat extends Animal

  def printAnimal(myList: MyList[Animal]): Unit={
    println(myList)
  }
  val mylist=new MyList[Animal]
  val myCat=new MyList[Cat]
  printAnimal(mylist)
  printAnimal(myCat)

  class SecondList[-A]{
    def add[A](element: A): Unit= println("Adding ",element)
  }

  def printCat(secondList: SecondList[Cat])={
    println(secondList)
  }
  val secondCat = new SecondList[Cat]
  printCat(secondCat)
  val secondDog = new SecondList[Animal]
  printCat(secondDog)
  secondCat.add(secondDog)


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
