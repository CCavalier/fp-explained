package example

import org.scalatest._
import scala.reflect.runtime.universe._

class TestExerciceFunctionsDefinition extends FlatSpec with Matchers {

  it should "sum two numbers" in {
    ExerciceFunctionsDefinition.sum(1, 3) should be(4)
  }

  "sumWithoutExplicitReturnType" should "sum two numbers without return type" in {
    assert(ExerciceFunctionsDefinition.sumWithoutExplicitReturnType(1, 3) == 4)
  }

  "sumAnonymous" should "sum two numbers with anonymous function" in {
    assert(ExerciceFunctionsDefinition.sumAnonymous(1, 3) == 4)
  }

  "sumObject" should "sum two numbers with object function" in {
    assert(ExerciceFunctionsDefinition.sumObject(1, 3) == 4)
  }

}