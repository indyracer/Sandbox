package chapter_10;
/*
 * Fig 10.18
 * Demonstrates static character conversion methods of class Character from java.lang package
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StaticCharMethods2 extends JFrame{
	
	private char c;
	private int digit, radix;
	private JLabel prompt1, prompt2;
	private JTextField input, radixField;
	private JButton toChar, toInt;
	
	public StaticCharMethods2(){
		super("Character Conversion Methods");
		
		//set up GUI and event handling
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		prompt1 = new JLabel("Enter a digit or character ");
		input = new JTextField(5);
		container.add(prompt1);
		container.add(input);
		
		prompt2 = new JLabel("Enter a radix ");
		radixField = new JTextField(5);
		container.add(prompt2);
		container.add(radixField);
		
		toChar = new JButton("Convert digit to character");
		
		toChar.addActionListener(
				
				//anonymous inner class
				new ActionListener(){
					//handle toChar JButton event
					public void actionPerformed(ActionEvent actionEvent){
						digit = Integer.parseInt(input.getText());
						radix = Integer.parseInt(radixField.getText());
						JOptionPane.showMessageDialog(null, "Convert digit to character: " + Character.forDigit(digit, radix));
					}
				} //end anonymous inner class				
				); //end call to addActionListener
		
		container.add(toChar);
		
		toInt = new JButton("Convert character to digit");
		
		toInt.addActionListener(
				//anonymous inner class
				new ActionListener(){
					public void actionPerformed(ActionEvent actionEvent){
						String s = input.getText();
						c = s.charAt(0);
						radix = Integer.parseInt(radixField.getText());
						JOptionPane.showMessageDialog(null, "Convert character to digit: " + Character.digit(c, radix));
					}
				}//end anonymous inner class
				);//end call to addActionListener
		
		container.add(toInt);
		
		setSize(275, 150); //set window size
		show(); 
		
		
	}

	public static void main(String[] args) {
		StaticCharMethods2 application = new StaticCharMethods2();
		
		application.addWindowListener(
				//anonymous inner class
				new WindowAdapter(){
					//handle event when user closes window
					public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
					}
				}//end anonymous inner class
				);//end call to addWindowListener

	}//end method main

}
