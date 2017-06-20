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
    * try to define a function which returns amt / divisor
    * @param amt amount to divide
    * @param divisor
    * @return an option non if the divisor is 0, a non empty option else
    */
  def divide (amt : Double, divisor: Double): Option[Double] = divisor match{
      // in this case I just match on the divisor
    case 0 => None //if the divisor is 0, we don't have any value, so we return a none
    case _ => Some(amt/divisor) //else we return an option on the result of the operation
  }



  /**
    * if divide is possible, return the result of divide, else return 0
    */
  def secureDivide(amt: Double, divisor: Double):Double ={
    //we want to return the value if it's possible and manage the other case
    divide(amt,divisor).getOrElse(0)
  }

  /**
    * if divide is possible return the square of the result, -1 else
    * by applying a function to the return of divide
    */

  def squaredDivide(amt: Double, divisor: Double): Double ={
    //we will apply a function on the value of the option it is available, and return -1.0 otherwise
    divide(amt, divisor).fold(-1.0)(x=> x*x)
  }
}
