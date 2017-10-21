package chapter_4;


import java.text.DecimalFormat;

/*
 * How to Program Java
 * Class average program with counter controlled repetition
 * Figure 4.6 and 4.9
 */

import javax.swing.JOptionPane;

public class Average1 {
	
	public static void main(String args[]){
		//variables
		int total, gradeCounter, gradeValue;
		double average;
		String input;
		
		//Initialization Phase
		total = 0;
		gradeCounter = 0;
				
		//Processing Phase
		input = JOptionPane.showInputDialog("Enter Integer Grade, -1 to Quit");
		
		gradeValue = Integer.parseInt(input);
		
		while(gradeValue != -1){
			//prompt input and read grade from user
			//input = JOptionPane.showInputDialog("Enter a grade:  ");
			//parse grade to int
			//gradeValue = Integer.parseInt(input);
			
			//running grade total
			total = total + gradeValue;
			
			//increment counter
			gradeCounter++;
			
			input = JOptionPane.showInputDialog("Enter Integer Grade, -1 to Quit");
			
			gradeValue = Integer.parseInt(input);
		}
		
		//Termination Phase
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
		//test for division by 0
		if(gradeCounter != 0){
			average = (double) total / gradeCounter;
			JOptionPane.showMessageDialog(null, "Class Average is " + twoDigits.format(average), "Class Average", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"No grades were entered", "Class Average", JOptionPane.ERROR_MESSAGE);
		}
		
		//average = total / gradeCounter; //performs integer division
		
		//display average of the grades
		//JOptionPane.showMessageDialog(null, "Class average is " + average,"Class Average", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
