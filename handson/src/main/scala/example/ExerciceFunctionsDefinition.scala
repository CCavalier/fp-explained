package example

object ExerciceFunctionsDefinition {
  
  /**
   * Define the function sum that takes two Integer and some them
   * sum(2,3) gives 5
   */
  def sum(a: Int, b: Int): Int = {
    return ???
  }

  /**
   * Same function as above but without explicit return type and brackets
   */
  def sumWithoutExplicitReturnType(a: Int, b: Int) = ???

  /**
   * Define the function as an anonymous function that take two parameters
   */
  def sumAnonymous = (x: Int, y: Int) => ???

  /**
   * *
   *
   * Define the function sumObject as an explicit instance of Function2
   *
   * tip: Function[T1,T2, U] means that there is an apply function
   * that takes two parameters of type T1 and T2
   * and returns an expression of type U
   *
   */
  def sumObject = new Function2[Int, Int, Int] {
    def apply(a: Int, b: Int) = ???

  }
}