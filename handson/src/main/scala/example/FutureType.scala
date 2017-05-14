package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{Failure, Success}

/**
  * Created by charlotte on 14/05/17.
  */
object FutureType {

  val maxTime = Duration(10, SECONDS)

  def veryLongFunction (a: Int) : Int ={
    Thread.sleep(250)
    a * 2
  }


  def functionWhoNeedAVeryLongCall(a: Int): Unit ={
    val f =Future(veryLongFunction(a))
      f.onComplete {
        case Success(value) => println(s"Got the callback, meaning = $value")
        case Failure(e) => e.printStackTrace
      }
      // do the rest of your work
      println("A ..."); Thread.sleep(100)
      println("B ..."); Thread.sleep(100)
      println("C ..."); Thread.sleep(100)
      println("D ..."); Thread.sleep(100)
      println("E ..."); Thread.sleep(100)
      println("F ..."); Thread.sleep(100)

  }

  /**
    * should return the square of the result of the veryLongFunction
    */
 def callVeryLongFunction(a: Int): Int ={
  ???
 }
}
