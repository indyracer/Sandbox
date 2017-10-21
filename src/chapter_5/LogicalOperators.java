package chapter_5;


/*
 * How to program Java
 * Demonstrating  the logical operators Fig. 5/19
 */

import javax.swing.*;

public class LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create JTextArea to display results
		JTextArea outputArea = new JTextArea(17,20);
		
		//attached text area to JScrollPane so user can scroll through results
		JScrollPane scroller = new JScrollPane (outputArea);
		
		String output;
		
		//create truth table for && operator
		output = "Logical AND (&&) operator" +
		"\nfalse && false: " + (false && false) +
		"\nfalse && true: " + (false && true) +
		"\ntrue && false: " + (true && false) +
		"\ntrue && true: " + (true && true);
		
		//create true table for || operator
		output += "\n\nLogical OR (||) operator" +
		"\nfalse || false: " + (false || false) +
		"\nfalse || true: " + (false || true) +
		"\ntrue || false: " + (true || false) +
		"\ntrue || true: " + (true || true);
		
		//create truth table for & operator
		output += "\n\nBoolean logical AND (&)" +
		"\nfalse & false: " + (false & false) +
		"\nfalse & true: " + (false & true) +
		"\ntrue & false: " + (true & false) +
		"\ntrue & true: " + (true & true);
		
		//create truth table for | operater
		output += "\n\nBoolean logical OR (|)" +
		"\nfalse | false: " + (false | false) +
		"\nfalse | true: " + (false | true) +
		"\ntrue | false: " + (true | false) +
		"\ntrue | true: " + (true | true);
		
		//create truth table for ^ operator
		output +="\n\nBoolean logical exclusive OR (^)" +
		"\nfalse ^ false: " + (false ^ false) +
		"\nfalse ^ true: " + (false ^ true) +
		"\ntrue ^ false: " + (true ^ false) +
		"\ntrue ^ true: " + (true ^ true);
		
		//create truth table for ! operator
		output += "\n\nLogical NOT (!)" +
		"\n!false: " + (!false) +
		"\n!true: " + (!true);
		
		outputArea.setText(output); //place results in JTextArea
		
		JOptionPane.showMessageDialog(null, scroller, "Truth Tables", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
