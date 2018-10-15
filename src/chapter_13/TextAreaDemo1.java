package chapter_13;

/*
 * How to program Java
 * Fig 13.1 Copying selected text from one text area to another
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaDemo1 extends JFrame{

	private JTextArea textArea1, textArea2;
	private JButton copyButton;
	
	//setup GUI
	public TextAreaDemo1(){
		super("TextArea Demo");
		
		Box box = Box.createHorizontalBox();
		
		String string = "this is a demo string to \n" +
		"illustrating copying textn" +
		"from one TextArea to \n" +
		"another TextArea using an |n" + "external event\n";
		
		//set up TextArea1
		textArea1 = new JTextArea(string, 10, 15);
		box.add(new JScrollPane(textArea1));
		
		//setup copy button
		copyButton = new JButton("Copy>>>>");
		copyButton.addActionListener(
				//anonymous inner class to handle copybutton event
				new ActionListener(){
					//set text in textArea2 to select
					//text from textArea1
					public void actionPerformed(ActionEvent event){
						textArea2.setText(textArea1.getSelectedText());
					}
				}
			);
		
		box.add(copyButton);
		
		//setup textArea2
		textArea2 = new JTextArea(10,15);
		textArea2.setEditable(false);
		box.add(new JScrollPane(textArea2));
		
		Container container = getContentPane();
		container.add(box);  //place in BorderLayout.CENTER
		
		setSize(425,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextAreaDemo1 application = new TextAreaDemo1();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
