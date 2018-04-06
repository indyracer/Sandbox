package chapter_9;

/*
 * How to program Java
 * Fig 9.33 Demonstrating th eTime class set and get Methods
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeTestWindow extends JFrame{

	private Time time;
	private JLabel hourLabel, minuteLabel, secondLabel;
	private JTextField hourField, minuteField, secondField, displayField;
	private JButton exitButton;

	//set up GUI
	public TimeTestWindow(){
		super("Inner Class Demonstration");

		time = new Time();

		//create an instance of inner class ActionEventHandler
		ActionEventHandler handler = new ActionEventHandler();

		//set up GUI
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		hourLabel = new JLabel("Set Hour");
		hourField = new JTextField(10);
		hourField.addActionListener(handler);
		container.add(hourLabel);
		container.add(hourField);

		minuteLabel = new JLabel("Set minute");
		minuteField = new JTextField(10);
		minuteField.addActionListener(handler);
		container.add(minuteLabel);
		container.add(minuteField);

		secondLabel = new JLabel("Set second");
		secondField = new JTextField(10);
		secondField.addActionListener(handler);
		container.add(secondLabel);
		container.add(secondField);

		displayField = new JTextField(30);
		displayField.setEditable(false);
		container.add(displayField);

		exitButton = new JButton("Exit");
		exitButton.addActionListener(handler);
		container.add(exitButton);
	}// end constructor

	//display time in displayfield
	public void displayTime(){
		displayField.setText("The time is: " + time);
	}

	//create TimeTestWindow and display it

	public static void main(String[] args) {

		TimeTestWindow window = new TimeTestWindow();
		window.setSize(400, 140);
		window.setVisible(true);
	}

	//inner class definition for handling JTextField and JButton events
	private class ActionEventHandler implements ActionListener {

		public void actionPerformed (ActionEvent event){
			//user pressed exit button
			if(event.getSource() == exitButton){
				System.exit(0); //terminate the application
			}
			//user presed Enter key in hourField
			else if(event.getSource() == hourField){
				time.setHour(Integer.parseInt(event.getActionCommand()));
				hourField.setText("");
			}
			//user pressed Enter key in minuteField
			else if(event.getSource() == minuteField){
				time.setMinute(Integer.parseInt(event.getActionCommand()));
				minuteField.setText("");
			}
			
			else if(event.getSource() == secondField){
				time.setSecond(Integer.parseInt(event.getActionCommand()));
				secondField.setText("");
			}
			
			displayTime();
		}
	}

}
