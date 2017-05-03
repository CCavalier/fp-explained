package example

import org.scalatest._

class TestExerciceFold extends FlatSpec with Matchers {

  it should "return sum of a List" in {
    assert(ExerciceFold.sumFoldLeft(List(1,2,3)) == List(1,2,3).foldLeft(0)((x, y) => x + y))
  }

  it should "return the min value of a List" in {
    assert(ExerciceFold.minReduceRight(List(1,2,3)) == List(1,2,3).reduceRight((x, y) => if (x > y) y else x))
  }

}