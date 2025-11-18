import scala.collection.mutable.ListBuffer
import scala.util.Random
import java.util.Date
import scala.concurrent.Future
import scala.io.Source


object PoorStyleExample {
  
  // Inconsistent indentation and spacing
  def BAD_FUNCTION_NAME(x:Int,y:Int):Int={
      var result=0
    result=x+y
      return result
  }
  
  // Unused variable and poor naming
  def calculate(a: Int, b: Int) = {
    val temp = 10
    val zzz = 20
    a * b
  }
  
  // Magic numbers and no type annotation
  def processData(data: List[Int]) = {
    data.filter(_ > 42).map(_ * 3.14).sum
  }
  
  // Mutable collection abuse
  def buildList(): List[Int] = {
    var myList = ListBuffer[Int]()
    for(i <- 1 to 10)
      {
    myList += i
      }
    myList.toList
  }
  
  // Deeply nested and hard to read
  def nestedMess(x: Option[Int]): String = {
    if(x.isDefined) {
      if(x.get > 0) {
        if(x.get < 100) {
          "Valid"
        } else {
          "Too large"
        }
      } else {
        "Negative"
      }
    } else {
      "Empty"
    }
  }
  
  // Poor exception handling
  def riskyOperation(s: String): Int = {
    try {
      s.toInt
    } catch {
      case e: Exception => {
        println("Error!")
        0
      }
    }
  }
  
  // Inconsistent brace style
  class MyClass(val name:String,val age:Int)
  {
    def describe():String={
      s"Name: $name, Age: $age"
    }
    
    def IsAdult()=age>=18  // Wrong naming convention for methods
    
    var mutableField = "bad practice"
  }
  
  // Pattern matching without exhaustiveness
  def matchExample(x: Any) = x match {
    case s: String => s.length
    case i: Int => i * 2
  }
  
  // Using return unnecessarily
  def addNumbers(a: Int, b: Int): Int = {
    val sum = a + b
    return sum
  }
  
  // Redundant toString
  def printNumber(n: Int) = {
    println(n.toString())
  }
  
  // No access modifiers and poor organization
  val GlobalConstant = 42
  var globalVariable = "avoid this"
  
  def main(args: Array[String]): Unit = {
    println("Running messy code...")
    
    // Long line that should be wrapped
    val result = BAD_FUNCTION_NAME(1, 2) + calculate(3, 4) + processData(List(1,2,3,4,5,100,200)) + buildList().sum
    
    println(result)
    
    // Using null
    val maybeNull: String = null
    if(maybeNull != null) {
      println(maybeNull)
    }
    
    // Multiple statements on one line
    val x = 1; val y = 2; val z = 3
    
    println(matchExample("hello"))
  }
}