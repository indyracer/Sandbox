package chapter_6;

/*
 * How to Program Java
 * Self Review 6.6 compute volume of sphere
 */

//core packages
import java.awt.*;
import java.awt.event.*;

//extension packages
import javax.swing.*;

public class SphereVolume extends JApplet implements ActionListener {
	
	JLabel promptLabel;
	JTextField inputField;
	
	//initialize applet by obtaining user input and creating GUI
	
	public void init(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		promptLabel = new JLabel("Enter sphere radius: ");
		inputField = new JTextField(10);
		inputField.addActionListener(this);
		container.add(promptLabel);
		container.add(inputField);
	} //end init
	
	public void actionPerformed(ActionEvent actionEvent){
		double radius = Double.parseDouble(actionEvent.getActionCommand());
		showStatus("Volume is " + sphereVolume(radius));
	}
	
	//method to calculate volume of sphere
	public double sphereVolume(double radius){
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

}
