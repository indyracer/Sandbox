package chapter_6;

//SquareIntegers Fig 6.3 A programmer defined square method

import java.awt.Container;
import javax.swing.*;


public class SqaureIntegers extends JApplet{
	//set up GUI and calculate squares of integers from 1 to 10
	public void init(){
		//JTextArea to display results
		JTextArea outputArea = new JTextArea();
		
		//get applet's content pain (GUI component display area)
		Container container = getContentPane();
		
		//attach outputArea to container
		container.add(outputArea);
		
		int result; //store result of call to method square
		String output = ""; //String contains results
		
		//loop 10 times
		for(int counter = 1; counter <= 10; counter++){
			//calculate square of counter and store in result
			result = square(counter);
			
			//append result to String
			output += "The square of " + counter + " is " + result + "\n";
		} //end for structure
		
		outputArea.setText(output);  //places results in JTextArea
	} // end method init
	
	//square method definition
	
	public int square(int y){
		return y * y;
	}

}
