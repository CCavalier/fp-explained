package example

/**
  * Created by charlotte on 13/05/17.
  */
object Lamdba {

  /**
    * will apply the f function to the a first integers
    * @param a high limit
    * @param f a function to apply
    * @return the sum of the a first number where the f function has been applied
    */
  def operation(a:Int)(f:(Int)=> Int): Int={

    def opeAcc(acc : Int, lim: Int): Int={
      if(lim == 0) acc
      else opeAcc(acc + f(lim), lim -1)
    }

    opeAcc(0, a)
  }

  /**
    * a function that will return the sum from 1 to a
    */
  def sum(a : Int): Int = ???


  /**
    * a function that will return the sum of the square from 1 to a
    */
  def sumSquare(a : Int): Int = ???



  /**
    * a function that will return the sum of the odd number from 1 to a
    */
  def sumOdd(a : Int): Int = ???

}
