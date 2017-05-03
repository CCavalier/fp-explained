package example

import org.scalatest._
import scala.reflect.runtime.universe._
import scala.reflect.ClassTag

class TestExerciceMap extends FlatSpec with Matchers {

  it should "Split all the sentences in Lists of words" in {

    def compareList[T](l1: List[T], l2: List[T])(implicit ev: ClassTag[T]) {
      l1.zip(l2).foreach({
        case (x: Array[T], y: Array[T]) => {
          x.zip(y).foreach({ case (a, b) => assert(a == b) })
        }
        case (x, y) => assert(x == y)
      })
    }

    val l = List("Hello World!", "This is a shining afternoon")

    val lUser = ExerciceMap.splitInWords(l)
    val lAnswer = l.map(x => x.split(" "))
    compareList(lUser, lAnswer)
  }

  it should "count the words in l" in {
    val l = List("Hello World!", "This is a shining afternoon")
    assert(ExerciceMap.countWords(l) == l.flatMap(x => x.split(" ")).length)
  }

}