package chapter_10;

/*
 * How to program Java
 * Fig 10.2 Program demonstrates the length, charAt and getChars methods of String Class
 * 
 * NOTE: Method getChars requires a starting point and ending point in the String.
 * Starting point is the actual subscript from which copying starts. Ending point is the one past the subscript at which copying stops
 */

import javax.swing.*;

public class StringMicellaneous {

	public static void main(String[] args) {
		String s1, output;
		char charArray[];
		
		s1 = new String("hello there");
		charArray = new char[5];
		
		//output the string
		output = "s1 = " + s1;
		
		//test length method
		output += "\nLength of s1: " + s1.length();
		
		//loop thru characters in s1 and display reversed
		output += "\nThe String reversed is: ";
		
		for(int count = s1.length() - 1; count >= 0; count--){
			output += s1.charAt(count) + " ";
		}
		
		//copy characters from string into a char array
		s1.getChars(0, 5, charArray, 0);
		output += "\nThe character array is: ";
		
		for(int count = 0; count < charArray.length; count++){
			output += charArray[count];
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String Class Constructors", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		

	}

}
