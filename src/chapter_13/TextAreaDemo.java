package chapter_13;
/*
 * how to program Java
 * Fig 13.1 Copy seleccted text from one text area to another
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextAreaDemo extends JFrame {
	
	private JTextArea textArea1, textArea2;
	private JButton copyButton;
	
	//setup GUI
	public TextAreaDemo(){
		super("TextArea Demo");
		
		Box box = Box.createHorizontalBox();
		
		String string = "this is a demo string to \n" +
		"illustrating copying textn" +
		"from one TextArea to \n" +
		"another TextArea using an |n" + "external event\n";
		
		//set up TextArea1
		textArea1 = new JTextArea(string, 10, 15);
		box.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
