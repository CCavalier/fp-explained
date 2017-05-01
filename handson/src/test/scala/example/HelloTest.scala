package example

/**
  * Created by charlotte on 01/05/17.
  */
import org.scalatest._

class HelloTest extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}