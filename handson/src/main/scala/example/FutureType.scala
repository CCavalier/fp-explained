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
    println("A - Fry the garlic"); Thread.sleep(100)
    println("B - Cut the onions"); Thread.sleep(100)
    println("C - Cut the pepper"); Thread.sleep(100)
    println("D - ..."); Thread.sleep(100)
    println("E - ..."); Thread.sleep(100)
    println("F - ..."); Thread.sleep(100)
  }


  /**
   * should return a Future of true if there is at least 4 tomatoes
   *  otherwise should return a Future of false
   */
  def enoughTomatoesForACocaPie(cash: Int): Future[Boolean] = {
    val f = Future(buyTomatoes(cash))
    ?? //TODO Use the map function to return true when the number is greater than 3
  }

}
