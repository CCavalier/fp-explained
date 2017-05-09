package example
/**
  * Created by charlotte on 05/05/17.
  */


object Hof{

  def sort(list: List[String]): List[String] ={
    list.sorted
  }

  def sortHof(cmp: (String, String)=>Boolean, list: List[String]):List[String] ={
    list.sortWith(cmp)
  }

  def sortAlphabetically(list: List[String]):List[String]={
    sortHof(_<_, list);
  }

  def sortReverseAlphabetically(list: List[String]):List[String]={
    sortHof(_>_, list);
  }

  def sortIncresingSize(list: List[String]):List[String]={
    sortHof(_.size<_.size, list);
  }

}