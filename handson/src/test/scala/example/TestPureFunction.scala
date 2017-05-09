package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestPureFunction extends FlatSpec with Matchers{

  it should "cook a strawberry dessert" in {
    PureFunction.strawberry = "BlueBerry"
    assert(PureFunction.cookDessert(PureFunction.ingredientsList) == "Awesome Strawberry cream", " --  :( I really like strawberries")

  }
}
