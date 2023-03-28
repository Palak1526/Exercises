package practiceCodes
/* Write a Scala program to represent following items:
"T-Shirt", "Medium", 10.99
"Polo-Shirt", "Large", 4.99
"Vest", "Small", 5.99
"T-Shirt", "Small", 4.99
"T-Shirt", "Small", 4.99

You can use any data structure to store above items.

 */





object task4 {

    def main(args: Array[String]) {


        case class Item(name: String, size: String, price: Double)

        val items = List(
            Item("T-Shirt", "Medium", 10.99),
            Item("Polo-Shirt", "Large", 4.99),
            Item("Vest", "Small", 5.99),
            Item("T-Shirt", "Small", 4.99),
            Item("T-Shirt", "Small", 4.99)
        )

        items.foreach { item =>
            println(s"${item.name.toUpperCase} is priced at $$${item.price} for the ${item.size} size.")
        }
    }
}