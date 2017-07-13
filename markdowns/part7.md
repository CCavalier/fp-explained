# Let's think of the future

The last step of our journey across functionnal programming is in the future.

Future is another monadic type (I didn't talk about monads before, and I will not, don't be afraid) like the option type.
Like the option type, a future can or cannot return a value.  However, this time the value is returned after an unknown time.

It's a secure way to manage asynchronous events.

In a nutshell, our algorithms and our concepts are always based on the idea that all our resources are available when we need them. But, in the real world our resources are in queues, databases, and totally asynchronous.

Future allows us to compute our algorithms, assuming that we will receive our data. The future is computed is another thread.
Many function are available on futures, but sadly you cannot collect the data without synchronising the data.

## Tomato Shopping

This first example will show you the onComplete method. This method is called when the future has finished.
@[Wait a long time]({"stubs":["/src/main/scala/example/FutureType.scala"], "command":"example.FutureTest", "layout": "aside"})


The only drawback is that you cannot collect the data without waiting.
So let's try to complete the second method to return the value of the future squared.

```scala
Await.result  will wait for the return of the future
future.map(f)	will apply a function to the result of a future
```

## Using Tomatoes

The first thing that should be done after buying tomatoes is to assert that there are enougth tomatoes to make a pizza.

Grandma doesn't have to wait until Charlotte comes back from the courses to *know* what the next step is. This step can already be defined so that it can be executed as soon as Charlotte comes back from the courses.

To do such a thing, we can use the _map_ function. Map is a High Order Function that builds a new collection by applying a function to all elements of a _container_. Try to solve the exercise below:
 
@[Verify that there is enougth tomatoes for a pie (at least 4)]({"stubs":["/src/main/scala/example/FutureType.scala"], "command":"example.FutureTest2", "layout": "aside"})
