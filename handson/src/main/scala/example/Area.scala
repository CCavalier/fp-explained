package example

object Area {


  def area(x : Double, y:Double):Double =(x, y) match { // it's pattern matching
      // you can use it to define some differents implementations
      // as a function of the parameters
    case (_, math.Pi) => x*x*math.Pi // for example here you can define a specific implementation for circles
    case (_, _) if x>0 && y>0 => y*x //and another one for rectangle
  }


  def circleArea(radius: Double): Double= ??? //TODO Compute the circle area using the existing method

  def squareArea(side: Double): Double= ??? //TODO Compute the square area using the existing method


  //let's create circleArea and squareArea from the area function
}
