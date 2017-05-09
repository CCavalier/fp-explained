# Pure Function 

Functional programming is all about function, and specifically pure functions.

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
The elements of this list are defined as var, but we will prefer to use var, which cannot be modified.

´´´scala
var x = 0
x = 2 //perfecly right

val y = 10
y = 8 //will not compile

´´´

Let's try to change it.

@[Check the ingredients list]({"stubs":["/src/main/scala/example/PureFunction.scala", "/src/test/scala/example/TestPureFunction.scala"], "command":"example.TestPureFunction"})

