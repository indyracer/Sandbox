package chapter_10;

/*
 * How to program Java
 * Fig 10.9 demonstrating String class methods replace, toLowerCase, toUpperCase, trim, toString and toCharArray
 */

import javax.swing.*;

public class StringMiscellaneous2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("GOOD BYE");
		String s3 = new String("   spaces    ");
		
		String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = \"" + s3 + "\"";
		
		//method replace
		output += "\n\nReplace 'l' with 'L' in s1: " + s1.replace('l', 'L');
		
		//test toLowerCase and toUpperCase
		output += "\n\ns1.toUpperCase() = " + s1.toUpperCase() +
				"\ns2.toLowerCase() = " + s2.toLowerCase();
		
		//test trim method
		output += "\n\ns3 after trim = \"" + s3.trim() + "\"";
		
		//test toString method
		output += "\n\ns1 = " + s1.toString();
		
		//test toCharArray
		char charArray[] = s1.toCharArray();
		output += "\n\ns1 as a character array = ";
		for(int count = 0; count < charArray.length; count++){
			output += charArray[count];
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Miscellaneous String Methods", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
