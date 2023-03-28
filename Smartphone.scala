package practiceCodes

class Smartphone
{

    // Class variables
    var number: Int = 16
    var nameofcompany: String = "Apple"

    // Class method
    def Display() {
      println("Name of the company : " + nameofcompany);
      println("Total number of Smartphone generation: " + number);
    }
  }

  object Main {

    // Main method
    def main(args: Array[String]) {

      // Class object
      var obj = new Smartphone();
      obj.Display();
    }
}
//var obj = new Dog();
//initiating a object
class Dog(name:String, breed:String, age:Int, color:String )
{
  println("My name is:" + name + " my breed is:" + breed);
  println("I am: " + age + " and my color is :" + color);

}
object Main2
{

  // Main method
  def main(args: Array[String])
  {

    // Class object
    var obj = new Dog("tuffy", "papillon", 5, "white");
  }
}

//creating anonymous oject

class GFG
{
  def display()
  {
    println("Welcome! GeeksforGeeks");
  }
}
object Main3{

  // Main method
  def main(args: Array[String]) {

    // Creating Anonymous object of GFG class
    new GFG().display();
  }

}
