/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestCurrying extends FlatSpec with Matchers {


  it should "multiply" in{
    assert(CurryingObject.multiply(2,3) == 6)
    assert(CurryingObject.multiply(4,3) == 12)
  }

  it should "multiply by two" in{
    assert(CurryingObject.multiplyByTwo(3) == 6)
    assert(CurryingObject.multiplyByTwo(6) == 12)
  }



}