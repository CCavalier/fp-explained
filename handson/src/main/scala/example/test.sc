
val x : String = "Hello, Maybe?"

var maybe = Option(x)

var maybeNot = Option(null)

maybe.getClass

maybeNot.getClass

val alwaysTrue = maybe.isDefined!=maybe.isEmpty

/*
def sortAlphabetically(list: List[String]):List[String]= {
  sort(_<_, list);
}

def sortReverseAlphabetically(list: List[String]):List[String]={
  sort(_>_, list);
}

def sortIncreasingSize(list: List[String]):List[String]={
  sort(_.size<_.size, list);
}*/

def factorial(n: Int): Int = {
  def iter(x: Int, result: Int): Int =
    if (x == 0) result
    else iter(x - 1, result * x)

  iter(n, 1)
}

factorial(3)
