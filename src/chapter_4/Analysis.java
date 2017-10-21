package chapter_4;


/*
 * How to program Java
 * Analysis of examination results
 * figure 4.11
 */

import javax.swing.JOptionPane;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize variables in declarations
		int passes = 0, //number of passes
		failures = 0,   //number of failures
		student = 0,    //student counter
		result;         //one exam result
		String input,   //user entered value
		output;         //output string
				
		//process 10 students, counter controlled loop
		while (student <= 10){
			//obtain result from user
			input = JOptionPane.showInputDialog("Enter result (1=pass, 2=fail)");
			
			//convert to int
			result = Integer.parseInt(input);
			
			//process result
			if(result == 1){
				passes++;
			}
			else {
				failures++;
			}
			
			student++;
			}
		
		//termination phase
		output = "Passed: " + passes + "\nFailed: " + failures;
		
		if(passes > 8){
			output = output + "\nRaise tuition";
		}
		
		JOptionPane.showMessageDialog(null, output, "Analysis of Examination Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
