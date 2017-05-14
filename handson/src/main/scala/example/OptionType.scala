package example

/**
  * Created by charlotte on 14/05/17.
  */
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
    * try to define a function who return amt / divisor
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
    */

  def weirdDivide(amt: Double, divisor: Double): Double ={
    ???
  }
}
