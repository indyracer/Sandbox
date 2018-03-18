package chapter_8;
/*
 * How to program Java
 * Fig 8.2 Class TimeTest1 to exercise class Time1
 */

import javax.swing.JOptionPane;

public class TimeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time1 time = new Time1(); //calls time1 Constructor
		
		//append string version of time to String output
		String output = "The initial universal time is " + time.toUniveralString() + 
				"\nThe initial standard time is: " + time.toString() +
				"\nImplicit toString() call: " + time;
		
		//change time and append String version of time to output
		time.setTime(13, 27, 6);
		output += "\n\nUniveral time after setTime is: " + time.toUniveralString() + 
				"\nStandard time after setTime is: " + time.toString();
		
		//use invalid values to change time and append String version of time to output
		time.setTime(99, 99, 99);
		output += "\n\nAfter attempting invalid settings: " + 
		"\nUniveral time: " + time.toUniveralString() + 
		"\nStandard time: " + time.toString();
		
		JOptionPane.showMessageDialog(null, output, "Tesing Class Time1", JOptionPane.INFORMATION_MESSAGE);

	}

}
