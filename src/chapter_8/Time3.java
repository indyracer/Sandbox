package chapter_8;

/*
 * How to program Java
 * Fig 8.8 class definition with set and get methods
 */

import java.text.DecimalFormat;

public class Time3 extends Object{
	private int hour; //0 - 23
	private int minute; //0 - 59
	private int second; //0 - 59
	
	//Time3 constructor initializes each instance variable
	//to zero. Ensures that Time object starts in a 
	//consistent state
	public Time3(){
		setTime(0,0,0);
	}
	
	//Time2 constructor:  hour supplied, minute and second defaulted to 0
	public Time3 (int h){
		setTime(h, 0, 0);
	}
	
	//Time2 constructor;  hour and minute supplied, second defaulted to 0
	public Time3(int h, int m){
		setTime(h, m, 0);
	}
	
	//Time2 constructor:  hour, minute and second supplied
	public Time3(int h, int m, int s){
		setTime(h, m, s);
	}
	
	//Time2 constructor: another Time2 object supplied
	public Time3(Time3 time){
		setTime(time.hour, time.minute, time.second);
	}
	
	//Set methods
	//Set a new time value using universal time.  Peform validity checks on data
	//Set invalid values to zero
	public void setTime(int h, int m, int s){
		setHour(h);  //set hour
		setMinute(m);  //set minute
		setSecond(s);  //set second
	}
	
	//validate and set hour
	public void setHour(int h){
		hour = ((h > 0 && h < 24) ? h : 0);
	}
	
	//validate and set minute
	public void setMinute (int m){
		minute = ((m > 0 && m < 60) ? m : 0);
	}
	
	//validate and set second
	public void setSecond (int s){
		second = ((s > 0 && s < 60) ? s : 0);
	}
	
	//Get Methods
	//get hour value
	public int getHour(){
		return hour;
	}
	
	// get minute value
	public int getMinute(){
		return minute;
	}
	
	//get second value
	public int getSecond(){
		return second;
	}
	
	//convert to String in universal time format
	public String toUniversalString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(getHour()) + ":" + 
		twoDigits.format(getMinute()) + ":" + 
		twoDigits.format(getSecond());
	}
	
	//convert to String in standard time format
	public String toString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return ((getHour() == 12 || getHour() == 0) ? 12 : getHour() % 12) + 
				":" + twoDigits.format(getMinute()) + 
				":" + twoDigits.format(getSecond()) + 
				(getHour() < 12 ? "AM" : "PM");
	}

}
