# Currying

Currying is one of the words you will hear the most when you start to work with functional programming. It is also one of the hardest to figure out.

* Definition: Currying is the technique of translating the evaluation of a function which takes multiple arguments into evaluating a sequence of functions, each with a single argument *

We can see currying as a series of partial application.

For a function who has N parameters, a partial application will have N-X. 
It improves code readability by binding some parameters and giving names to specific uses.


@[Implement the area computation]({"stubs":["/src/main/scala/example/Area.scala"], "command":"example.TestComputeArea"})


Now we have seen what is partial application, we can introduce currying as a series of partial application, where at each step we only apply one parameter. 

![Example](currying.png)

@[Implement the multiply and multiplyByTwo]({"stubs":["/src/main/scala/example/CurryingObject.scala"], "command":"example.TestCurrying"})