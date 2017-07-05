package example

/**
  * Created by charlotte on 13/05/17.
  */
object HofSort {

  def sort(cmp: (String, String)=>Boolean, list: List[String]):List[String] ={
    list.sortWith(cmp)
  }

  def comparator(a: String, b: String): Boolean ={
    if(a < b) true
    else false
  }
  def sortAlphabetically(list: List[String]):List[String]= {
    ??? //TODO use the sort method with a function to comparate elements
  }

  def sortReverseAlphabetically(list: List[String]):List[String]={
    ??? //TODO use the sort method with a function to comparate elements
  }

  def sortIncreasingSize(list: List[String]):List[String]={
    ??? //TODO use the sort method with a function to comparate elements
  }

}
