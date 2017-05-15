package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 14/05/17.
  */
class TestOptionPartTwo  extends FlatSpec with Matchers{

  it should "return 0 if divide by zero" in{
    assert(OptionType.secureDivide(12, 0) == 0)
  }

  it should "return 6 if divide by 4" in{
    assert(OptionType.secureDivide(24, 4) == 6)
  }

  it should "should be weird" in{
    assert(OptionType.squaredDivide(12.0, 3)==16)
    assert(OptionType.squaredDivide(12.0, 0)== -1.0)

  }

}
