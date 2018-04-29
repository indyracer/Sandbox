package chapter_10;
/*
 * How to program Java
 * Fig 10.19 Non-static methods of class Character from the java.lang package
 */

import javax.swing.*;

public class OtherCharMethods {

	public static void main(String[] args) {
		Character c1, c2;
		
		c1 = new Character('A');
		c2 = new Character('a');
		
		String output = "c1 = " + c1.charValue() +
				"\nc2 = " + c2.charValue() +
				"\n\nhash code for c1 = " + c1.hashCode() +
				"\nhash code for c2 = " + c2.hashCode();
		
		if(c1.equals(c2)){
			output += "\n\nc1 and c2 are equal";
		} else{
			output += "\n\nc1 and c2 are not equal";
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Non-Static Character Methods", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
