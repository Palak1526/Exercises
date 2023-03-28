package practiceCodes
//TYPES OF INHERITANCE
// Base class
class Single_inheritance {
    var Name: String = "Ankita"
  }
  // Derived class
  // Using extends keyword
  class Child extends Single_inheritance {
    var Age: Int = 22

    // Method
    def details() {
      println("Name: " + Name);
      println("Age: " + Age);
    }
  }

  object Main5 {

    // Driver code
    def main(args: Array[String]) {

      // Creating object of the derived class
      val ob = new Child();
      ob.details();
    }

}
//multilevel Inheritance
class Parent
{
  var Name: String = "Soniya"
}

// Derived from parent class
// Base class for Child2 class
class Child1 extends Parent
{
  var Age: Int = 32
}

// Derived from Child1 class
class Child2 extends Child1
{
  // Method
  def details(){
    println("Name: " +Name);
    println("Age: " +Age);
  }
}
object Main6
{

  // Derived Code
  def main(args: Array[String])
  {

    // Creating object of the derived class
    val ob = new Child2();
    ob.details();
  }
}
// Hierarchical inheritance

// Base class
class Parent_class
{
  var Name1: String = "Siya"
  var Name2: String = "Soniya"
}

// Derived from the parent class
class Child_class extends Parent_class
{
  var Age: Int = 32
  def details1()
  {
    println(" Name: " +Name1);
    println(" Age: " +Age);
  }
}

// Derived from Parent class
class Child_class2 extends Parent_class
{
  var Height: Int = 164

  // Method
  def details2()
  {
    println(" Name: " +Name2);
    println(" Height: " +Height);
  }
}

object Main7
{

  // Driver code
  def main(args: Array[String])
  {

    // Creating objects of both derived classes
    val ob1 = new Child_class();
    val ob2 = new Child_class2();
    ob1.details1();
    ob2.details2();
  }
}

