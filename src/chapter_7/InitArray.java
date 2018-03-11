package chapter_7;

/*
 * How to Program Java
 * fig 7.3 Creating an Array
 */

import javax.swing.*;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]; //declare reference to an array
		array = new int [10];  //dynamically allocate array
		
		String output = "Subscript\tValue\n";
		
		//append each array element's value to String output
		for(int counter = 0; counter < array.length; counter++){
			output += counter + "\t" + array[counter] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Initializing an Array of int Values", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
