package chapter_5;

/*
 * how to program Java
 * Interest.java, calculating compound interest
 */

import java.text.NumberFormat; //to format to currency (including dollar symbol)
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount, principal = 1000, rate = 0.05;
		
		//create DecimalFormat to format currency with 2 decimal points
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		
		//create JTextArea to display output
		JTextArea outputTextArea = new JTextArea();
		
		//set first line of text to display output
		outputTextArea.setText("Year\tAmount on deposit\n");
		
		//calculate amount on deposit for each of ten years
		for(int year = 1; year <= 10; year++){
			amount = principal * Math.pow(1.0 + rate, year);
			
			//append one line of text to outputTextArea
			outputTextArea.append(year + "\t" + moneyFormat.format(amount) + "\n");
		}
		
		//display results
		JOptionPane.showMessageDialog(null, outputTextArea,"Compound Interest", JOptionPane.INFORMATION_MESSAGE);
		
		//terminate app
		System.exit(0);

	}

}
