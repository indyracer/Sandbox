package chapter_2;
/*
 * How To Program Java
 * Chapter 2 Self Review Exercise 2.3
 */

import javax.swing.JOptionPane;

public class Chapter2SelfReview2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables for the exercise
		
		int c;
		int thisIsAVariable;
		int q76354;
		int number = 0;
		String value;
		
		//display a dialog asking user for a number
		
		value = JOptionPane.showInputDialog("Enter a number");
		
		//convert value from String to int
		int age;
		age = Integer.parseInt(value);
		
		if(number != 7){
			JOptionPane.showMessageDialog(null, "The variable number is not equal to 7");
		}
		
		JOptionPane.showMessageDialog(null, "This is a Java Program");
		
		JOptionPane.showMessageDialog(null, "This is a Java \n Program");
	}

}
