package lecture5

object SelfOption extends App {
  val o1: Option[Int] = None
  val o2: Option[Int] = Some(10)
  val o21: Option[Int] = Some(5)
  val o3 =Option(null)
  /*  println(o1.isDefined) //false 'cause None
    println(o2.isDefined) // true 'cause Some()
    println(o2.nonEmpty) // true 'cause Some()
    println(o2.isEmpty) // false 'cause Some() | notNone
    println(o3.isEmpty) //true 'cause None-*/
  val v1 = o1.getOrElse(o21.getOrElse(0))//
  println(v1)

}


