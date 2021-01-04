package lectures.part1

object Expression extends App {
  val x = 3 + 4
  println(x)
  val aBool = true
  var aVarBool = false
  println(aBool && aVarBool)

  //Arithmetic Operators and bitwise
  // + - * / % & | ^ >> >>> <<
  println(10 / 3.0)

  // Relational operator
  // == > >= < <=
  //Logical Operators
  //&& || ! ^
  //compound statements
  // += -= *= /= .... side effects and can only be applied on the var.

  //Instructions (statements to do like printing something)vs Expression (Statement that evaluates)

  //If is a expression
  val y = if (x > 1) true else false
  println(y) // true

  //loops   Don't  use loops in Functional programming these causes side effects
  var z = 1
  while (z < 10) {
    println(z)
    z += 1
  }

  //In scala every side effect has Unit type whose value is ()
  //Every thing return some value in scala
  val i = while (z < 10) {
    z += 1
  }
  println(i)

  //Side effects are println reassigning loops

  //code block
  val k = {
    val j = 0
    42
  }
  //println(j)  j is not defined outside its block
  //value of last expression will be return in code block for above it is 42 else it will return Unit
  println(k)
}
