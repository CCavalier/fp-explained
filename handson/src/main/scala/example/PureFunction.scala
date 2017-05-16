package example

import scala.collection.mutable

/**
  * Created by charlotte on 03/05/17.
  */
object PureFunction {


  var mascarpone = "Mascarpone"
  var sugar = "Sugar"
  val strawberry = "Strawberry"

  var ingredientList = mutable.MutableList(mascarpone, sugar, strawberry)


  /**
    *
    * If all ingredients are available, make a dessert
    */
  def cookDessert(list : mutable.MutableList[String] ): String ={
    if(list.contains(mascarpone) && list.contains(sugar) && list.contains(strawberry)){
      "Awesome "+strawberry+" cream"
    }else{
      "it's missing something"
    }
  }

  /**
    * I love strawberries so much that I'll eat one as soon I see it
   */
  def iAlreadyAteStrawberries()={
    ingredientList = ingredientList.diff(Seq(strawberry))
  }

  /**
    * My grandma tried to do some strawberry cream but I already ate it
    */
  def tryToCookSomethingWithAGlutton(): String={
    iAlreadyAteStrawberries()
    cookDessert(ingredientList)
  }


}
