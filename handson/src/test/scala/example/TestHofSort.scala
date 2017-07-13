package example

import org.scalatest._


class TestHofSort extends FlatSpec with Matchers {
  val ingredients = List("apple", "tomate", "eggs")


  it should "sort alphabetically" in{
    assert(HofSort.sortAlphabetically(ingredients).head == "apple")
    assert(HofSort.sortAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort reverse alphabetically" in{
    assert(HofSort.sortReverseAlphabetically(ingredients).head == "tomate")
    assert(HofSort.sortReverseAlphabetically(ingredients).tail.head == "eggs")
  }

  it should "sort by increasing size" in{
    assert(HofSort.sortIncreasingSize(ingredients).head == "eggs")
    assert(HofSort.sortIncreasingSize(ingredients).tail.head == "apple")
  }


}