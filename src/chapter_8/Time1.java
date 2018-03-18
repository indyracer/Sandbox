package chapter_8;

/*
 * how to program Java
 * Time1 class definition maintains the time in a 24 hour format
 */

import java.text.DecimalFormat;

public class Time1 extends Object{
	private int hour; //0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59
	
	//Time 1 constructor initializes each instance variable to zero
	//Ensures that each Time1 object starts in a consistent state
	public Time1(){
		setTime(0,0,0);
	}
	
	//Set a new time value using universal time
	//perform validity checks on the data
	//set invalid values to zero
	public void setTime(int h, int m, int s){
		hour = ((h >= 0 && h < 24) ? h : 0); //validates hour is acceptable value, if not, sets to 0
		minute = ((m >= 0 && m < 60) ? m : 0); //validates minute is acceptable value, if not, sets to 0
		second = ((s >= 0 && s < 60) ? s : 0); ////validates second is acceptable value, if not, sets to 0
	}
	
	//convert to String in universal-time format
	public String toUniveralString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(hour) + ":" +
		twoDigits.format(minute) + ":" +
		twoDigits.format(second);
	}
	
	//convert to String in standard-time format
	public String toString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":"+
		twoDigits.format(minute) + ":" + 
		twoDigits.format(second) +
		(hour < 12 ? "AM" : "PM");
	}
	
	

}
