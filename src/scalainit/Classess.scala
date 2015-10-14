

package scalainit

object Classess {
  def main(args: Array[String]) {

    val p = new Point(1, 2);
    p.move(3, 4);
    p.move(3, 4); 
    p.move(3, 4);
    
    
    println(p);

  }
}