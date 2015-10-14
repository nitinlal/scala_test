package caseclasses

object TermTest {

  def main(args: Array[String]) {

    printSomething();

    val one = Fun("x", Var("x"))
    var two = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    println(isIdentifyFun(one));
    println(isIdentifyFun(two));
  }

  def printTerm(term: Term) {

    term match {
      case Var(n)    => println(n)

      case Fun(x, b) => println("Fun =>" + x + b)

      case App(f, v) => println("App =>" + f + v)
    }
  }

  def isIdentifyFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _                        => false
  }

  /**
   * function name (parameters) : return type = body
   */
  def printSomething(): Unit = println("what is up!");

}