package fp101.tp01.functions

import org.scalatest._
import scala.reflect.runtime.universe._

class TestExerciceFunctionsRecursion extends FlatSpec with Matchers {
  
  def fibo(x: Int): Int = {
    if (x <= 1 ) 1
    else fibo(x - 1) + fibo(x -2)
  }
  
  it should "be a valid fibonacci function" in {
    val runMirror =  runtimeMirror(getClass.getClassLoader)
    val module = runMirror.staticModule("fp101.tp01.functions.ExerciceFunctionsRecursion")
    val moduleMirror = runMirror.reflectModule(module)
    val method = moduleMirror.symbol.info.decl(TermName("fibonacci")).asMethod
    val objMirror = runMirror.reflect(moduleMirror.instance)
    val fibonacci = objMirror.reflectMethod(method)
    
    for(i <- 1 to 10)
      assert( fibonacci(i) == fibo(i))
  }
  
}