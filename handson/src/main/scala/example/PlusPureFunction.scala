package example

/**
  * Created by charlotte on 09/05/17.
  */
object PlusPureFunction {

  var max = 10
  val ten = 10



  def impurePlusTen(a: Int): Int={
    a+max
  }

  //def a plus ten function
  def purePlus(a: Int, b: Int): Int={
    a+b
  }

  def purePlusTen(a:Int): Int={
    purePlus(a, ten)
  }

  def operation(f:(Int, Int) => Int)(a : Int, b:Int): Int ={
    f(a,b)
  }


  def plus(a: Int, b: Int): Int={
    operation((a, b)=> a+b)(a, b)
  }
}
