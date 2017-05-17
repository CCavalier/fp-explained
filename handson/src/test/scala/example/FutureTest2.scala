package example

import org.scalatest._
import scala.util.{ Failure, Success }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration._

/**
 * Created by charlotte on 14/05/17.
 */
class FutureTest2 extends FlatSpec with Matchers {

  it should "determine if we can do a pie" in {
    // quick and dirty
    val result = Await.result(FutureType.enoughTomatoesForACocaPie(1), 1 second)
    result should be(false)

    val result2 = Await.result(FutureType.enoughTomatoesForACocaPie(2), 1 second)
    result2 should be(true)
  }
}
