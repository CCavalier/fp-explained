package example

/**
  * Created by charlotte on 15/06/17.
  */
object Area {


  def area(x : Double, y:Double):Double =(x, y) match {
    case (_, math.Pi) => x*x*math.Pi
    case (_, _) if x>0 && y>0 => y*x
  }


  def circleArea(radius: Double): Double={
    ??? //TODO
  }

  def squareArea(side: Double): Double={
    ??? // TODO
  }


  //let's create circleArea and squareArea from the area function
}
