/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestCurrying extends FlatSpec with Matchers {
  val ingredients = List("apple", "tomate", "eggs")


  it should "sort alphabetically" in{
    assert(Currying.sortAlphabetically(ingredients).head == "apple")
    assert(Currying.sortAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort reverse alphabetically" in{
    assert(Currying.sortReverseAlphabetically(ingredients).head == "tomate")
    assert(Currying.sortReverseAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort by increasing size" in{
    assert(Currying.sortIncreasingSize(ingredients).head == "eggs")
    assert(Currying.sortIncreasingSize(ingredients).tail.head == "apple")
  }


}