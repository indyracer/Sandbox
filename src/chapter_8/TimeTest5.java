package chapter_8;

/*
 * How to program java
 * Fig 8.9 Demonstrating the Time3 class set and get methods
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeTest5 extends JApplet implements ActionListener{
	
	private Time3 time;
	private JLabel hourLabel, minuteLabel, secondLabel;
	private JTextField hourField, minuteField, secondField, displayField;
	private JButton tickButton;
	
	//create Time3 object and setup GUI
	public void init(){
		time = new Time3();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//set up hourLabel and hourField
		hourLabel = new JLabel("Set Hour: ");
		hourField = new JTextField(10);
		hourField.addActionListener(this);
		container.add(hourLabel);
		container.add(hourField);
		
		//set up minuteLabel and minuteField
		minuteLabel = new JLabel("Set minute: ");
		minuteField = new JTextField(10);
		minuteField.addActionListener(this);
		container.add(minuteLabel);
		container.add(minuteField);
		
		//set up secondLabel and secondField
		secondLabel = new JLabel("Set second: ");
		secondField = new JTextField(10);
		secondField.addActionListener(this);
		container.add(secondLabel);
		container.add(secondField);
		
		//setup displayField
		displayField = new JTextField(30);
		displayField.setEditable(false);
		container.add(displayField);
		
		//set up tickButton
		tickButton = new JButton("Add 1 to second");
		tickButton.addActionListener(this);
		container.add(tickButton);
		
		updateDisplay(); //update text in displayfield
	}
	
	//hand button and tex field events
	public void actionPerformed(ActionEvent actionEvent){
		//process tickButton event
		if(actionEvent.getSource() == tickButton){
			tick();
		}
		
		//process hourfield event
		else if(actionEvent.getSource() == hourField){
			time.setHour(Integer.parseInt(actionEvent.getActionCommand()));
			hourField.setText("");
		}
		//process minuteField event
		else if(actionEvent.getSource() == minuteField){
			time.setMinute(Integer.parseInt(actionEvent.getActionCommand()));
			minuteField.setText("");
		}
		
		//process secondField event
		else if(actionEvent.getSource() == secondField){
			time.setSecond(Integer.parseInt(actionEvent.getActionCommand()));
			secondField.setText("");
		}
		
		updateDisplay();  //update displayfield and status bar
	}
	
	//update displayField and status bar
	public void updateDisplay(){
		displayField.setText("Hour: " + time.getHour() + "; Minute: " + time.getMinute() + "; Second: " + time.getSecond());
		
		showStatus("Standard time is: " + time.toString() + "; Universal time is: " + time.toUniversalString());
	}
	
	//add one second and update hour/minute if necessary
	public void tick(){
		time.setSecond((time.getSecond() + 1) % 60);
		
		if(time.getSecond() == 0){
			time.setMinute((time.getMinute() + 1) % 60);
			
			if(time.getMinute() == 0){
				time.setHour((time.getHour() + 1) % 24);
			}
		}
	}

}
