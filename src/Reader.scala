

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

class Reader(fname: String) {
  private val in = new BufferedReader(new FileReader(fname));
  @throws(classOf[IOException])
  def read = in.read();
}