package practiceCodes

object anonymous_function extends App {
  //anonymous function (Lambda)
  val doubler: Int => Int = (x: Int) => x * 2

  // multiple parameter in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //no parameter
  val justDoSomething: () => Int = () => 3

  //careful
  println(justDoSomething) //function itself
  println(justDoSomething()) //call

  //curly braces with lambdas
  val stringToInt = { (str: String) =>

    str.toInt
  }

  //Moar syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 //equivalent to x=>x+1
  val niceAdder: (Int, Int) => Int = _ + _ //equivalent to (a+b) => a+b


  /*
1. MyList: replaces all function X CALLS With LAMBDAS
2. Rewrite the "special" adder as an anonymous function
 */
  //only made changes in the function section
  /*
  println(ListOfIntegers.map(elem => elem * 2).toString)
  println(ListOfIntegers.filter(elem => elem % 2 == 0).toString)

  println(ListOfInteger ++ anotherOfIntegers).toString
  println(ListOfIntegers.flatMap(elem => new Cons(elem, new Cons(elem + 1, Empty))).toString)

  println(cloneListOfIntegers == listOfIntegers)
}
*/
  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
