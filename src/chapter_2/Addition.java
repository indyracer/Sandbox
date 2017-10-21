package chapter_2;
/*
 * Java How to Program
 * Fig 2.9
 * An Addition program
 */

//Java extension packages

import javax.swing.JOptionPane;


public class Addition {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String firstNumber;  //first string entered by user
			String secondNumber;  //second string entered by user
			int number1;  //first number to add
			int number2;  //second number to add
			int sum;
			
			//read first number from user as a String
			firstNumber = JOptionPane.showInputDialog("Enter first number");
			
			//read second number from user as a String
			secondNumber = JOptionPane.showInputDialog("Enter second number");
			
			//convert strings to int
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
			
			//add the numbers
			sum = number1 + number2;
			
			//display the results
			JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
			
			System.exit(0);
			
	}

}
