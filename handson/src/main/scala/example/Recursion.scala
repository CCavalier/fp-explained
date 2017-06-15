package example

/**
  * Created by charlotte on 06/05/17.
  */
object Recursion {

  /**
    * Implement an algorithm which returns a list with the X first elements of the Fibonacci sequence ,
    * from bigger to smaller
    * @param list the previous elements (empty list at first call)
    * @param size the number of elements you want
    */
  def fibonacci(list : List[Int], size : Int): List[Int]=(list, size)match{

    case(_, 0) => List()
    case(_, 1)=> List(0)
    case(_, 2)=> List(1)++ fibonacci(list, size -1)
    case(_ ,_) => {
      if (list.size == size) list
      else if(list.size == 0) fibonacci(List(1,0), size)
      else fibonacci(List(list.head+list.tail.head) ++ list,size)
    }
  }


  /***
    * implement an algorithm which returns a list with the X first elements of the Fibonacci sequence ,
    * from bigger to smaller with tail recusion
    * @param size the number of elements you want
    *
    */
  def tailFibonacci(size: Int): List[Int]= {

    def fibonacciAcc(step: Int, acc: List[Int]): List[Int]={

      if(step == size){
        acc
      }else{
         fibonacciAcc(step +1, List(acc.head+acc.tail.head) ++ acc)
      }

    }

    fibonacciAcc(2, List(1, 0))
  }
}
