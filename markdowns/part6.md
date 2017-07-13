# No More NPE

Has you ever spent hours trying to find where a NPE is coming from?

This will never happen again if you use options! (🎉 they exist in Java 🎉)

To keep it simple, an option is a wrapper which accepts two kinds of content: 
* A content "value" which will be returned each time when it's possible
* A "null" value which will be return when no correct value can be returned

In Scala, an option has no concrete type, but two implementations:
```scala
Some(object)	wrapper for a non-null value
None			wrapper for a null value
```


You can initialize an option to a concrete value or to null and it will return the right wrapper.
An option has two opposite methods: 
```scala
isEmpty		true if the option is a none
isDefined	true if the option has a value
```

So let's define the divide function which manages double division with the case where the divisor is equal to 0
@[Discover our saviour]({"stubs":["/src/main/scala/example/OptionType.scala"], "command":"example.TestOption", "layout": "aside"})


In addition to providing us with a nice wrapper for null values, option gives us two interesting methods:
```scala
getOrElse	option.getOrElse(12)	return the value of the option if it's defined, or a default value if it's empty
fold		option.fold(0)(x => x*x)	apply the function passed in parameter if the option is defined or has a default value otherwise
```

Let's define the two functions:
* Secure divide: a function which calls divide and returns the value of the option if it's possible, 0 otherwise
* Weird divide: a function which calls divide and returns the value of the division squared, or -1


@[More fancy functionalities]({"stubs":["/src/main/scala/example/OptionType.scala"], "command":"example.TestOptionPartTwo", "layout": "aside"})
