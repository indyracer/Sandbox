package chapter_5;

/*
 * How to Program Java
 * Exercise 5.8  Factorials and JTextArea
 */

import javax.swing.*;

public class Chapter5Exercise58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create JTextArea to display results
		JTextArea outputArea = new JTextArea(6,2);
		//add scroll to text area
		JScrollPane scroll = new JScrollPane(outputArea);
		
		String output;
		
		output = "N\tFractorial\n";
		
		int fractorial = 1;
		
		//for loop to iterate over integers 1 - 5
		for(int i = 1; i <= 20; i++){
			//set fractorial back to 1
			fractorial = 1;
			//inner loop to iterate through individual numbers
			
			for(int j = 1; j <= i; j++){
				fractorial = fractorial * j;
				
			}
			output += i + "\t" + fractorial + "\n";
		}
		//place results in the JTextArea
		outputArea.setText(output);
		
		//place JTextArea in JOptionPane
		JOptionPane.showMessageDialog(null, scroll, "Fractorial Tables", JOptionPane.INFORMATION_MESSAGE);
	}

}
