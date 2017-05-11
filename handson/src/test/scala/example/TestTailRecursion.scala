package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestTailRecursion extends FlatSpec with Matchers{
  it should "be the fibonnacci list" in {
    System.out.println(Recursion.tailFibonacci(25) )
    assert(Recursion.fibonacci(List[Int](), 25) == Recursion.tailFibonacci())
    assert(verifyFibonacci(Recursion.tailFibonacci(25)))
  }

  def verifyFibonacci(list: List[Int]): Boolean ={
    if(list.size < 3) {
      assert(list == List(1, 0))
      true
    }
    else{
      assert(list.head == (list.tail.head+list.tail.tail.head), "value ="+list.head)
      verifyFibonacci(list.tail)
    }
  }
}
