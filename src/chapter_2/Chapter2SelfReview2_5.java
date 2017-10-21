package chapter_2;
/*
 * How to Program java
 * Chapter 2 Self Review exercise 2.5
 */

import javax.swing.JOptionPane;

//This program will calculate the product of 3 integers

public class Chapter2SelfReview2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		String xVal;
		String yVal;
		String zVal;
		
		//Prompt user to enter values
		xVal = JOptionPane.showInputDialog("Please enter the first value: ");
		yVal = JOptionPane.showInputDialog("Please enter the second value: ");
		zVal = JOptionPane.showInputDialog("Please enter the third value: ");
		
		//convert string to int
		x = Integer.parseInt(xVal);
		y = Integer.parseInt(yVal);
		z = Integer.parseInt(zVal);
		
		//compute the product of the three variables
		result = x * y * z;
		
		//display the result
		JOptionPane.showMessageDialog(null, "The Product of the 3 variables is " + result);
		
		//terminate the program
		System.exit(0);
	}

}
