package chapter_4;


/*
 * How to Program Java
 * Chapter 4 Exercise 4.11
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Chapter4Excercise4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		String gallons; //gallons input for each tank
		String miles;  //miles for tank of gas
		
		int tankGallon = 0; //converted gallon from input
		int tankMiles = 0;  //converted miles from input
		
		int totalGallons = 0; //running total of gallons
		int totalMiles = 0; //running total of miles
		
		double mpgTank = 0; //mpg for each individual tank
		double mpgOverall = 0;  //combined mpg
		
		String addTank = "Yes"; //control to add more tanks
		
		//Initial gathering of input from user
		gallons = JOptionPane.showInputDialog("Enter number of gallons: ");
		miles = JOptionPane.showInputDialog("Enter number of miles: ");
				
		while(addTank.equals("Yes") || addTank.equals("yes")){
						
			//convert to int
			tankGallon = Integer.parseInt(gallons);
			tankMiles = Integer.parseInt(miles);
			
			//Per Tank calculations
			mpgTank = (double) tankMiles / (double) tankGallon;
			
			//running total calculations
			totalGallons += tankGallon;
			totalMiles += tankMiles;
			
			//running total MPG calculation
			mpgOverall = (double) totalMiles / (double) totalGallons;
			
			//format to 2 decimal point
			DecimalFormat twoDigits = new DecimalFormat("0.00"); 
			
			//display results
			JOptionPane.showMessageDialog(null, "The MPG for this tank is " + twoDigits.format(mpgTank) + "\nThe overall MPG is " + twoDigits.format(mpgOverall));
			
			//Request next tank input
			addTank = JOptionPane.showInputDialog("Would you like to add another tank (Yes/No)?");
			if(addTank.equals("Yes") || addTank.equals("yes")){
				gallons = JOptionPane.showInputDialog("Enter number of gallons: ");
				miles = JOptionPane.showInputDialog("Enter number of miles: ");
			}
			
			
		}

	}

}
