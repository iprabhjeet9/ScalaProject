package lectures.part2

object OOBasics extends App{
  val person = new Person("Prabh",26)
  person.greet("John")
  val empty=new Person()
  empty.greet()
}

class Person(name: String="", val age: Int=0){
  def greet(name: String): Unit =
    println(s"${this.name} says: Hi $name")

  def greet(): Unit =
    println(s"${this.name} Hello")

  def this()=this("Dummy",20)
}
