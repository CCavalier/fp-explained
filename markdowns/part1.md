# Pure Function 

Functional programming is all about functions, and specifically pure functions.

A pure function is a function which has no side effects.

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
In this example, we have an URL dynamically built.

@[Build an URL]({"stubs":["/src/main/scala/example/PureFunctionExercise.scala"], "command":"example.TestPureFunctionNew"})


It seems this doesn't work well: the first test passed, but in the second one the url is "http://http:// ...".
As the url attribute is mutable the url has been change two times.
This attribute is defined as var, but we will prefer using val, which cannot be modified. 


If you change the type of attribute to val, this code will not compile: we cannot modify an immutable value.


```scala
var x = 0
x = 2 //perfectly fine

val y = 10
y = 8 //will not compile
```

We should refactor the method. There is no need to modify the attribute: we don't want a state machine!



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
