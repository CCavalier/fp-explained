# Immutability

The easiest way to visualize what pure function is about is to see it as mathematical functions.

In this path, you know that 2+2 can always be replaced by 4.

So it's that we want to have in functional programming.

```
def add (a: Int, b: Int): Int{
	a + b
}
``` 

The add function must always can be substitute by his result.

Let's have a look to this function:

@[Check the ingredients list]({"stubs":["/src/main/scala/example/PureBoughtIngredients.scala"], "command":"example.TestBought"})


I changed the account of the user by removing the sum of the ingredients of the recipe.
But if if have more thing to buy, or discount, or if I already got some of the ingredients, this is unapropriated.

So we will separate the account operation from the recipe cost.

_But, we cannot do application who do nothing!_

Obviously, we don't.
But we will keep our changes, modification, i/o operation in specific layers, outside our logics.
Pure function allows to write smaller parts of code, easier to read, and thus easier to maintain.

