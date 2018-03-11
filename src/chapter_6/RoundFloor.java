package chapter_6;
/*
 * how to program java
 * Exercise 6.9.  Math Floor to show original and rounded number
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoundFloor extends JApplet implements ActionListener {
	
	JLabel enterNumberLabel, showNumberLabel;
	JTextField enterNumberField, showNumberField;
	
	public void init(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//set label for enternumberlabel and attach to container
		enterNumberLabel = new JLabel("Enter a number");
		container.add(enterNumberLabel);
		
		//set field for enterNumberLable and attach to container
		enterNumberField = new JTextField(15);
		container.add(enterNumberField);
		
		//register this app's event listener to enterNumberField
		enterNumberField.addActionListener(this);
		
		//set label and field for showNumberField, attach both to container
		showNumberLabel = new JLabel("Number rounded to nearest number: ");
		container.add(showNumberLabel);
		
		showNumberField = new JTextField(15);
		showNumberField.setEditable(false);
		container.add(showNumberField);
	}
	
	//obtain user input and call method to round number
	public void actionPerformed(ActionEvent e){
		double originalNumber, roundedNumber;
		originalNumber = Double.parseDouble(enterNumberField.getText());
	
		//calculates users parkering charge
		roundedNumber = roundNumber(originalNumber);
		
		showNumberField.setText(Double.toString(roundedNumber));
		
		
	}
	
	//method to round number to 
	public double roundNumber(double originalNumber){
		double y = Math.floor(originalNumber + .5);
		return y;
	}

}
