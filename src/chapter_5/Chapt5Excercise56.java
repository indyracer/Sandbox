package chapter_5;

/*
 * How to program Java
 *Chapter 5 Exercise 5.6 
 * Application finds the smallest of serveral integers
 */

import javax.swing.JOptionPane;

public class Chapt5Excercise56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ask how many integers to compare
		
		String inputCount = JOptionPane.showInputDialog("How many integers would you like to compare?");
		
		int count = Integer.parseInt(inputCount);
		
		int int1, int2, nextNum;
		
		//get first two integers for comparison
		String firstNum = JOptionPane.showInputDialog("Enter first number: ");
		String secondNum = JOptionPane.showInputDialog("Enter second number: ");
		
		
		int1 = Integer.parseInt(firstNum);
		int2 = Integer.parseInt(secondNum);
		
		
		int smallest;
		
		if(int1 < int2){
			smallest = int1;
		} else {
			smallest = int2;
		}
		
		//compare numbers and assign to smallest variable
		for(int i = 3; i <= count; i++){
			//get next integer
			nextNum = Integer.parseInt(JOptionPane.showInputDialog("Enter next number:  "));
			
			//compare next number to smallest
			if(nextNum < smallest){
				smallest = nextNum;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "The smallest number of the group is " + smallest, "Answer", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
