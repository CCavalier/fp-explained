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
    // you can use a comparator function as this one
    sort(comparator, list)
    // but you can use too an anonymous function who does the same thing
    //sort((x,y)=> if (x<y) true else false, list)
    // but you can use too metacharacters as comparators
    //sort(_<_, list)
  }

  def sortReverseAlphabetically(list: List[String]):List[String]={
    sort(_>_, list)
  }

  def sortIncreasingSize(list: List[String]):List[String]={
    sort(_.size<_.size, list)
  }


}
