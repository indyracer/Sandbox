package chapter_6;

/*
 * How to program Java
 * Fig 6.4 Finding the maximum of three doubles
 */

import java.awt.Container;
import javax.swing.*;

public class Maximum extends JApplet{
	
	//initialize applet by obtaining user input and creating GUI
	
	public void init(){
		//obtain user input
		String a1 = JOptionPane.showInputDialog("Enter first floating point value");
		String a2 = JOptionPane.showInputDialog("Enter second floating point value");
		String a3 = JOptionPane.showInputDialog("Enter third floating point value");
		
		//convert user input to double values
		double number1 = Double.parseDouble(a1);
		double number2 = Double.parseDouble(a2);
		double number3 = Double.parseDouble(a3);
		
		//call methog maximum to determine largest value
		double max = maximum(number1, number2, number3);
		
		//create JTextArea to display results
		JTextArea outputArea = new JTextArea();
		
		//display numbers and maximum value
		outputArea.setText("number1: " + number1 + "\nnumber2: " + number2 + "\nnumber3: " + number3 + "\nThe maximum is " + max);
		
		//get Applets GUI component display area
		Container container = getContentPane();
		
		//attach outputArea to Container c
		container.add(outputArea);
	}
	
	//maximum method uses Math class method to help determine max value
	public double maximum(double x, double y, double z){
		return Math.max(x, Math.max(y,z));
	}

}
