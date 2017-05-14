# Dummy example of lambda

Until now we have used a lot of functions.
We defined that we want them pure (no side effect).
We have seen that we can passed it il parameter of other functions, or use it as a return.
And we have seen that by currying we can define precise functions that improve readability and reuse.

But it will happens that a function as no reason to be reuse.
In this case we want to use it anonymally. It's what we call a lambda expression.

In this example the operation function take a function in parameter and will apply it to each number from 1 to x, the high limit parameter.

Let's try to use it for define three different functions: 
* sum : a function who will add each number from one to x
* sumSquare: a function who will do the sum of the 1 to x first square
* sumPeer: a function who will add the x first odd number

To complete these, let's use some lambda in parameter of "operation"

@[Implements the differents sum]({"stubs":["/src/main/scala/example/Lambda.scala"], "command":"example.TestLambda", "layout": "aside"})
