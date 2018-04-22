package chapter_10;
/*
 * How to Program Java
 * Fig 10.7 demonstrating String class substring methods
 */

import javax.swing.*;

public class SubString {

	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		
		String output = "Substring from index 20 is \"" + letters.substring(20) + "\"";
		
		output += "\nSubstring from index 0 to 6 is \"" + letters.substring(0, 6) + "\"";
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String Class Substring Methods", JOptionPane.INFORMATION_MESSAGE);;
		
		System.exit(0);

	}

}
