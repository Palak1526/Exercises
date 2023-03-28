package practiceCodes
/* Write a function cycle: (Int, Int, Int) => (Int, Int, Int) that takes a triple of integers and “cycles through them”,
moving the first component to the end and the other two forward,
cycle((1,2,3)) = (2,3,1)

 */

object task7 extends App{

  val triple = (1, 2, 3)
  val cycled = cycle(triple)
  println(cycled)

  def cycle(triple: (Int, Int, Int)): (Int, Int, Int) = triple match {
    case (a, b, c) => (b, c, a)
  };



}
