package example

/**
  * Created by charlotte on 30/05/17.
  */
object PureFunctionExercise {

  // val is an immutable type of data.
  // var is a mutable type of data
  // using mutable shared state is BAD
  // do not use var
  val url = "tech"

  def buildUrl(): String={
     "http://"+url+".io"
  }

  def useUrl(): String ={
    val completeUrl = buildUrl()
    println(url)
    completeUrl
  }


}
