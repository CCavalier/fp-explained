package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestPurePlus extends FlatSpec with Matchers{
  it should "not affect cooking time" in {
    assert(PlusPureFunction.purePlus(12, PlusPureFunction.ten)==22)
  }

  it should " affect cooking time" in {
    assert(PlusPureFunction.plus(12, PlusPureFunction.max)==22)
    PlusPureFunction.max = 13
    assert(PlusPureFunction.plus(12, PlusPureFunction.max)==25)
  }


}
