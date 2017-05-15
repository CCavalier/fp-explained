/**
  * Created by charlotte on 05/05/17.
  */
package example

import org.scalatest._


class TestHof extends FlatSpec with Matchers {


  it should "say hello tommy" in{
    assert(Hof.helloOrAskName("tommy") == "Hello, tommy")
  }

  it should "say who are you?" in{
    assert(Hof.helloOrAskName("") == "Who are you?")
  }

}