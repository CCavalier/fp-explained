# Currying

Currying is one of the words you will hear the most when you start to work with functional programming. It is also one of the hardest to figure out.

*Definition: Currying is the technique of translating the evaluation of a function which takes multiple arguments into evaluating a sequence of functions, each with a single argument *

To keep it simple, we'll just focus on what currying is useful for.
You have a function which takes many parameters. However, you may want to bind some parameters.

It improves code readability by partially applying some functions and giving names to specific uses.

@[Implement the multiply and multiplyByTwo]({"stubs":["/src/main/scala/example/CurryingObject.scala"], "command":"example.TestCurrying"})

Let's try with a clear-cut example. The area function defined take two parameters.
Let's implement the specific case of the circle area and square area.

@[Implement the area computation]({"stubs":["/src/main/scala/example/Area.scala"], "command":"example.TestComputeArea"})

