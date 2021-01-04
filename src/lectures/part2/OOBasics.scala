package lectures.part2

object OOBasics {
  val person = new Person1("Prabh",26)
  person.greet("John")
  val empty=new Person1()
  empty.greet()
}

class Person1(name: String="", val age: Int=0){
  def greet(name: String): Unit =
    println(s"${this.name} says: Hi $name")

  def greet(): Unit =
    println(s"${this.name} Hello")

  def this()=this("Dummy",20)
}
