package caseclasses

object mainObj {
  def main(args: Array[String]) {

    var x = Var("x"); //case classes dont need new
    println(x.name);
  }
}