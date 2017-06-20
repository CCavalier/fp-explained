package example

/**
  * Created by charlotte on 13/05/17.
  */
object CurryingObject {


  def multiply(x : Int, y: Int):Int= x * y

  def multiplyByTwo(x:Int): Int = multiply(2, x)


}
