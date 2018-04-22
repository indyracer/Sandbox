package chapter_10;
/*
 * How to program Java
 * Fig 10.13 demonstrates the length and capacity methods of StringBuffer
 */

import javax.swing.*;

public class StringBufferCapLen {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello, how are you?");
		
		String output = "buffer = " + buffer.toString() + "\nlength = " + buffer.length() +
				"\ncapacity = " + buffer.capacity();
		
		buffer.ensureCapacity(75);
		output += "\n\nNew capacity = " + buffer.capacity();
		
		buffer.setLength(10);
		output += "\n\nNew length = " + buffer.length() +
				"\nbuffer = " + buffer.toString();
		
		JOptionPane.showMessageDialog(null, output, "StringBuffer length and capacity Methods", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
