package chapter_5;

/*
 * how to program java
 * Using the continue statement with a label Fig. 5.14
 */

import javax.swing.JOptionPane;

public class ContinueLabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		
		nextRow:  //target label of continue statement
			
			//count 5 rows
			for(int row = 1; row <= 5; row++){
				
				output += "\n";
				
				//count 10 columns per row
				for(int column = 1; column <= 10; column++){
					//if column greater than row, start next row
					if(column > row){
						continue nextRow;  //next iteration of labeled loop
					}
					
					output += "* ";
				}
			}
		
		JOptionPane.showMessageDialog(null, output, "testing continue with a label", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
