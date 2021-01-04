package lectures.part1

object DeafultArgs extends App {
  def savePic(format: String = "jpg", width: Int = 1080, height: Int = 1920): Unit = println("Saving")

  savePic("jpg", 400, 600)
  //savePic(44) this call give error
  /*
  * there are two ways  to save issue with default args
  * 1. Add leading argument
  * 2. Use keyword argument i.e specify the name of arguments, using this approach order can be changed
  * */

  //1
  savePic("jpg")
  savePic(width = 400)

}
