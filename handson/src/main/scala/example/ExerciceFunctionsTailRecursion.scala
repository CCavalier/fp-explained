package example

object ExerciceFunctionsTailRecursion {
  
  /**
   * fibonacci(n) = fibonacci(n -1) + fibonacci(n - 2)
   * 
   * Complete the tail recursive implementation of fibonacci bellow
   */
  def fibonacci(n: Int): Int = {
    
    
    /**
     * 
     * The fibonacciTailRec function should return with a call to itself to enable tail recursion
     * 
     * hints: What should return fibonacci(3) with fibonacciTailRec(3, 0, 1) ?
     */
    def fibonacciTailRec(n: Int, a: Int, b: Int): Int = {
      ???
      // this method should end with a call to fibonacciTailRec
    }
    
    return fibonacciTailRec(n, 0, 1)
  }
  
  
}