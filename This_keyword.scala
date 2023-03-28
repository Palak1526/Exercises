package practiceCodes

class This_keyword(i: Int) {
    // using this keyword
    def this(i: Int, j: Int) {
      this(i)
      println(i + " + " + j + " = " + {
        i + j
      })
    }
  }

  // Creating object
  object Addition {
    // Main method
    def main(args: Array[String]) {
      var add = new This_keyword(15, 12)
    }


}
