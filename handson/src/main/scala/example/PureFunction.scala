package example

import scala.collection.mutable

/**
  * Created by charlotte on 03/05/17.
  */
object PureFunction {


  var mascarpone = "Mascarpone"
  var sugar = "Sugar"
  val strawberry = "Strawberry"

  var ingredientsList = mutable.MutableList(mascarpone, sugar, strawberry)


  /**
    *
    * If all ingredients are available, make a dessert
    */
  def cookDessert(list : mutable.MutableList[String] ): String ={
    if(list.contains(mascarpone)&& list.contains(sugar) && list.contains(strawberry)){
      "Awesome "+strawberry+" cream"
    }else{
      "it miss something"
    }
  }

  /**
    * I love so much strawberries than I eat it as soon I see them
   */
  def iAlreadyAteStrawberries()={
    ingredientsList = ingredientsList.diff(Seq(strawberry))
  }

  /**
    * my grandma try to do some strawberry cream  but I already ate it
    */
  def tryToCookSomethingWithAGlutton(): String={
    iAlreadyAteStrawberries()
    cookDessert(ingredientsList)
  }


}
