package example

/**
  * Created by charlotte on 30/05/17.
  */
object PureFunctionExercise {

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
