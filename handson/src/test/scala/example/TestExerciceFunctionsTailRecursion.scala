package example

import org.scalatest._
import scala.reflect.runtime.universe._
import scala.annotation.tailrec
import scala.math.BigInt.int2bigInt

class TestExerciceFunctionsTailRecursion extends FlatSpec with Matchers {
  
  
  def fib(x: Int): BigInt = {
        @tailrec def fibacc(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
            case 0 => prev
            case 1 => next
            case _ => fibacc(x - 1, next, (next + prev))
        }
        fibacc(x)
    }
  
  it should "be a valid tail recursion fibonacci function" in {
    for(i <- 1 to 10)
      assert( ExerciceFunctionsTailRecursion.fibonacci(10)  == fib(10))
    
//    ExerciceFunctionsTailRecursion.fibonacci(100)
//    val runMirror =  runtimeMirror(getClass.getClassLoader)
//    val module = runMirror.staticModule(ExerciceFunctionsRecursion.getClass.getName)
//    val moduleMirror = runMirror.reflectModule(module)
//    val method = moduleMirror.symbol.info.decl(TermName("fibonacci")).asMethod
//    val objMirror = runMirror.reflect(moduleMirror.instance)
//    val fibonacci = objMirror.reflectMethod(method)
//    
//    for(i <- 1 to 10)
//      assert( fibonacci(i) == fib(i))
  }
  
}