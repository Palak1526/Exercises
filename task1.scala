package practiceCodes

object task1
{

  def main(args: Array[String])
  {

    val item1 = Tuple3("T-Shirt", "Medium", 10.99)
    val item2 = Tuple3("Polo-Shirt", "Large", 4.99)
    val item3 = Tuple3("Vest", "Small", 5.99)
    val item4 = Tuple3("T-Shirt", "Small", 4.99)
    val item5 = Tuple3("T-Shirt", "Small", 4.99)

    val shoppingBasket = List(item1, item2, item3, item4, item5)
    shoppingBasket.foreach {
      case item if item._1 == "T-Shirt" =>
        println(s"${item._1.toUpperCase()} is priced at $$${item._3} for the ${item._2} size.")
      case item =>
        println(s"${item._1.toLowerCase()} is priced at $$${item._3} for the ${item._2} size.")
    }
  }


}
