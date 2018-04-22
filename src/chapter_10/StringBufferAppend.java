package chapter_10;
/*
 * How to program java
 * Fig 10.15 demonstrates the append methods of StringBuffer class
 */

import javax.swing.*;

public class StringBufferAppend {

	public static void main(String[] args) {
		Object o = "hello";
		String s = "good bye";
		char charArray[] = {'a', 'b', 'c', 'd', 'e','f'};
		char c = 'Z';
		boolean b = true;
		int i = 7;
		long l = 10000000;
		float f = 2.5f;
		double d = 33.333;
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(o);
		buffer.append(" ");
		buffer.append(s);
		buffer.append(" ");
		buffer.append(charArray, 0, 3);
		buffer.append(" ");
		buffer.append(b);
		buffer.append(" ");
		buffer.append(c);
		buffer.append(" ");
		buffer.append(i);
		buffer.append(" ");
		buffer.append(l);
		buffer.append(" ");
		buffer.append(f);
		buffer.append(" ");
		buffer.append(d);
		
		JOptionPane.showMessageDialog(null, "buffer = " + buffer.toString(), "Demonstrating StringBuffer append Methods", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
