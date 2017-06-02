# High Order Function


In functionnal programming a function is defined as a "first order citizen". 
This means it includes all the properties generally available to any other element, such as the possibility of being affected to a name, returned as a result or passed as a parameter.

This is what we will try now.
Just implement the greeting function to return "Hello, [name]" if the name is defined, "who are you?" otherwise.


@[Greetings]({"stubs":["/src/main/scala/example/Hof.scala"], "command":"example.TestHof"})


You have no clue? [Check the scaladoc!] (http://docs.scala-lang.org/tutorials/tour/higher-order-functions.html)

```scala
def apply(f: Int => String, v: Int) = f(v)
```

What make high order functions awesome, is this ability to pass a function in parameter. 

Let's try to implement the following example: we want to use different sorts. So let's try to use the already-implemented sort function to define the other ones.

_ Language tips _
 For this example you can use the wildcard character _ which can match any parameter

@[Implement the differents sort]({"stubs":["/src/main/scala/example/HofSort.scala"], "command":"example.TestHofSort"})

You can use functions map and reduce on the same way.
