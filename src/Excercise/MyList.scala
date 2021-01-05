package Excercise

abstract class MyList[+A]{
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B>:A](element: B): MyList[B]
  def printElement: String
  override def toString: String = "["+printElement+"]"

}

object Empty extends MyList[Nothing]{
  def head: Nothing= throw new NoSuchElementException
  def tail: MyList[Nothing]= throw new NoSuchElementException
  def isEmpty: Boolean= true
  def add[B>:Nothing](element: B): MyList[B]= new Cons(element,Empty)
  override def printElement: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
  def head: A= h
  def tail: MyList[A]= t
  def isEmpty: Boolean= false
  def add[B>:A](element: B): MyList[B]= new Cons(element,this)

  override def printElement: String =
    if(t.isEmpty) ""+h
    else h+" "+t.printElement
}

object Run extends App{
  val myList=new Cons(1,new Cons(2,new Cons(3,Empty)))
  val stringList= new Cons("one",new Cons("two",new Cons("three",Empty)))
  println(myList.toString)
  println(stringList.toString)


}
