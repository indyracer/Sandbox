package chapter_10;
/*
 * How to program Java
 * Fig 10.10 demonstrating String class valueOf method
 */

import javax.swing.*;

public class StringValueOf {

	public static void main(String[] args) {
		char charArray[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean b = true;
		char c = 'Z';
		int i = 7;
		long l = 10000000;
		float f = 2.5f;
		double d = 33.333;
		
		Object o = "hello"; //assing to an Object reference
		
		String output;
		
		output = "char array = " + String.valueOf(charArray) + 
				"\nboolean = " +String.valueOf(b) + 
				"\nchar = " + String.valueOf(c) + 
				"\nint = " + String.valueOf(i) + 
				"\nlong = " + String.valueOf(l) + 
				"\nfloat = " + String.valueOf(f) + 
				"\ndouble = " + String.valueOf(d) +
				"\nObject = " + String.valueOf(o);
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String ValueOf Method", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}



}
