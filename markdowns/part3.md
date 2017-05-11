# Recursion

Each time we talk about functional programming we speak about recursion.

The first question I ask myself is, why use recursion? 
I was bad in mathematics, and I hated recursions in it.

But if we can ask the question on the other side: 
_Why should we use loop?_

Loop are the consequency of iterative design: we go from one step to another. In the lower level language we have to define the number of step we want to do without a real proof that this number is the good one. 

With recursive call you can be sure that you will stop at the end, and don't need you to know exactly the number of step to do: whatever this number is you will do your operations at each step and stop when your end condition is hit.

But as we seen in the previous exercise, with high order function can use another function, and by extension herself.
So recursion is a core feature of a pure functional language.

Let's try to do a simple exercise to refresh our memory: implement a method who return a list filled with the x first elements of fibonacci suite.


@[Implement the fibonnaci suite]({"stubs":["/src/main/scala/example/Recursion.scala"], "command":"example.TestRecursion", "layout": "aside"})

But with this first example we keep all element in the stack, to rebuild the full list at the end.
We can do better by using tail recursion.

Tail recursion is a way to build recursion where we don't need to keep each step to return the complete result.
The last think you will do is to call this function.

Let's try to modify our fibonacci suite to be a tail recursion
@[Implement the fibonnaci as a tail recursion]({"stubs":["/src/main/scala/example/Recursion.scala"], "command":"example.TestRecursion", "layout": "aside"})

Moreover Scala compiler optimize tail recursion, so we really should use it.

A last tip, the @tailrec annotation DON'T FORCE TAIL RECURSION, it just verify during compile, that you are using tail rec.
