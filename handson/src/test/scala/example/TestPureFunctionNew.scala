package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestPureFunctionNew extends FlatSpec with Matchers{

  it should "build a complete url" in {
    assert(PureFunctionExercise.useUrl() == "http://tech.io")
    assert(PureFunctionExercise.useUrl() == "http://tech.io")
  }
}
