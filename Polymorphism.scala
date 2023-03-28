package practiceCodes

class Polymorphism {

    // This is the first function with the name fun
    def func(a: Int) {
      println("First Execution:" + a);
    }

    // second function with the  same name fun
    def func(a: Int, b: Int) {
      var sum = a + b;
      println("Second Execution:" + sum);
    }

    // first function with the  same name fun
    def func(a: Int, b: Int, c: Int) {
      var product = a * b * c;
      println("Third Execution:" + product);
    }
  }

  // Creating object
  object Main12 {
    // Main method
    def main(args: Array[String]) {
      // Creating object of example class
      var ob = new Polymorphism();
      ob.func(120);
      ob.func(50, 70);
      ob.func(10, 5, 6);
    }


}
