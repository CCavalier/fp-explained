package example

/**
  * Created by charlotte on 15/06/17.
  */
object Area {


  def area(x : Double, y:Double):Double =(x, y) match { // it's pattern matching
      // you can use it to define some differents implementations
      // as a function of the parameters
    case (_, math.Pi) => x*x*math.Pi // for example here you can define a specific implementation for circles
    case (_, _) if x>0 && y>0 => y*x //and another one for rectangle
  }


  def circleArea(radius: Double): Double={
    area(radius, math.Pi)
  }

  def squareArea(side: Double): Double={
    area(side, side)
  }


  //let's create circleArea and squareArea from the area function
}
