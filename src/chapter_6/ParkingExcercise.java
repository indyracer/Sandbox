package chapter_6;
/*
 * How to program Java
 * Exercise 6.8
 * Parking calculations
 */

//core packages
import java.awt.*;
import java.awt.event.*;
// extension package
import javax.swing.*;

public class ParkingExcercise extends JApplet implements ActionListener{
	
	JLabel hourLabel, currentParkerChargeLabel, totalChargeYesterdayLabel;
	JTextField hourField, currentParkerChargeField, totalChargeYesterdayField;
	double runningTotal = 0; 
	
	//set up GUI
	public void init(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//create hourLabel and attach to container
		hourLabel = new JLabel("Enter number of hours parked: ");
		container.add(hourLabel);
		
		//create hourField and attach to container
		hourField = new JTextField(10);
		container.add(hourField);
		
		//register this applet as hourField's actionListener
		hourField.addActionListener(this);
		
		//create currentParkerChargeLabel and attach to container
		currentParkerChargeLabel = new JLabel("The current parker's charges is: ");
		container.add(currentParkerChargeLabel);
		
		//create currentParkerChargeField and attach to container
		currentParkerChargeField = new JTextField(15);
		currentParkerChargeField.setEditable(false);
		container.add(currentParkerChargeField);
		
		//create totalChargeYesterdayLabel and attach to container
		totalChargeYesterdayLabel = new JLabel("Running Total of Yesterday's Charges: ");
		container.add(totalChargeYesterdayLabel);
		
		//create currentParkerChargeField and attach to container
		totalChargeYesterdayField = new JTextField(15);
		totalChargeYesterdayField.setEditable(false);
		container.add(totalChargeYesterdayField);
	} //end init
	
	//obtain user input and call method calculateCharges
	public void actionPerformed(ActionEvent e){
		double hoursParked, parkingCharges;
		hoursParked = Double.parseDouble(hourField.getText());
	
		//calculates users parkering charge
		parkingCharges = calculateCharges(hoursParked);
		
		//calculate running total from yesterday
		runningTotal = runningTotal + parkingCharges;
		
		currentParkerChargeField.setText(Double.toString(parkingCharges));
		totalChargeYesterdayField.setText(Double.toString(runningTotal));
		
		
	}
	
	//method to calculate current parker charges
	public double calculateCharges(double hoursParked){
		double charges;
		//if total hours is less than 3, min charge is $2
		if(hoursParked <= 3){
			charges = 2.00;
		}
		else{
			//determine how many hours over 3
			//charges == 2 min fee + $0.50 per hour or part of hour thereof, max $10
			double overage = Math.ceil(hoursParked - 3);
			charges = 2 + (overage * 0.5);
			if(charges >= 10){
				charges = 10;
			}
		}
		return charges;
	}

}
