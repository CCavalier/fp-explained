/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestCurrying extends FlatSpec with Matchers {
  val ingredients = List("apple", "tomate", "eggs")


  it should "sort alphabetically" in{
    assert(Hof.sortAlphabetically(ingredients).head == "apple")
    assert(Hof.sortAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort reverse alphabetically" in{
    assert(Hof.sortReverseAlphabetically(ingredients).head == "tomate")
    assert(Hof.sortReverseAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort by increasing size" in{
    assert(Hof.sortIncresingSize(ingredients).head == "eggs")
    assert(Hof.sortIncresingSize(ingredients).tail.head == "apple")
  }


}