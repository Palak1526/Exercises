package practiceCodes

class AreaOfRectangle {

    // Variables
    var length = 20;
    var height = 40;

    // Method which gives the area of the rectangle
    def area() {
      var ar = length * height;
      println("Height of the rectangle is:" + height);
      println("Length of the rectangle is:" + length);
      println("Area of the rectangle is :" + ar);
    }
  }

  // singleton object
  object Main8 {
    def main(args: Array[String]) {

      // Creating object of AreaOfRectangle class
      var obj = new AreaOfRectangle();
      obj.area();
    }

}
object Exampleofsingleton
{

  // Variables of singleton object
  var str1 = "Welcome ! GeeksforGeeks";
  var str2 = "This is Scala language tutorial";

  // Method of singleton object
  def display()
  {
    println(str1);
    println(str2);
  }
}

// Singleton object with named as Main
object Main9
{
  def main(args: Array[String])
  {

    // Calling method of singleton object
    Exampleofsingleton.display();
  }
}
