package example

object OptionType {


  val x : String = "Hello, Maybe?"

  var maybe = Option(x) // Some

  var maybeNot = Option(null) // None

  /**
    * is defined check if the option has a value
    * @return true for maybe, false for maybeNot
    */
  def isDefined (option :Option[String]) : Boolean ={
    option.isDefined
  }


  /**
    * is defined check if the option has no value
    * @return false for maybe, true for maybeNot
    */
  def isEmpty (option : Option[String]) : Boolean ={
    option.isEmpty
  }

  val alwaysTrue = maybe.isDefined!=maybe.isEmpty


  /**
    * try to define a function which returns amt / divisor
    * @param amt amount to divide
    * @param divisor
    * @return an option non if the divisor is 0, a non empty option else
    */
  def divide (amt : Double, divisor: Double): Option[Double] ={
    ???
  }

  /**
    * if divide is possible, return the result of divide, else return 0
    */
  def secureDivide(amt: Double, divisor: Double):Double ={
    ???
  }

  /**
    * if divide is possible return the square of the result, -1 else
    * by applying a function to the return of divide
    */

  def squaredDivide(amt: Double, divisor: Double): Double ={
    ??? //TODO Use the fold method
  }
}
