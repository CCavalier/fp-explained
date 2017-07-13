# Dummy example of lambda

Until now we have used a lot of functions.
We specified that we want them to be pure (no side effect).
We have seen that we can pass it as a parameter to other functions or use it in a return.
Also, we have seen that by currying we can define precise functions that improve readability and reuse.

However, you will run into a function has no reason to be reused.
In this case, we want to use it anonymously. This is what we call a lambda expression.

In this example, the operation function takes a function as a parameter and will apply it to each number from 1 to x, where x is the high limit parameter.

Let's try to use it to define three different functions: 
* sum : a function to add each number from 1 to x
* sumSquare: a function to add each squared number from 1 to x
* sumPeer: a function to add the x first odd numbers

To complete these, let's use lambdas as the parameter of "operation"

@[Implement different sums]({"stubs":["/src/main/scala/example/Lamdba.scala"], "command":"example.TestLambda", "layout": "aside"})
