package chapter_3;

/*
 * How to program java
 * Chapter 3 self review 3.11
 */


import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Chapter3SelfReview3_11 extends JApplet {
	
	int max;
	int min;

	public void init(){
	//variables
	String firstNumber;
	String secondNumber;
	String thirdNumber;
	String fourthNumber;
	String fifthNumber;
	
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	
	//get input from user
	firstNumber = JOptionPane.showInputDialog("Enter the first number: ");
	secondNumber = JOptionPane.showInputDialog("Enter the second number: ");
	thirdNumber = JOptionPane.showInputDialog("Enter the third number: ");
	fourthNumber = JOptionPane.showInputDialog("Enter the fourth number: ");
	fifthNumber = JOptionPane.showInputDialog("Enter the fifth number: ");
	
	//parse the input to ints
	a = Integer.parseInt(firstNumber);
	b = Integer.parseInt(secondNumber);
	c = Integer.parseInt(thirdNumber);
	d = Integer.parseInt(fourthNumber);
	e = Integer.parseInt(fifthNumber);
	
	//find the max (max method only accepts 2 arugments.  Best practice would be to do a loop rather than repeat steps)
	max = Math.max(a, b);
	max = Math.max(max, c);
	max = Math.max(max, d);
	max = Math.max(max, e);
	
	//find min (also best practice to use a loop instead of multiple steps)
	min = Math.min(a, b);
	min = Math.min(min, c);
	min = Math.min(min, d);
	min = Math.min(min, e);			
	}
	
	public void paint (Graphics g){
		
		//draw the results
		g.drawString("The highest number is " + max, 25, 25);
		g.drawString("The lowest number is " + min, 25, 40);
	}
}
