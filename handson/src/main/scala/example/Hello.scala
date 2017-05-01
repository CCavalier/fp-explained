/**
  * Created by charlotte on 01/05/17.
  */
package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}