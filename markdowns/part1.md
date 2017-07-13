# Pure Function 

Functional programming is all about functions, specifically pure functions.

A pure function is a function which has no side effects.
It has two main characteristics:
- If you give the same parameters, you get the same result no matter what
- It will never change its environment

_What is a side effect?_ 

A function has a side effect if something is changed during its execution.
For example:

* Modifying a variable
* Modifying a data structure in place
* Setting a field on an object
* Throwing an exception or halting with an error
* Printing to the console or reading user input
* Reading from or writing to a file
* Drawing on the screen


Let's look at an example of a function with a side effect.
In this example, we have an URL dynamically built.

@[Build an URL]({"stubs":["/src/main/scala/example/PureFunctionExercise.scala"], "command":"example.TestPureFunctionNew"})


In this test, I run the "BuildUrl" function twice. It seems this doesn't work well: the first test passed, but in the second one the url is "http://http:// ...". As the URL attribute is mutable, the URL has been changed two times.


If we want to transform this function into a pure function, we should remove the affectation and just return the new URL. 

Moreover, the URL attribute is defined as var, which is mutable. We should consider using val, which cannot be modified. 
If you change the type of attribute to val, this code will not compile anymore. Why? We cannot modify an immutable value.


```scala
var x = 0
x = 2 //perfectly fine

val y = 10
y = 8 //will not compile
```

## In a nutshell

The easiest way to visualize what pure functions are all about is to see them as mathematical functions.

Mathematically, you know that 2+2 can always be replaced by 4.

That's what we want to reflect with functional programming.

```
def add (a: Int, b: Int): Int{
	a + b
}
``` 

The add function can always be substituted by its result.

_But,if I don't change my data, my applications will do nothing!_

Obviously, we cannot keep everything immutable.
But we will keep our changes, modifications, I/O operation, etc. in specific layers outside of our logic.
Pure functions allow us to write smaller snippets of code which is easier to read, and thus easier to maintain.
