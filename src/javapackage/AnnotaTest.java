package javapackage;
import java.io.IOException;

@Source(url = "test.com", mail = "test@test.com")
public class AnnotaTest {

	/**
	 * 
	 * @param args
	 *            notice the seem less integration of scala into java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in = new Reader(args[0]);
		try {
			int c = in.read();
			while (c != -1) {
				System.out.println("Value from file" + c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
