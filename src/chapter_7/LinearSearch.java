package chapter_7;

/*
 * How to program java
 * Fig 7.12 Linear search of an array
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinearSearch extends JApplet implements ActionListener{
	
	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	int array[];
	
	//set up GUI
	public void init(){
		//get content pane and set its layout to FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//set up JLabel and JTextField for user input
		enterLabel = new JLabel("Enter integer search key");
		container.add(enterLabel);
		
		enterField = new JTextField(10);
		container.add(enterField);
		
		//register this applet as enterField's action listener
		enterField.addActionListener(this);
		
		//set JLabel and JTextField for displaying results
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		resultField = new JTextField(20);
		resultField.setEditable(false);
		container.add(resultField);
		
		//create array and populate with even integers from 0 to 198
		array = new int[100];
		for(int counter = 0; counter < array.length; counter++){
			array[counter] = 2 * counter;
		}
	}// end init method
	
	//Search array for specified key value
	public int linearSearch(int array2[], int key){
		//loop through array elements
		for(int counter = 0; counter < array2.length; counter++){
			if(array2[counter] == key){
				return counter;
			}
		}
		
		return -1;
	}
	
	//obtain user input and call method linearSearch
	public void actionPerformed(ActionEvent actionEvent){
		//input also can be obtained with enterField.getText()
		String searchKey = actionEvent.getActionCommand();
		
		//Array a is passed to linearSearch even though it
		//is an instance variable.  Normally an array will
		//be passedto a method for searching
		int element = linearSearch(array, Integer.parseInt(searchKey));
		
		//display search results
		if(element != -1){
			resultField.setText("Found value in element " + element);
		} else {
			resultField.setText("Value not found");
		}
	}

}
