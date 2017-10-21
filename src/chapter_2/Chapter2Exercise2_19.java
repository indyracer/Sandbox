package chapter_2;

/*
 * How to Program Java
 * Chapter 2, Exercise 2.19
 */

import javax.swing.JOptionPane;
import java.lang.Math;;

public class Chapter2Exercise2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		String input; //used to get radius input from User
		double radius = 0;
		double diameter = 0;
		double circumference = 0;
		double area = 0;
		
		//Ask for input
		input = JOptionPane.showInputDialog("Please provide the radius of the circle:  ");
		
		//convert input from string to double
		radius = Double.parseDouble(input);
		
		//calculations
		diameter = 2 * radius;
		circumference = 2 * radius * Math.PI;
		area = Math.PI * (radius * radius);
		
		//display the results
		JOptionPane.showMessageDialog(null, "The diameter is " + diameter + "\nThe circumference is " + circumference + "\nThe area is " + area);
		
		//terminate app
		System.exit(0);

	}

}
