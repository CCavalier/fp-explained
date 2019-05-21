package example

import org.scalatest._


class TestComputeArea extends FlatSpec with Matchers {


  it should "compute circle area" in{
   assert(Area.circleArea(3) == Area.area(3, Math.PI))
    assert(Area.circleArea(4) == 4*4*math.Pi)
  }

  it should "compute square area" in{
    assert(Area.squareArea(3) == Area.area(3, 3))
    assert(Area.squareArea(4) == 4*4)
  }



}