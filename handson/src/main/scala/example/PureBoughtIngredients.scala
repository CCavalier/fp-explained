package example

/**
  * Created by charlotte on 09/05/17.
  */
object PureBoughtIngredients {
  val shoppingList = Map[String, Double]("Strawberries" -> 8, "Sugar" -> 2, "Mascarpone" -> 4.5)
  var account : Double = 30.0

  def buyIngredients(ingredients: Map[String, Double]): Double ={
    val price = ingredients.values.reduce(_ + _)
    account = account - price
    price
  }



}
