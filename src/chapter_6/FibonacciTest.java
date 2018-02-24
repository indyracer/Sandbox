package chapter_6;

/*
 * How to program Java
 * Fig 6.13 FibonacciTest.java
 * Recursive fibonacci method
 */

//java core packages
import java.awt.*;
import java.awt.event.*;

//java extension packages
import javax.swing.*;

public class FibonacciTest extends JApplet implements ActionListener{
	
	JLabel numberLabel, resultLabel;
	JTextField numberField, resultField;
	
	//set up applet's GUI
	public void init(){
		//obtain content pane and set up layout to FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//create numberLabel and attach to content pane
		numberLabel = new JLabel("Enter an integer and press enter");
		container.add(numberLabel);
		
		//create numberField and attach it to content pane
		numberField = new JTextField(10);
		container.add(numberField);
		
		//register this applet as numberField's ActionListener
		numberField.addActionListener(this);
		
		//create resultLabel and attach it to content pane
		resultLabel = new JLabel("Fibonacci value is");
		container.add(resultLabel);
		
		//create resultField, make it uneditable
		//attach it to content page
		resultField = new JTextField(15);
		resultField.setEditable(false);
		container.add(resultField);
	} //end method init
	
	//obtain user input and call method fibonacci
	public void actionPerformed(ActionEvent e){
		long number, fibonacciValue;
		
		//obtain user's input and covert to long
		number = Long.parseLong(numberField.getText());
		
		showStatus("Calculating....");
		
		//calculate fibonacci value for number user input
		fibonacciValue = fibonacci(number);
		
		//indicate processing complete and display result
		showStatus("Done");
		resultField.setText(Long.toString(fibonacciValue));
	} //end method actionPerformed
	
	//Recursive definition of method fibonacci
	public long fibonacci(long n){
		//base case
		if(n == 0 || n == 1){
			return n;
		}
		//recursive step
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	} //end method fibonacci

} //end class FibonacciTest
