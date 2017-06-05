# Recursion

One does not simply talk about functional programming without saying the word "recursion".

The first question I asked myself is, why use recursion?
I was bad in mathematics, and I hated coming across recursion.

But we can ask the question the other way round: 
_Why should we use loops?_

Loops are the consequence of iterative design: we go from one step to another. In the lower level languages we have to define the number of steps we want to run without any real proof that this number is the right one.

With recursive calls you can be sure that you will stop at the end, and you won't need to know the exact number of steps it will take: whatever this number is you will perform your operations at each step and stop when your end condition is hit.

But as seen in the previous exercise, a high order function can use another function and, by extension, itself.
So recursion is a core feature of a pure functional language.

Let's try to do a simple exercise to refresh our memory: implement a method which returns a list filled with the x first elements of the Fibonacci sequence.



@[Implement the Fibonacci sequence]({"stubs":["/src/main/scala/example/Recursion.scala"], "command":"example.TestRecursion", "layout": "aside"})

But with this first example we keep every element in the stack, to rebuild the full list at the end.
We can do better by using tail recursion.

Tail recursion is a way to build recursion where we don't need to keep each and every step in order to return the final result.
The last thing you will do is call this function. The common way to do that is to use an accumulator.

Let's try to modify our Fibonacci sequence to be a tail recursion

An example of tail rec:
```scala
def factorial(n: Int): Int = {
  def iter(x: Int, result: Int): Int =
    if (x == 0) result
    else iter(x - 1, result * x)

  iter(n, 1)
}
```

@[Implement Fibonnaci as a tail recursion]({"stubs":["/src/main/scala/example/Recursion.scala"], "command":"example.TestTailRecursion", "layout": "aside"})

Moreover, the Scala compiler optimizes tail recursion, so we should definitely use it.

One last tip, the @tailrec annotation DOESN'T FORCE TAIL RECURSION, it just verifies, during compililation, that you are using tail rec.
