package example

import org.scalatest._
import scala.reflect.runtime.universe._

class TestExerciceSizeInfo extends FlatSpec with Matchers {

  it should "return if it's an empty list or not" in {
    ExerciceSizeInfo.isEmpty(List()) should be(true)
    ExerciceSizeInfo.isEmpty(List(1, 2, 3)) should be(false)
  }

  it should "return if a list is big" in {
    ExerciceSizeInfo.isBig(List(1, 2, 3, 4, 5), 3)
    ExerciceSizeInfo.isBig(List(1, 2, 3, 4, 5), 10)
    ExerciceSizeInfo.isBig(List(), 3)
  }
}