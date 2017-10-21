package chapter_4;

/*
 * How to program java
 * Chapter 4 exercise 4.14
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Chapter4Excercise4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//inputs for each employee
		//Hours
		String tempHours; //used to build employee variables in loop
		
		int emp1Hours = 0;
		int emp2Hours = 0;
		int emp3Hours = 0;
		
		//Hourly Pay rates
		String tempEmployeePayRate;
		double emp1PayRate = 0;
		double emp2PayRate = 0;
		double emp3PayRate = 0;
		
		//Gross Pay
		double emp1GrossPay = 0;
		double emp2GrossPay = 0;
		double emp3GrossPay = 0;
		
		//Enter payrate & hours for each employee
		for(int i = 1; i <=3; i++){
			tempHours = JOptionPane.showInputDialog("Input number of hours for Employee " + i);
			tempEmployeePayRate = JOptionPane.showInputDialog("Input Employee " + i + "'s hourly Pay Rate ");
			//check i and assign hours/pay rate to appropriate employee
			if(i == 1){
				emp1Hours = Integer.parseInt(tempHours);
				emp1PayRate = Double.parseDouble(tempEmployeePayRate);
			}
			if(i == 2){
				emp2Hours = Integer.parseInt(tempHours);
				emp2PayRate = Double.parseDouble(tempEmployeePayRate);
			}
			if (i == 3){
				emp3Hours = Integer.parseInt(tempHours);
				emp3PayRate = Double.parseDouble(tempEmployeePayRate);
			}
		}
		
		//Calculate gross pay
		//determine if over 40 hours, if so pay 1.5x for hours over 40.
		for(int i = 1; i <= 3; i++){
			if(i == 1){
				if(emp1Hours <= 40){
					emp1GrossPay = emp1Hours * emp1PayRate;
				} else {
					emp1GrossPay = (40 * emp1PayRate) + ((emp1Hours - 40) * (emp1PayRate * 1.5));
				}
			}
			if(i == 2){
				if(emp2Hours <= 40){
					emp2GrossPay = emp2Hours * emp2PayRate;
				} else {
					emp2GrossPay = (40 * emp2PayRate) + ((emp2Hours - 40) * (emp2PayRate * 1.5));
				}
			}
			if(i == 3){
				if(emp3Hours <= 40){
					emp3GrossPay = emp3Hours * emp3PayRate;
				} else {
					emp3GrossPay = (40 * emp3PayRate) + ((emp3Hours - 40) * (emp3PayRate * 1.5));
				}
				
			}
		}
		
		//Display results
		//set up so pay is in $0.00 format
		DecimalFormat currency = new DecimalFormat("#0.00"); 
		JOptionPane.showMessageDialog(null, "Employee 1's Gross Pay is $" + currency.format(emp1GrossPay) + 
				"\nEmployee 2's Gross Pay is $" + currency.format(emp2GrossPay) + 
				"\nEmployee 3's Gross Pay is $" + currency.format(emp3GrossPay));

	}

}
