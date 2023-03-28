package practiceCodes
// Creating a primary constructor
// with parameter-list
class Constructor(Aname: String, Cname: String, Particle: Int) {

    def display() {
      println("Author name: " + Aname);
      println("Chapter name: " + Cname);
      println("Total published articles:" + Particle);
    }
  }

  object Primary_constructor {
    def main(args: Array[String]) {

      // Creating and initializing
      // object of GFG class
      var obj = new Constructor("Ankita", "Constructors", 145);
      obj.display();
    }


}
// Primary constructor
class P_constructor( Aname: String, Cname: String)
{
  var no: Int = 0;;
  def display()
  {
    println("Author name: " + Aname);
    println("Chapter name: " + Cname);
    println("Total number of articles: " + no);

  }

  // Auxiliary Constructor
  def this(Aname: String, Cname: String, no:Int)
  {

    // Invoking primary constructor
    this(Aname, Cname)
    this.no=no
  }
}

object Main11
{
  def main(args: Array[String])
  {

    // Creating object of GFG class
    var obj = new P_constructor("Anya", "Constructor", 34);
    obj.display();
  }
}

