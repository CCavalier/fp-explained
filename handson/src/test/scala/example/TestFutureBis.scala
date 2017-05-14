package example

import org.scalatest._

/**
  * Created by charlotte on 14/05/17.
  */
class TestFutureBis extends FlatSpec with Matchers {


  it should "be square 2x after a long time" in{
    assert(FutureType.callVeryLongFunction(2) == 16)
    assert(FutureType.callVeryLongFunction(6) == 144)
  }
}
