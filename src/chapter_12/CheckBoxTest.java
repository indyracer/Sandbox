package chapter_12;
/*
 * How to program java
 * Fig 12.11 Creating Checkbox buttons
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest extends JFrame {
	
	private JTextField field;
	private JCheckBox bold, italic;
	
	//set up GUI
	public CheckBoxTest(){
		super("JCheckBox Test");
		
		//Get content pane and set its layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//set up JTextField and set its font
		field = new JTextField("Watch the font style change", 20);
		field.setFont(new Font("Serif", Font.PLAIN, 14));
		container.add(field);
		
		//create checkbox objects
		bold = new JCheckBox("Bold");
		container.add(bold);
		
		italic = new JCheckBox("Italic");
		container.add(italic);
		
		//register listeners for JCheckBox
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		
		setSize(275,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxTest application = new CheckBoxTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//private inner class for ItemListener event handling
	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;
		
		//respond to checkbox events
		public void itemStateChanged(ItemEvent event){
			//process bold checkbox events
			if(event.getSource() == bold){
				if(event.getStateChange() == ItemEvent.SELECTED){
					valBold = Font.BOLD;
				}
				else{
					valBold = Font.PLAIN;
				}
			}
			
			//process italic checkbox events
			if(event.getSource() == italic){
				if(event.getStateChange() == ItemEvent.SELECTED){
					valItalic = Font.ITALIC;
				}
				else {
					valItalic = Font.PLAIN;
				}
			}
			
			//set text field font
			field.setFont(new Font("Serif", valBold + valItalic, 14));
		}
	}

}
