package practiceCodes
//case class
 case class Example (name:String, author:String)
  object Book
  {
    // Main method
    //no need to mention keyword"new"
    def main(args: Array[String])
    {
      var Book1 = Example("Data Structure and Algorithm", "cormen")
      var Book2 = Example("Computer Networking", "Tanenbaum")

      // Display strings
      println("Name of the Book1 is " + Book1.name);
      println("Author of the Book1 is " + Book1.author);
      println("Name of the Book2 is " + Book2.name);
      println("Author of the Book2 is " + Book2.author);
    }
}
