# Pure Function 

Functional programming is all about functions, and specifically pure functions.

A pure function is a function which has no side effect.

_What is a side effect?_ 

A function has a side effect if during its execution something is changed.
For example:

* Modifying a variable
* Modifying a data structure in place
* Setting a field on an object
* Throwing an exception or halting with an error
* Printing to the console or reading user input
* Reading from or writing to a file
* Drawing on the screen


Let's look at an example of code with a side effect.
In this example, we take a list of ingredients and check if we've got everything to create some strawberry cream:

@[Check the ingredient list]({"stubs":["/src/main/scala/example/PureFunction.scala"], "command":"example.TestPureFunction"})


It seems this doesn't work well: before we finish executing our code something changes the ingredient list.
The elements of this list are defined as var, but we will prefer using val, which cannot be modified.
Moreover mutableList is a specific kind of list which can be modified. 



```scala
var x = 0
x = 2 //perfectly fine

val y = 10
y = 8 //will not compile
```
Let's rewrite it to make it impossible for someone to eat all the strawberries.
This is what we will change: the list must be a List (immutable) and a value.

@[Check the ingredient list]({"stubs":["/src/main/scala/example/PureFunction.scala", "/src/test/scala/example/TestPureFunction.scala"], "command":"example.TestPureFunction"})

This code will not compile: we cannot modify an immutable value.
We should refactor the method. 

This way no one can change the ingredients of the recipe: if I want some strawberries, I'll just have to buy my own.

## In a nutshell

The easiest way to visualize what pure functions are about is to see them as mathematical functions.

Mathematically, you know that 2+2 can always be replaced by 4.

That's what we want to reflect with functional programming.

```
def add (a: Int, b: Int): Int{
	a + b
}
``` 

The add function can always be substituted by its result.

_But, we cannot write applications which do nothing!_

Obviously, we don't.
But we will keep our changes, modifications, i/o operation, etc. in specific layers, outside of our logic.
Pure functions allow us to write smaller parts of code, easier to read, and thus easier to maintain.
