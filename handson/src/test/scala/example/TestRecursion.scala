package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestRecursion extends FlatSpec with Matchers{
  it should "be the fibonnacci list" in {
    System.out.println(Recursion.fibonacci(List[Int](), 25))
    assert(verifyFibonacci(Recursion.fibonacci(List[Int](), 50)))
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
