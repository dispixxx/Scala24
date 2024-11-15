

import scala.io.AnsiColor
object HelloWorldApp extends App{
  println(s"${AnsiColor.MAGENTA}Hello world from Console${AnsiColor.RESET}")
}

object SimpleHelloWorld{
  def main(args: Array[String]): Unit = {
    println(s"${AnsiColor.RED}HelloFromMain${AnsiColor.RESET}")
  }
}