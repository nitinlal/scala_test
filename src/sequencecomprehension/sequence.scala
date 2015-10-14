package sequencecomprehension

object sequence {

  def main(args: Array[String]) {
       even(20, 88);
  }

  def even(from: Int, to: Int): Unit = 
    for (i <- List.range(from, to)) if (i % 2 == 0) println(i);
}