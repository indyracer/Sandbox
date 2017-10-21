package chapter_3;

/*
 * How to program java
 * AdditionApplet
 * Figure 3.12
 */

import java.awt.Graphics;
import javax.swing.*;

public class AdditionApplet extends JApplet {
	
	double sum;
	
	public void init() {
		String firstNumber;
		String secondNumber;
		double number1;
		double number2;
		
		firstNumber = JOptionPane.showInputDialog("Enter first floating point value");
		secondNumber = JOptionPane.showInputDialog("Enter second floating point value");
		
		//convert input from String to doubles
		number1 = Double.parseDouble(firstNumber);
		number2 = Double.parseDouble(secondNumber);
		
		//add numbers
		sum = number1 + number2;
	}
	
	//draw results in a rectangle on applet's background
	
	public void paint (Graphics g){
		//call inherited version of method paint
		super.paint(g);
		
		//draw rectangle starting from (15,10) that is 270 pixels wide and 20 pixels tall
		g.drawRect(15, 10, 270, 20);
		
		//draw results as a String at (25,25)
		g.drawString("The sum is " + sum, 25, 25);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
