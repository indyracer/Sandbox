package chapter_6;

/*
 * How to program Java
 * Fig 6.8 Roll a six-sided die 6000 times
 */

import javax.swing.*;


public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int freq1 = 0, freq2 = 0, freq3 = 0, freq4 = 0, freq5 = 0, freq6 = 0;
		int face;
		
		//summarize results
		for(int roll = 1; roll <= 6000; roll++){
			face = 1 + (int) (Math.random() * 6);
			
			//determine roll value and increment appropriate counter
			switch (face){
			case 1:
				++freq1;
				break;
				
			case 2:
				++freq2;
				break;
				
			case 3:
				++freq3;
				break;
				
			case 4:
				++freq4;
				break;
				
			case 5:
				++freq5;
				break;
				
			case 6:
				++freq6;
				break;
			}
		}
		
		JTextArea outputArea = new JTextArea();
		
		outputArea.setText("Face\tFrequency" + 
		"\n1\t" + freq1 + "\n2\t" + freq2 + "\n3\t" + freq3 + "\n4\t" + freq4 + "\n5\t" + freq5 + "\n6\t" + freq6);
		
		JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
