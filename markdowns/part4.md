# Currying


Currying is one of the words you will hear the most when you start to work with functionnal programming.
And it's maybe one of the hardest to figure out.

To keep it simple, we'll just focus on what currying is useful for.
You have a function which takes many parameters, but you could want to bind some parameters.

It allows to improve code readability, by partially applying some functions, and giving names to specific uses.

Let's try to implement the following example: we want to use different sorts. So let's try to use the already-implemented sort function to define the other ones.

_ Language tips _
 For this example you can use the wildcard character _ which can match any parameter

@[Implement the differents sort]({"stubs":["/src/main/scala/example/Currying.scala"], "command":"example.TestCurrying", "layout": "aside"})

