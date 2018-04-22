package chapter_10;
/*
 * How to program Java
 * Fig 10.8 demonstrate the String class concat methods
 * NOTE: concat method returns a new string object.  It does not modify an existing object invoked by concat method
 */

import javax.swing.*;

public class StringConcatenation {

	public static void main(String[] args) {
		String s1 = "Happy";
		String s2 = "Birthday";
		
		String output = "s1 = " + s1 + "\ns2 = " + s2;
		
		output += "\n\nResult of s1.concat(s2) = " + s1.concat(s2);
		
		output += "\nResult of s2.concat(s1) = " + s2.concat(s1);
		
		output += "\ns1 after concat = " + s1;
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String Concat Method", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
