package lectures.part2

object OOBasicsExcercise extends App{
  val john= new Writer("John","Deer",1990)
  println(john.fullName())
  val novel1=new Novel("Thinking fast and slow",2000,john)
  println(novel1.authorAge())

  val novel2=novel1.copy(2020)
  println(novel2.name,novel2.yearOfRelease)

  val counter1=new Counter
  val counter2=counter1.inc(6)
  counter2.print


}

class Writer(val firstName: String, val lastName: String, val year: Int){
  def fullName():String={
    s"$firstName $lastName"
  }
}

class Novel(val name: String,val yearOfRelease: Int,val writer: Writer){
  def authorAge(): String={
    s"Author age is ${yearOfRelease-writer.year}"
  }

  def copy(year: Int): Novel={
    new Novel(name,year,writer)
  }

}


class Counter(val count: Int=0){
  def inc()= new Counter(count+1)
  def inc(n: Int): Counter=
    if(n<=0) this
    else inc.inc(n-1)
  def print(): Unit = println(count)
}