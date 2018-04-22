package chapter_10;

/*
 * How to program Java
 * Fig 10.14 Demonstrating StringBuffer charAt, setCharAt, getChars, reverse methods
 */

import javax.swing.*;

public class StringBufferChars {

	public static void main(String[] args) {
		StringBuffer buffer= new StringBuffer("hello there");
		
		String output = "buffer = " + buffer.toString() +
				"\nCharacter at 0: " + buffer.charAt(0) +
				"\nCharacter at 4: " + buffer.charAt(4);
		
		char charArray[] = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		
		output += "\n\nThe characters are: ";
		
		for(int count = 0; count < charArray.length; count++){
			output += charArray[count];
		}
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		output += "\n\nbuffer = " +buffer.toString();
		
		buffer.reverse();
		output += "\n\nbuffer reversed = " + buffer.toString();
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating StringBuffer Character Methods", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);


	}

}
