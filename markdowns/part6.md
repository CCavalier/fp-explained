# No More NPE

Does it never happen to you to spent hours to find where this NPE is coming from?

That will never happens anymore if you use options!

And, you know what, it exists in Java!

To keep it simple an option is a wrapper who accept two kind of content: 
* A content "value" who will be return each time that it's possible
* A "Nul" value who will be return when no correct value can be returned

In scala an option has no concrete type but two implementation :
```scala
Some(object)	wrapper for a non-null value
None			wrapper for a null value
```


You can initialize an option to a concrete value or to a null and it will return the right wrapper.
An option has two opposite methods: 
```scala
isEmpty		true if the option is a none
isDefined	true if the option has a value
```

So let's define the divide function who manage double division, with the case where the divisor is equal to 0
@[Discover our saviour]({"stubs":["/src/main/scala/example/OptionType.scala"], "command":"example.TestOption", "layout": "aside"})



In addition to provide us a nice wrapper for null values, option give to us two interesting methods:
```scala
getOrElse	option.getOrElse(12)	return the value of the option if it's defined, or a default value if it's empty
fold		option.fold(0)(x => x*x)	apply the function passed in parameter if the option is defined or a default value otherwise
```

Let's define the two functions :
* Secure divide: a function who call divide and return the value of the option if it's possible, 0 otherwise
* Weird divide: a function who call divide and return the square of the value of the division, or -1


@[More fancy functionnalities]({"stubs":["/src/main/scala/example/OptionType.scala"], "command":"example.TestOptionPartTwo", "layout": "aside"})
