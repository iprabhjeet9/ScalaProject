package lectures.part1

//call by name and value
object Calling extends App {
  //call by value
  //value of argument calculate once
  def callbyvalue(x: Long): Unit = {
    println("Calling by value" + x)
    println("Calling by value" + x)
  }

  // Call by name
  //value of argument calculate each time is used until then it delays its evaluation
  def callbyname(x: => Long): Unit = {
    println("Calling by name" + x)
    println("Calling by name" + x)
  }

  callbyvalue(System.nanoTime())
  callbyname(System.nanoTime())

  // test delay
  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int): Unit = println(x)

  // printFirst(infinite(),34)
  printFirst(34, infinite())
}
