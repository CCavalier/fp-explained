package example

object ExerciceSubCollectionRetrieval {

  /**
   *
   * Without using List.tail operation
   * write a function tail that selects all elements except the first.
   *
   */
  def tail[T](l: List[T]): List[T] = ???

  /**
   * Without using List.init operation
   * write a function init that selects all elements except the last.
   *
   */
  def init[T](l: List[T]): List[T] = ???

  /**
   * Without using List.take operation
   * Write a function take that selects the first n elements of the l list.
   */
  def take[T](l: List[T], n: Int) = ???

  /**
   * Without using List.drop operation
   * Write a function drop that selects all the elements of l excepts the first n elements
   */
  def drop[T](l: List[T], n: Int) = ???

  /**
   * return a new list of the ood elements of l
   *
   */
  def odd(l: List[Int]) = ???

  /**
   * return a new list of the even elements of l
   *
   */
  def even(l: List[Int]) = ???

  /**
   * Without using List.takeWile
   *
   * Write a function that takes longest prefix of elements that satisfy a predicate.
   *
   */
  def takeWhile[T](l: List[T], p: T => Boolean) = ???

}