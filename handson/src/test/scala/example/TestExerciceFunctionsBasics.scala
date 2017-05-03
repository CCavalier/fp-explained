package example

import org.scalatest._

class TestExerciceFunctionsBasics extends FlatSpec with Matchers {

  it should "double the value of x" in {
    ExerciceFunctionsBasics.double(25) should be(50)
  }

  it should "add one to x and double it" in {
    ExerciceFunctionsBasics.plusOneDouble(5) should be(12)
  }

}