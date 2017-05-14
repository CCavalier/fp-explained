# Let's think the future

Last step of our travel accross functionnal programming is in the future.

Future are another monadic type (I didn't talk about monad before, and I will not, don't be afraid) like the option type.
As the option type a future can or cannot return a value, but this time, a future should return a value after an unknown time.

It's a secure way to manage asynchronous events.

To put it in a nutshell, our algorithms and our conception is always based on the idea that all our resources are available when we need them. But, in the real world our resources are queues, databases ... and totally asynchronous.

Future allows us to compute our algorithms, assuming that we will receive our data: the future is compute is another thread.
Many function are available on futures, but, sadly you cannot collect the data without synchonising the datas.


This first example will show you the on complete method: this method is called when the future has finished
@[Wait a long time]({"stubs":["/src/main/scala/example/FutureType.scala"], "command":"example.FutureTest", "layout": "aside"})


The only drawback is to cannot collect the data without waiting.
So let try to complete the second method to return the square of value of the future

```scala
Await.result 	will wait the return of the future
future.map(f)	will apply a function to the result of a future
```

@[Get the value after a long time]({"stubs":["/src/main/scala/example/FutureType.scala"], "command":"example.TestFutureBis", "layout": "aside"})