package example

/**
  * Created by charlotte on 13/05/17.
  */
object CurryingObject {


  def multiply(x : Int, y: Int):Int= ???

  def multiplyByTwo(x:Int): Int = ???

  def area(x : Double, y:Double):Double =(x, y) match {
    case (_, math.Pi) => x*x*math.Pi
    case (_, _) if x>0 && y>0 => y*x
  }


  def circleArea(ray: Double): Double={
   ???
  }

  def squareArea(ray: Double): Double={
   ???
  }


    //let's create circleArea and squareArea from the area function

}
