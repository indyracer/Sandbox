package chapter_2;
/*
 * Java How to Program
 * Fig. 2.20
 * Compare integers using if structures, relational operators and equality operators
 */

import javax.swing.JOptionPane;


public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstNumber;  //first string entered by user
		String secondNumber;  //second string entered by user
		String result; //a string containing the output
		int number1;  //first number to compare
		int number2; //second number to compare
		
		//read first & second numbers as string
		firstNumber = JOptionPane.showInputDialog("Enter first number");
		secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		//convert numbers from String to int
		
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		//initialize result to empty String
		
		result = "";
		
		if(number1 == number2){
			result = number1 + " == " + number2;
		}
		
		if(number1 != number2){
			result = number1 + " != " + number2;
		}
		
		if(number1 < number2){
			result = result + "\n" + number1 + " < " + number2;
		}
		
		if(number1 > number2){
			result = result + "\n" + number1 + " > " + number2;
		}
		
		if(number1 <= number2){
			result = result + "\n" + number1 + " <= " + number2;
		}
		
		if(number1 >= number2){
			result = result + "\n" + number1 + " >= " + number2;
		}
		
		//Display results
		JOptionPane.showMessageDialog(null,  result, "Comparison Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);  //terminate application

	}

}
