package chapter_8;

/*
 * how to program Java
 * Fig 8.17 Using the this reference to refer to instance variables and methods
 */

import java.text.DecimalFormat;
import javax.swing.*;

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTime time = new SimpleTime(12,30,19);
		
		JOptionPane.showMessageDialog(null, time.buildString(), "Demonstrating the \"this\" Reference", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
//class SimpleTime demonstrates the "this" reference

class SimpleTime{
	private int hour, minute, second;
	
	//constructor uses parameter name identical to instance variable names, so this reference required
	//to distinguish between instance variables and parameters
	public SimpleTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//call tostring explicityly via "this' reference, explicitly
	//via implicit "this" reference, implicitly via "this"
	public String buildString(){
		return "this.toString(): " + this.toString() + "\ntoString(): " + toString() + "\nthis (with implicit toString() call): " + this;
	}
	
	//convert SimpleTest to String format
	public String toString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		//"this " not required because toString does not have 
		//local variables with same names as instance variables
		return twoDigits.format(this.hour) + ":" + twoDigits.format(minute) + ":" + twoDigits.format(this.second);
	}
}