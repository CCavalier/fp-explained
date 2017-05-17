package example

import org.scalatest._
import scala.util.{ Failure, Success }
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created by charlotte on 14/05/17.
 */
class FutureTest extends FlatSpec with Matchers {

  it should "do nothing" in {
    FutureType.cookAPie(4)
  }
}
