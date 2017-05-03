package example

import org.scalatest._
import scala.reflect.runtime.universe._

class TestExerciceSubCollectionRetrieval extends FlatSpec with Matchers {

  it should "return the tail of a list" in {
    ExerciceSubCollectionRetrieval.tail(List(1,2,3)) should be(List(1,2,3).tail)
  }
  
  it should "return the init of a list" in {
    ExerciceSubCollectionRetrieval.init(List(1,2,3)) should be(List(1,2,3).init)
  }

  it should "return a list of the n first elements of l" in {
    assert(ExerciceSubCollectionRetrieval.take(List(1,2,3),2)  == List(1,2,3).take(2))
  }
  
  it should "return the list without the first n elements" in {
    assert(ExerciceSubCollectionRetrieval.drop(List(1,2,3),2)  == List(1,2,3).drop(2))
  }
  
  it should "return the ood elements of the list" in {
    assert(ExerciceSubCollectionRetrieval.odd(List(1,2,3))  == List(1,2,3).filter(x => x % 2 != 0))
  }
  
  it should "return the even elements of the list" in {
    assert(ExerciceSubCollectionRetrieval.even(List(1,2,3))  == List(1,2,3).filter(x => x % 2 == 0))
  }
  
  it should "take longest prefix of elements that satisfy a predicate." in {
    assert(ExerciceSubCollectionRetrieval.takeWhile(List(1,2,3,4,5), (x: Int) => x < 3)  == List(1,2,3,4,5).takeWhile( x => x < 3))
  }
  
}