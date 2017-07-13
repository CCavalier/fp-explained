package example

import org.scalatest._

class TestOption extends FlatSpec with Matchers{

  it should "return a none option if divide by zero" in{
    assert(OptionType.divide(12, 0) == None)
  }

  it should "return an option if divide by zero" in{
    assert(OptionType.divide(12.0, 3).isDefined)
    assert(OptionType.divide(12.0, 4).getOrElse(0.0) == 3.0)

  }
}
