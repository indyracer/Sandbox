package chapter_10;
/*
 * How to program Java
 * Fig 10.6 demonstrates the String class index methods
 */

import javax.swing.*;

public class StringIndexMethods {

	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		
		//indexOf to locate a character in a string
		String output = "'c' is located at index " + letters.indexOf('c');
		
		output += "\n'a' is located at index "+ letters.indexOf('a', 1);
		
		output += "\n'$' is located at index " + letters.indexOf('$');
		
		//lastIndexOf to find the character in a string
		output += "\n\nLast 'c' is located at index " + letters.lastIndexOf('c');
		
		output += "\nLast 'a' is located at index " + letters.lastIndexOf('a', 25);
		
		output += "\n Last '$' is located at index " + letters.lastIndexOf('$');
		
		//test indexOf to locate a substring in a string
		output += "\n\n\"def\" is located at index " + letters.indexOf("def");
		
		output += "\n\"def\" is located at index " + letters.indexOf("def", 7);
		
		output += "\n\"hello\" is located at index " + letters.indexOf("hello");
		
		//test lastIndexOf to find substring in a string
		output += "\n\nLast \"def\" is located at index" + letters.lastIndexOf("def");
		
		output += "\nLast \"def\" is located at index of " + letters.lastIndexOf("def", 25);
		
		output += "\nLast \"hello\" is located at index of " + letters.lastIndexOf("hello");
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String Class \"index\" Methods", JOptionPane.INFORMATION_MESSAGE);;
		
		System.exit(0);

	}

}
