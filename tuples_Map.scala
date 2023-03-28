package practiceCodes

object tuples_Map extends App{
  //tuples= finite ordered "lists"
  val aTuple =(2,"hello,scala") //tuple2[Int,String]=(int,string)
  println(aTuple._1)//2
  println(aTuple.copy(_2="goodBye java"))
  println(aTuple.swap)//("hello,scala",2)

  //maps--keys->values
  val aMap: Map[String,Int]=Map()

  val phonebook =Map(("jim",555),"Daniel"->789)
  //a->b is sugar for (a,b)
  println(phonebook)

  //map ops
  println(phonebook.contains("jim"))
  println(phonebook("mary"))

  //add a pairing
  val newPairing="Mary" -> 678
  val newPhonebook =phonebook + newPairing
  println(newPhonebook)
  //functionals on maps
  //map, flatmap, filter
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterkeys
  println(phonebook.view.filterKeys(x => x.startsWith("J")))
  //mapValues
  /*
  println(phonebook.view.mapValues(number=> "0245-" + number))
  //conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel",555)).toMap)
  val names= List("bob","james","angela","mary","daniel","jim")
  println(names.groupBy(name =>name.charAt(0)))
*/

}
