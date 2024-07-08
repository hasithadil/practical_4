package practical_4

object q2 {
  def patternMatching(n:Int):String= n match {
    case x if(x < 0) => "Negative"
    case x if(x == 0) => "0"
    case x if(x%2 == 0) => "Even"
    case _ => "Odd"
  }

  def main(args:Array[String]):Unit={
    println("Enter a number : ")
    var n = scala.io.StdIn.readInt()
    println(patternMatching(n))
  }

}
