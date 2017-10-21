package chapter_4;

/*
 * How to program java
 * Exercise 4.13
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Chapter4Excercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables to be used
		String numberWeeks; //number of weeks being input
		int weeks = 0; //number of weeks converted to int
		String numberOfItems;  //number of items being input
		int items = 0; //number of items converted to int
		
		String valueOfItems; //value of individual items
		double value = 0;  //Individual item converted to double
		double itemTotal = 0; //sum of all items
		
		String moreItems = "Yes"; //used for control, to add more items
		
		double commissionRate = 0.09; //commission rate
		double weeklyBase = 200.00;  //weekly base pay
		double weeklyPayTotal = 0; //total pay for weeks
		double commissionPay = 0; //total pay for commission
		double totalPay = 0;  //total pay = weeklyPayTotal + commissionPay
		
		DecimalFormat currency = new DecimalFormat("#0.00"); //set up to format currency to two decimals
		
		//initial inputs
		numberWeeks = JOptionPane.showInputDialog("Number of weeks:  ");
		weeks = Integer.parseInt(numberWeeks);
		
		numberOfItems = JOptionPane.showInputDialog("Number of Items:  ");
		items = Integer.parseInt(numberOfItems);
		
		//calculate total value of items
		for(int i = 1; i <= items; i++){
			valueOfItems = JOptionPane.showInputDialog("Item " + i + " Value");
			value = Double.parseDouble(valueOfItems);
			
			//running total
			itemTotal += value;
			
		}
		
		//calculate base pay
		weeklyPayTotal = weeklyBase * weeks;
		
		//calculate commission pay
		commissionPay = itemTotal * commissionRate;
		
		//calculate total pay
		totalPay = weeklyPayTotal + commissionPay;
		
		//report results
		//if only 1 week, print out "week", otherwise print out "weeks"
		
		if(weeks == 1){
			JOptionPane.showMessageDialog(null, "The total pay based on " + numberWeeks + " week \nand " + numberOfItems + " number of items sold is \n$" + currency.format(totalPay));
		} else {
			JOptionPane.showMessageDialog(null, "The total pay based on " + numberWeeks + " weeks \nand " + numberOfItems + " number of items sold is \n$" + currency.format(totalPay));	
		}
		

	}

}
