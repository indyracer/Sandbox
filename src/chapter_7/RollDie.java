package chapter_7;

/*
 * How to program java
 * Fig 7.8 Roll a six-sided die 6000 times
 */

import javax.swing.*;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int face, frequency[] = new int [7];
		
		//roll die 6000 times
		for(int roll = 1; roll <= 6000; roll++){
			face = 1 + (int)(Math.random() * 6);
			//use face value as subscript for frequency array
			++frequency[face];
		}
		
		String output = "Face\tFrequency";
		
		//append frequencies to string output
		for(face = 1; face < frequency.length; face++){
			output += "\n" + face + "\t" + frequency[face];
		}
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
