package chapter_7;

/*
 * how to program java
 * Fig 7.4 Initializing an array with a declaration
 */

import javax.swing.*;

public class InitArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializer list specifies number of elements and
		//value for each column
		
		int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		String output = "Subscript\tValue\n";
		
		//append each array element to String output
		for(int counter = 0; counter < array.length; counter++){
			output += counter + "\t" + array[counter] + "\n";
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Initializing an Array with a Declaration", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
