package example

/**
  * Created by charlotte on 03/05/17.
  */
object PureFunction {


  var mascarpone = "Mascarpone"
  var sugar = "Sugar"
  var strawberry = "Strawberry"

  val ingredientsList = List(mascarpone, sugar, strawberry)


  def cookDessert(list : List[String] ): String ={
    if(list.contains(mascarpone)&& list.contains(sugar) && list.contains(strawberry)){
      "Awesome "+strawberry+" cream"
    }else{
      "it miss something"
    }
  }



}
