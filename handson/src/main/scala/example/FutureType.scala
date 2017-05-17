package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

/**
 * Created by charlotte on 14/05/17.
 */
object FutureType {

  val maxTime = Duration(10, SECONDS)

  def buyTomatoes(cash: Int): Int = {
    Thread.sleep(250)
    cash * 2
  }

  def cookAPie(cash: Int): Unit = {
    val f = Future(buyTomatoes(cash))
    f.onComplete {
      case Success(value) => println(s"Got $value tomatoes")
      case Failure(e)     => e.printStackTrace
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
  def enoughTomatoesForACocaPie(cash: Int): Future[Boolean] = {
    val f = Future(buyTomatoes(cash))
    ???
  }

}
