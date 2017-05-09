/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestHandson extends FlatSpec with Matchers {
  val ingredients = List("apple", "tomate", "eggs")


  it should "sort the list alphabetically" in {
    assert(Hof.sort(ingredients).head == "apple")
  }

  it should "sort the list" in{
    assert(Hof.sortHof(_.size<_.size,ingredients).head == "eggs")
    assert(Hof.sortHof(_.charAt(0)<_.charAt(0),ingredients).head == "apple")
    assert(Hof.sortHof(_.size>_.size,ingredients).head == "tomate")
  }

  it should "short by ascending word size" in{
    assert(Hof.sortHof(_.size<_.size,ingredients).head == "eggs")
  }

  it should "short alphabetically" in{
    assert(Hof.sortHof(_<_,ingredients).head == "apple")
    assert(Hof.sortHof(_<_,ingredients).tail.head == "eggs")
  }

}