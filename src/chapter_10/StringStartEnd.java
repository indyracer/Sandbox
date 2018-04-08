package chapter_10;

/*
 * How to program Java
 * Fig 10.4 Demonstrates the methods startsWith and endsWith of String class
 */

import javax.swing.*;

public class StringStartEnd {

	//test String comparison methods for beginning and end of String
	public static void main(String[] args) {
		String strings[] = {"started", "starting", "ended", "ending"};
		String output = "";

		//test method startsWith
		for(int count = 0; count < strings.length; count++){
			if(strings[count].startsWith("st")){
				output += "\"" + strings[count] + "\"starts with \"st\"\n"; 
			}

			output += "\n";
		}

		//test method startsWith starting from position 2 of string
		for(int count = 0; count < strings.length; count++){
			if(strings[count].startsWith("art", 2)){
				output += "\"" + strings[count] + "\" starts with \"art\" at postion 2\n";			
			}
			output += "\n";	
		}

		//test method endsWith
		for (int count = 0; count < strings.length; count++){

			if(strings[count].endsWith("ed")){
				output += "\"" + strings[count] + "\" ends with \"ed\"\n";
			}

			output += "";
		}

		JOptionPane.showMessageDialog(null, output, "Demonstrating String Class Comparisons", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}


}
