package practiceCodes

object patternmatching extends App{
  //constants
  /*
  val x: Any ="Scala"
  val constants =x match {
    case 1 => "a number"
    case "Scala" => "The Scala"
    case true => "The Truth"
    case patternmatching =>"A Singeleton object"
  }

  //2---match anything
  // 2.1 wildcard
  val matchAnything =x match {
    case_ =>
  }

  //2.2 variales
  val matchVariable = x match {
    case something => s"I have found $something"
  }

  //3--tuples
  val aTuple =(1,2)
  val matchTuple =aTuple match{
    case (1,1) =>
      case(something,2) => s"i have found $something"
  }

  val nestedTuple =(1,(2,3))
  val matchNestedTuple =nestedTuple match {
    case (_, (2,v)) =>
  }


  //pattern matching can be nested!!
  //4-- case classes-constructor pattern
  //pattermatching can e nested with ccs as well
  val aList: MyList[Int] = Cons(1, Cons(2,Empty))
  val matchAlist =aList match {
    case Empty =>
    case Cons(head, Cons(subhead, aubtail))=>
  }


  //5--- list patterns
  val aStandardList = List(1,2,3,42)
  val StandardListMatching = aStandardList match {
    case List(1, _, _, _)=> //extractor -advanced
    case List(1,_*) => //list of aritrary length --advanced
    case 1 :: List(_) => //infix patterns
    case List(1,2,3) :+ 42 => // infix patterns

  }

  //6--type specifiers
  val unknown: Any =2
  val unknownMatch =unknown match {
    case list: List[Int]=> //explicit type specifier
    case _ =>
  }

  //7-- name binding
  val nameBindingMatch =aList match {
    case nonEmptyList @ Cons(_,_) => //name binding =>use the name later here
    case Cons(1, rest @ Cons(2, _)) => //name binjding inside nested patters
  }

  //8---multi patterns
  val multipattern =aList match {
    case Empty | Cons (0, _) => //compound pattern (multi patterns)
  }

  //9--if guards
  val secondElementSpecial = aList match {
    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>
  }
  */
  //Question.
  val numbers: List[Int] = List(1, 2, 3)
  val numberMatch =numbers match {
    case listOfStrings: List[String]=> "a list of strings"
    case listOfNumbers: List[Int]=>"a list of numers"
    case _=> ""
  }
  println(numberMatch)
}
