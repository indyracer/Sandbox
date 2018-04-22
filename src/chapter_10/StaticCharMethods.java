package chapter_10;

/*
 * How to program java
 * Demonstrates the static character testing methods and case conversions methods of class Character
 * from java.lang package
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StaticCharMethods extends JFrame{
	private char c;
	private JLabel promptField;
	private JTextField inputField;
	private JTextArea outputArea;

	//set up GUI
	public StaticCharMethods(){
		super ("Static Character Methods");

		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		promptField = new JLabel("Enter a character and press Enter");
		container.add(promptField);

		inputField = new JTextField(5);
		container.add(inputField);

		inputField.addActionListener(
				//anonymous inner class
				new ActionListener(){
					//handle text field event
					public void actionPerformed(ActionEvent event){
						String s = event.getActionCommand();
						c = s.charAt(0);
						buildOutput();
					}
				}// end anonymous inner class
				); //end call to addActionListener
		
		container.add(inputField);
		 outputArea = new JTextArea(10, 20);
		 container.add(outputArea);
		 
		 setSize(300, 250);  //set the window size
		 show(); //show the window		 
	}
	
	//display character info in outputArea
	public void buildOutput(){
		outputArea.setText(
				"is defined: " + Character.isDefined(c) +
				"\nis digit: " + Character.isDigit(c) +
				"\nis Java letter: " + Character.isJavaIdentifierStart(c) + 
				"\nis Java letter or digit: " + Character.isJavaIdentifierPart(c) +
				"\nis letter: " + Character.isLetter(c) + 
				"\nis letter or digit: " + Character.isLetterOrDigit(c) + 
				"\nis lower case: " + Character.isLowerCase(c) +
				"\nis upper case: " + Character.isUpperCase(c) +
				"\nto upper case: " + Character.toUpperCase(c) +
				"\nto lower case: " + Character.toLowerCase(c)
				);
	}
	
	//execute application
	public static void main(String[] args) {
		StaticCharMethods application = new StaticCharMethods();
		
		application.addWindowListener(
				//anonymous inner class
				new WindowAdapter(){
					//handle event when user closes window
					public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
					}
				} //end anonymous inner class
				);//end call to addWindowListener

	}//end method main

}
