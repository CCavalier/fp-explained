package example

import org.scalatest.{FlatSpec, Matchers}

class TestPureFunctionNew extends FlatSpec with Matchers{

  it should "build a complete url" in {
    assert(PureFunctionExercise.useUrl() == "http://tech.io")
    assert(PureFunctionExercise.useUrl() == "http://tech.io")
  }
}
