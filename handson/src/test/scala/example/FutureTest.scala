package example

import org.scalatest._

/**
  * Created by charlotte on 14/05/17.
  */
class FutureTest extends FlatSpec with Matchers {

  it should "do nothing" in{
    FutureType.functionWhoNeedAVeryLongCall(4)
  }
}
