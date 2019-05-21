package example

import org.scalatest._
import scala.util.{ Failure, Success }
import scala.concurrent.ExecutionContext.Implicits.global

class FutureTest extends FlatSpec with Matchers {

  it should "do nothing" in {
    FutureType.cookAPie(4)
  }
}
