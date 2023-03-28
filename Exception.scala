package practiceCodes

object Exception {

    // Main method
    def main(args: Array[String]) {

      // Try clause
      try {
        // Dividing a number
        val result = 11 / 0
      }

        // Catch clause
      catch {
        // Case statement
        case x: ArithmeticException => {

          // Display this if exception is found
          println("Exception: A number is not divisible by zero.")
        }
      }
    }

}

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

// Creating object
object Arithmetic
{

  // Main method
  def main(args: Array[String])
  {

    // Try clause
    try
    {
      // Creating object for FileReader
      val t = new FileReader("input.txt")
    }

      // Catch clause
    catch
    {

      // Case statement-1
      case x: FileNotFoundException =>
      {
        // Displays this if the file is
        // missing
        println("Exception: File missing")

      }

      // Case statement-2
      case x: IOException   =>
      {

        // Displays this if input/output
        // exception is found
        println("Input/output Exception")

      }
    }
  }
}
