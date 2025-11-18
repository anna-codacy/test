import scala.collection.mutable.ListBuffer
import scala.util.Random
import java.util.Date
import scala.concurrent.Future
import scala.io.Source
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer
import java.io._
import scala.util._


object PoorStyleExample {
  
var GLOBAL_STATE=new HashMap[String,Any]()
var counter=0;var flag=true;var temp="xyz"
  
  // Inconsistent indentation and spacing
  def BAD_FUNCTION_NAME(x:Int,y:Int):Int={
      var result=0
    result=x+y
                    counter=counter+1
      return result
  }
  
  // Unused variable and poor naming
  def calculate(a: Int, b: Int) = {
    val temp = 10
    val zzz = 20
        val unused1=99;val unused2=88;val unused3=77
    a * b
  }
  
    def calculate2(a:Int,b:Int)={val temp=10;val zzz=20;val unused1=99;val unused2=88;val unused3=77;a*b}
  
  // Magic numbers and no type annotation
  def processData(data: List[Int]) = {
    data.filter(_ > 42).map(_ * 3.14).sum
  }
  
    def processData2(data:List[Int])={data.filter(_>42).map(_*3.14).sum}
  
  // Mutable collection abuse
  def buildList(): List[Int] = {
    var myList = ListBuffer[Int]()
    for(i <- 1 to 10)
      {
    myList += i
      }
          for(j<-1 to 5){myList+=j}
    myList.toList
  }
  
  // Deeply nested and hard to read
  def nestedMess(x: Option[Int]): String = {
    if(x.isDefined) {
      if(x.get > 0) {
        if(x.get < 100) {
                  if(x.get<50){
                        if(x.get<25){
                              if(x.get<10){"tiny"}else{"small"}
                        }else{"medium-small"}
                  }else{"medium"}
        } else {
                  if(x.get<200){
                        if(x.get>150){"kinda large"}else{"large-ish"}
                  }else{
          "Too large"
                  }
        }
      } else {
            if(x.get< -100){"very negative"}else{"Negative"}
      }
    } else {
      "Empty"
    }
  }
  
  // Poor exception handling
  def riskyOperation(s: String): Int = {
    try {
          try{
                try{
      s.toInt
                }catch{case _=>throw new Exception("inner")}
          }catch{case e:Exception=>throw e}
    } catch {
      case e: Exception => {
        println("Error!")
        0
      }
            case _=>-1
    }
  }
  
  // Inconsistent brace style
  class MyClass(val name:String,val age:Int)
  {
    def describe():String={
      s"Name: $name, Age: $age"
    }
    
    def IsAdult()=age>=18  // Wrong naming convention for methods
        def IS_SENIOR()={if(age>65){true}else{false}}
    
    var mutableField = "bad practice"
        var field2="x";var field3="y";var field4=null
  }
  
    class myclass2(n:String,a:Int){def get_name=n;def get_age=a;var x=1;var y=2;var z=3}
  
  // Pattern matching without exhaustiveness
  def matchExample(x: Any) = x match {
    case s: String => s.length
    case i: Int => i * 2
  }
  
    def matchExample2(x:Any)=x match{case s:String=>s.length;case i:Int=>i*2}
  
  // Using return unnecessarily
  def addNumbers(a: Int, b: Int): Int = {
    val sum = a + b
    return sum
  }
  
    def addNumbers2(a:Int,b:Int):Int={var sum=a+b;return sum}
    def addNumbers3(a:Int,b:Int):Int={var result=0;result=a;result=result+b;return result}
  
  // Redundant toString
  def printNumber(n: Int) = {
    println(n.toString())
  }
  
  // No access modifiers and poor organization
  val GlobalConstant = 42
  var globalVariable = "avoid this"
      var g1=1;var g2=2;var g3=3;var g4=4;var g5=5
  
    def $$$$weird_name(x:Int)={x+1}
    def `terrible name with spaces`(y:Int)=y*2
    def _______underscores_______(z:Int)=z-1
  
    def GOD_FUNCTION(a:Any,b:Any,c:Any,d:Any,e:Any,f:Any):Any={
          var result:Any=null
          if(a!=null){if(b!=null){if(c!=null){if(d!=null){if(e!=null){if(f!=null){result="all set"}else{result="f missing"}}else{result="e missing"}}else{result="d missing"}}else{result="c missing"}}else{result="b missing"}}else{result="a missing"}
          if(result=="all set"){GLOBAL_STATE.put("status","good");counter=counter+1;flag=true}else{GLOBAL_STATE.put("status","bad");counter=counter-1;flag=false}
          return result
    }
  
    def copypaste1(x:Int):Int={var r=0;r=x+1;r=r*2;r=r-1;return r}
    def copypaste2(x:Int):Int={var r=0;r=x+1;r=r*2;r=r-1;return r}
    def copypaste3(x:Int):Int={var r=0;r=x+1;r=r*2;r=r-1;return r}
  
  def main(args: Array[String]): Unit = {
    println("Running messy code...")
    
    // Long line that should be wrapped
    val result = BAD_FUNCTION_NAME(1, 2) + calculate(3, 4) + processData(List(1,2,3,4,5,100,200)) + buildList().sum + calculate2(5,6) + processData2(List(7,8,9,99,999)) + addNumbers(10,20) + addNumbers2(30,40) + addNumbers3(50,60) + copypaste1(1) + copypaste2(2) + copypaste3(3)
    
    println(result)
    
    // Using null
    val maybeNull: String = null
    if(maybeNull != null) {
      println(maybeNull)
    }
        val null1:String=null;val null2:Int= -1;val null3:Any=null
        if(null1!=null){println(null1)}else{if(null2!= -1){println(null2)}else{if(null3!=null){println(null3)}}}
    
    // Multiple statements on one line
    val x = 1; val y = 2; val z = 3
        val a=1;val b=2;val c=3;val d=4;val e=5;val f=6;val g=7;val h=8;val i=9
    
    println(matchExample("hello"))
        println(matchExample2(123))
        
        try{try{try{println(riskyOperation("abc"))}catch{case _=>println("err1")}}catch{case _=>println("err2")}}catch{case _=>println("err3")}
        
        GOD_FUNCTION(1,2,3,4,5,6);GOD_FUNCTION(null,null,null,null,null,null)
        
        for(ii<-1 to 100){for(jj<-1 to 100){for(kk<-1 to 100){if(ii==50){if(jj==50){if(kk==50){println("found it!")}}}}}}
  }
}