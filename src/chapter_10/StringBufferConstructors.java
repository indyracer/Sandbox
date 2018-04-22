package chapter_10;
/*
 * How to Program Java
 * Fig. 10.12 Demonstrate StringBuffer constructors
 */

import javax.swing.*;

public class StringBufferConstructors {

	public static void main(String[] args) {
		StringBuffer buffer1, buffer2, buffer3;
		
		buffer1 = new StringBuffer();
		buffer2 = new StringBuffer(10);
		buffer3 = new StringBuffer("hello");
		
		String output = "buffer1 = \"" + buffer1.toString() + "\"" +
		"\nbuffer2 = \"" + buffer2.toString() + "\"" +
				"\nbuffer3 = \"" + buffer3.toString() + "\"";
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating StringBuffer Class Constructors", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
