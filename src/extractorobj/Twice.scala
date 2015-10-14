package extractorobj
/**
 * This is also an example of an extractor
 * they also do not need the new operator to be instantiated
 */
object Twice {

  def apply(x: Int): Int = x * 2
  //notice Option takes some or none 
  def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None;
}