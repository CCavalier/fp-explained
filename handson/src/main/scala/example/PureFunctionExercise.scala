package example

object PureFunctionExercise {

  // val is an immutable type of data.
  // var is a mutable type of data
  // using mutable shared state is BAD
  // do not use var
  var url = "tech"

  def buildUrl(): String={
    url = "http://"+url+".io"
    url
  }

  def useUrl(): String ={
    val completeUrl = buildUrl()
    println(url)
    completeUrl
  }


}
