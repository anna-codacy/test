import scala.concurrent.duration._


object Test {
  lazy val delayedValue: String = {
    Thread.sleep(5.seconds.toMillis)
    println("Evaluated!")
    "Value"
  }

  def main(args: Array[String]): Unit = {
    println("Start!")
    println("I will happen before `delayedValue` evaluation :(")
    foo(delayedValue)
    println(delayedValue)
  }

  def foo(bar: String) = {
    println("I will happen after `delayedValue` evaluation! :D")
  }
}