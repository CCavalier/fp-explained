package example

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by charlotte on 09/05/17.
  */
class TestBought extends FlatSpec with Matchers{
  it should "remove the money from the account" in {
    assert(PureBoughtIngredients.buyIngredients(PureBoughtIngredients.shoppingList) == 14.5);
    assert(PureBoughtIngredients.account==30)
  }
}
