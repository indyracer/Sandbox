/*
 * How to Program Java
 * Chapter 2 Exercise 2.16
 */

package chapter_2;

import javax.swing.JOptionPane;

public class Chapter2Excercise2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		String xVal;
		String yVal;
		int x = 0;
		int y = 0;
		
		int result = 0;
		
		//Ask user for input
		xVal = JOptionPane.showInputDialog("Enter the first value: ");
		yVal = JOptionPane.showInputDialog("Enter the second value: ");
		
		//convert values from string to int
		x = Integer.parseInt(xVal);
		y = Integer.parseInt(xVal);
		
		//calculate and print sum
		result = x + y;
		JOptionPane.showMessageDialog(null, "The Sum of the values is " + result);
		
		//calculate and print difference
		result = x - y;
		JOptionPane.showMessageDialog(null, "The difference of the values is " + result);
		
		//calculate and print the product
		result = x * y;
		JOptionPane.showMessageDialog(null, "The product of the value is " + result);
		
		//calculate and print the quotient
		result = x / y;
		JOptionPane.showMessageDialog(null, "The quotient of the values is " + result);
		
		//terminate the program
		System.exit(0);

	}

}
