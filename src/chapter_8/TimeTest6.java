package chapter_8;

/*
 * How to program Java
 * Fig. 8.19 Chaining method calls together with the this reference
 */

import javax.swing.*;

public class TimeTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time4 time = new Time4();
		
		//chain calls to setHour, setMinute, setSecond
		time.setHour(18).setMinute(30).setSecond(22);
		
		//use method call chaining to set new time and get
		//string representation of new time
		
		String output = "Unverisal time: "+ time.toUniversalString() + 
				"\nStandard time: " + time.toString() + 
				"\n\nNew standard time: " + time.setTime(20, 20, 20).toString();
		
		JOptionPane.showMessageDialog(null, output, "Chaining Method Calls", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
