package lectures.part1

import scala.annotation.tailrec

object ScalaFunctions extends App {
  def aFunct(a: String, n: Int) = {
    a + " " + n
  }

  println(aFunct("Hello", 3))

  //Use recursion instead of loops
  //Except for recursive function return type of functions can be inferred
  //We can have function that return Unit
  def aRecursiveFunc(a: String, n: Int): String = {
    if (n == 1) a
    else a + " " + aRecursiveFunc(a, n - 1)
  }

  println(aRecursiveFunc("Hello", 4))

  //Factorial number
  def factorial(n: Double): Double = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(10))

  //Fibonacci Series 1 1 2 3 5 8 13 ....
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(10))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(10))
  println(isPrime(99999999))
  println(isPrime(117
  ))
}
