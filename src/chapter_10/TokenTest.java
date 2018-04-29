package chapter_10;
/*
 * How to program Java
 * Fig 10.20 Testing the StringTokenizer class of the java.util package
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TokenTest extends JFrame {
	
	private JLabel promptLabel;
	private JTextField inputField;
	private JTextArea outputArea;
	
	//set up GUI
	public TokenTest(){
		
		super("Testing Class StringTokenizer");
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		promptLabel = new JLabel("Enter a sentence and press Enter");
		container.add(promptLabel);
		
		inputField = new JTextField(20);
		
		inputField.addActionListener(
				//anaonymous inner class
				new ActionListener(){
					//handle text field event
					public void actionPerformed(ActionEvent event){
						String stringToTokenize = event.getActionCommand();
						StringTokenizer token = new StringTokenizer(stringToTokenize);
						
						outputArea.setText("Number of elements: " + token.countTokens() + "\nThe tokens are:\n");
						
						while(token.hasMoreTokens()){
							outputArea.append(token.nextToken() + "\n");
						}
					}//end anonymous inner class
				}//end call to addActionListener
			);
	
		container.add(inputField);
		
		outputArea = new JTextArea(10, 20);
		outputArea.setEditable(false);
		container.add(new JScrollPane(outputArea));
		setSize(275, 260);
		show();
	}
	
	

	public static void main(String[] args) {
		TokenTest application = new TokenTest();
		application.addWindowListener(
				//anonymous inner class
				new WindowAdapter(){
					//handle event when user closes window
					public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
					}
				}
				
				
				
				);
		
		

	}

}
