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
  def greetings (string : String, f:(String) => String)= {
    if(string.isEmpty){
      "Who are you?"
    }else{
      f(string)
    }
  }

  /**
    * should say hello if string is empty, else ask "Who are you"
    */
  def helloOrAskName(string: String): String = {
      greetings(string, hello)
  }

}