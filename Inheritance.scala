package practiceCodes

class Inheritance {
    var Name: String = "Ankita"
  }

  // Derived class
  // Using extends keyword
  class Inheritance2 extends Inheritance {
    var Article_no: Int = 130

    // Method
    def details() {
      println("Author name: " + Name);
      println("Total numbers of articles: " + Article_no);
    }
  }

  object Main4 {

    // Driver code
    def main(args: Array[String]) {

      // Creating object of derived class
      val ob = new Inheritance2();
      ob.details();
    }

}
