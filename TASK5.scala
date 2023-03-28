package practiceCodes

object task5 extends App {

  val triple = (1, 2, 3)
  val reversed = reverseTriple(triple)
  println(reversed) // prints (3, 2, 1)

  def reverseTriple(triple: (Int, Int, Int)): (Int, Int, Int) = triple match {
    case (a, b, c) => (c, b, a)
  }
}