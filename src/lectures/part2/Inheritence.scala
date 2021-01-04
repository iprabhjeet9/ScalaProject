package lectures.part2

object Inheritence extends App{

  val marry=new  Person("Marry",20)
  val john = new Adult(name = "john",26,1002)
  marry.print
  john.print

  val dog =new Dod
  dog.sound
  dog.eat

}

object Person{
  val N_Eyes: Int=2
  val canFly: Boolean= false
}
class Person(val name: String,val age: Int){
  private val N_legs=2
  def print: Unit=println(name,age,N_legs)
}
class Adult(override val name: String, override val age: Int, val id: Int) extends Person(name, age){
  override def print: Unit = println(name,age,id)
}

abstract class Animal{
  def eat: Unit
}

trait Sound{
  def sound: Unit
}

class Dod extends Animal with Sound{
  override def eat: Unit = println("dog eat meal")

  override def sound: Unit = println("Dog Barks")
}