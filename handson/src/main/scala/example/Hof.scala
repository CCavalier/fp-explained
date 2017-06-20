package example



object Hof{

  /**
    * return hello to someone
    */
  def hello (string: String): String = {
    "Hello, "+string
  }

  /**
    * if string is not empty say something, else ask "Who are you"
   */
  def greetings (name: String, f: String => String): String={
    if(name.isEmpty) "Who are you?" // here we could use pattern matching, but we will see this later
    else f(name)
  }


  /**
    * should say hello if string is empty, else ask "Who are you"
    */
  def helloOrAskName(string: String): String = {
      greetings(string, hello)
  }

}