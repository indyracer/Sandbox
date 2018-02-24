package chapter_6;

/*
 * How to program java
 * Fig 6.16 MethodOverload.java
 * Using overloaded methods
 */

//Java core packages
import java.awt.Container;

//Java extension package
import javax.swing.*;

public class MethodOverload extends JApplet{
	
	//setup GUI and call versions of method square
	public void init(){
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		outputArea.setText("The square of integer 7 is " + square(7) + "\nThe square of double 7.5 is " + square(7.5));
	}
	
	//square method with int arguement
	public int square(int intValue){
		System.out.println("Called square with int arguement: " + intValue);
		return intValue * intValue;
	} // end method square with int arguement
	
	//square method with double arguement
	public double square(double doubleValue){
		System.out.println("Called square with double arguement: " + doubleValue);
		return doubleValue * doubleValue;
	} //end method with double arguement
	

}//end MethodOverload class
