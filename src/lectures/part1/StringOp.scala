package lectures.part1

object StringOp extends App {

  val str: String = "Hello, I am learning Scala."
  println(str.charAt(2))
  println(str.reverse)
  println(str.substring(7, 14))
  println(str.length)
  println(str.startsWith("Hello"))
  println(str.replace('a', 'A'))

  // scala functions
  val s: String = "2"
  println('a' +: s :+ 'b')
  println(s.toInt)
  println(str.take(5))

  // Scala specific : String interpolators

  // s-interpolators
  val name = "Prabhjeet"
  val age = 25
  val greeting = s"Hello $name, your age is $age"
  println(greeting)
  val anothergreeting = s"Hello $name, your age is ${age + 1}"
  println(anothergreeting)

  //f-interpolators
  val aFloat: Float = 1.2f
  val fstring = f"Hi $name$s , float number is $aFloat%2.2f"
  println(fstring)

  //raw-interpolators
  val rawstring = raw"this will escape.\n new line."
  println(rawstring)
  val astr = "this will not escape\n new line."
  val rawstr = raw"$astr"
  println(astr)


}
