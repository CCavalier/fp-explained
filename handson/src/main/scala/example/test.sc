
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
