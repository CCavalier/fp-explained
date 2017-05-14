package example

import org.scalatest._

/**
  * Created by charlotte on 09/05/17.
  */
class TestLamba extends FlatSpec with Matchers{
  it should "be sum of x first number" in {
    assert(Lamdba.sum(1)== 1)
    assert(Lamdba.sum(2)== 3)
    assert(Lamdba.sum(4)== 10)
    assert(Lamdba.sum(12)== 78)
  }

  it should "be sum of x first square number" in {
    assert(Lamdba.sumSquare(1)== 1)
    assert(Lamdba.sumSquare(2)== 5)
    assert(Lamdba.sumSquare(3)== 14)
    assert(Lamdba.sumSquare(12)== 650)
  }

  it should "be sum of x first peer number" in {
    assert(Lamdba.sumOdd(1)== 0)
    assert(Lamdba.sumOdd(2)== 2)
    assert(Lamdba.sumOdd(3)== 2)
    assert(Lamdba.sumOdd(4)== 6)
    assert(Lamdba.sumOdd(12)== 42)
  }
}
