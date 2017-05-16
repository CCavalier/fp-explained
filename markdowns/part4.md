# Currying


Currying is one of the words you will hear the most when you start to work with functionnal programming.
And it's maybe one of the hardest to figure out.

To keep it simple, we'll just focus on what currying is useful for.
You have a function which takes many parameters, but you could want to bind some parameters.

It allows to improve code readability, by partially applying some functions, and giving names to specific uses.


@[Implement the multiply and multiplyByTwo]({"stubs":["/src/main/scala/example/CurryingObject.scala"], "command":"example.TestCurryingObject", "layout": "aside"})

But let's try with a more explicit example: the area function defined take two parameters.
Let's implements the specifics case of circle area and square area.

_Please uncomment the tests to enable them_

@[Implement the area computation]({"stubs":["/src/main/scala/example/CurryingObject.scala","/src/main/scala/example/TestComputeAera.scala"], "command":"example.TestComputeAera", "layout": "aside"})

