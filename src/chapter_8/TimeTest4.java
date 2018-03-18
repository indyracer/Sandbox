package chapter_8;

/*
 * How to Program Java
 * Fig 8.7 Using overloaded constructors
 */

import javax.swing.*;
//import chapter_8.Time2; //is this necessary? since already in same package?

public class TimeTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1, t2, t3, t4, t5, t6;
		
		t1 = new Time2(); 			//00:00:00
		t2 = new Time2(2); 			//02:00:00
		t3 = new Time2(21, 24); 	//21:24:00
		t4 = new Time2(12, 25, 42); //12:25:42
		t5 = new Time2(27, 74, 99); //00:00:00
		t6 = new Time2(t4); 		//12:25:42
		
		String output = "Constructed with: " +
		"\nt1:  all arguments defaulted" + 
		"\n  	  " + t1.toUniversalString() + 
		"\n       " + t1.toString();
		
		output += "\nt2:  hour specified; minute and " + 
		"second defaulted" + 
		"\n      " + t2.toUniversalString() + 
		"\n      " + t2.toString();
		
		output += "\nt3:  hour and minute specified; " + 
				"second defaulted" + 
				"\n      " + t3.toUniversalString() + 
				"\n      " + t3.toString();
		
		output += "\nt4:  hour, minute, second specified" + 
				"\n      " + t4.toUniversalString() + 
				"\n      " + t4.toString();
		
		output += "\nt5:  all invalid values specified" + 
				"\n      " + t5.toUniversalString() + 
				"\n      " + t5.toString();
		
		output += "\nt6:  Time2 object t4 specified" + 
				"\n      " + t6.toUniversalString() + 
				"\n      " + t6.toString();
		
		JOptionPane.showMessageDialog(null,output, "Demonstrating Overloaded Constructors", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
