package lectures.part1

import scala.annotation.tailrec

object TailRecursion extends App {
  // Simple Recursion
  def factorial(n: BigInt): BigInt = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  //println(factorial(50000)) // Stack overflow error

  //Tail Recursion
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(t: Int, accumulator: BigInt): BigInt = {
      if (t <= 1) accumulator
      else factHelper(t - 1, t * accumulator)
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(10))
  println(factorial(10))

  //Use Tail recursion in place of Loops

  // String concat
  def stringConcat(s: String, n: Int): String = {
    @tailrec
    def helper(s: String, n: Int, accumulator: String): String = {
      if (n == 1) accumulator
      else helper(s, n - 1, s + " " + accumulator)
    }

    helper(s, n + 1, "")
  }

  println(stringConcat("hello", 4))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeStillRec(t: Int, isPrimeStill: Boolean): Boolean = {
      if (!isPrimeStill) false
      else if (t <= 1) true
      else isPrimeStillRec(t - 1, n % t != 0 && isPrimeStill)
    }

    isPrimeStillRec(n / 2, isPrimeStill = true)
  }

  println(isPrime(117))

  def isPrimev2(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrimev2(117))

  // 1 1 2 3 5 8 13
  def factorial(n: Int): Int = {
    @tailrec
    def helper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else helper(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else helper(2, 1, 1)
  }

  println(factorial(3))


}
