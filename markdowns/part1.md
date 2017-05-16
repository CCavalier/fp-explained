# Pure Function 

Functional programming is all about functions, and specifically pure functions.

Pure function is a function who has no side effect. 

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


Let see an example of code submit to a side effect. 
In this example, we take a list of ingredients and check if we got everything to create a strawberry cream:

@[Check the ingredients list]({"stubs":["/src/main/scala/example/PureFunction.scala"], "command":"example.TestPureFunction"})


It seems it doesn't work well: before we execute our code something has changed the ingredients list. 
The elements of this list are defined as var, but we will prefer to use val, which cannot be modified.
Moreover mutableList is a specific kind of list who can be modified. 



```scala
var x = 0
x = 2 //perfecly right

val y = 10
y = 8 //will not compile
```
Let's rewrite it to not allow someone to eat all the strawberries
We will try to change it: the list must be a List (immutable) and a value

@[Check the ingredients list]({"stubs":["/src/main/scala/example/PureFunction.scala", "/src/test/scala/example/TestPureFunction.scala"], "command":"example.TestPureFunction"})

This code will not compile: we cannot modify a immutable value.
We should refactor the method. 

In this way no one can change the ingredients of the recipe: if I want some strawberries, I have to buy it.

## In a nutshell

The easiest way to visualize what pure function is about is to see it as mathematical functions.

In this path, you know that 2+2 can always be replaced by 4.

So it's that we want to have in functional programming.

```
def add (a: Int, b: Int): Int{
	a + b
}
``` 

The add function must always can be substitute by his result.

_But, we cannot do application who do nothing!_

Obviously, we don't.
But we will keep our changes, modification, i/o operation in specific layers, outside our logics.
Pure function allows to write smaller parts of code, easier to read, and thus easier to maintain.
