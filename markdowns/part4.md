# Currying


Currying is one of the word you will hear the more often when you start to work with functionnal programming.
And it's maybe one of the most difficult to figure out.

To keep it simple, we will just focus on what currying is useful.
You have a function who take many parameters, but you could want to bind some parameters.

It allows to improve code readability, by partially apply some functions, and give name to specifics using.

Let's try to implement the following example: we will need to use differents sorts. So let's try to use the sort function already implemented to define the other one.

_ Language tips _
 For this example you can use the wildcard character _ wich could be match any parameter

@[Implements the differents sort]({"stubs":["/src/main/scala/example/Currying.scala"], "command":"example.TestCurrying", "layout": "aside"})

