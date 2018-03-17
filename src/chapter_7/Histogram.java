package chapter_7;
/*
 * How to program Java
 * Fig 7.7 Histogram Printing program
 */

import javax.swing.*;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {50, 3, 15, 7, 11, 9, 13, 5, 17, 1};
		
		String output = "Element\tValue\tHistogram";
		
		//for each element in array oupup a bar in histogram
		for(int counter = 0; counter < array.length; counter++){
			output += "\n" + counter + "\t" + array[counter] + "\t";
			for(int stars = 0; stars <= array[counter]; stars++){
				output += "*";
			}
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
