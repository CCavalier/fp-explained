package example

/**
  * Created by charlotte on 13/05/17.
  */
object Currying {

  def sort(cmp: (String, String)=>Boolean, list: List[String]):List[String] ={
    list.sortWith(cmp)
  }

  def sortAlphabetically(list: List[String]):List[String]= {
    ???
  }

  def sortReverseAlphabetically(list: List[String]):List[String]={
   ???
  }

  def sortIncreasingSize(list: List[String]):List[String]={
   ???
  }


}
