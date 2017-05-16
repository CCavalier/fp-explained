/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestMultiplyByTwo extends FlatSpec with Matchers {


  it should "multiply by two" in{
    assert(CurryingObject.multiplyByTwo(2)==4)
    assert(CurryingObject.multiplyByTwo(2156)==4212)
  }
  
}