package chapter_6;

/*
 * Java How To Program
 * Fig 6.12: FactorialTest.java
 * Recursive factorial method
 */

import java.awt.*;
import javax.swing.*;

public class FactorialTest extends JApplet{
	
	JTextArea outputArea;
	
	//initialize applet by creating GUIE and calculating factorials
	
	public void init(){
		outputArea = new JTextArea();
		
		Container container = getContentPane();
		container.add(outputArea);
		
		//calculate the factorials of 0 through 10
		for (long counter = 0; counter <= 10; counter++){
			outputArea.append(counter + "! = " + factorial(counter) + "\n");
		} 				
		
	}//end method init
	
	//Recursive definition of method factorial
	public long factorial(long number){
		//base case
		if(number <= 1)
			return 1;
		
		//recursive step
		else
			return number * factorial(number - 1);
		
	}//end method factorial

}//end class FactorialTest
