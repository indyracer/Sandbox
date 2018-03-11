package chapter_7;
/*
 * How to program Java
 * Fig 7.5 Initialize array with the even integers from 2 to 20
 */

import javax.swing.*;

public class InitArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ARRAY_SIZE = 10;
		
		int array[]; //reference to int array
		
		array = new int[ARRAY_SIZE];  //allocate array
		
		//calculate value for each array element
		
		for(int counter = 0; counter < array.length; counter++){
			array[counter] = 2 + 2 * counter;			
		}
		
		String output = "Subscript\tValue\n";
		
		for(int counter = 0; counter < array.length; counter++){
			output += counter + "\t" + array[counter] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Initializing to Even Numbers from 2 to 20", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
		
		

	}

}
