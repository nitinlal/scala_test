package classof

object ClassReprTest {
  abstract class Bar {
    type T <: AnyRef

    // concrete function that uses an abstract property
    def bar(x: T) {
      println(x.getClass)
    }
  }

  def main(args: Array[String]) {

    new Bar {
      type T = Array[String]
      val x: T = args

    }.bar(args)
  }
}