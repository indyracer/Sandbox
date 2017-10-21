package chapter_5;

/*
 * How to program Java
 * Fig 5.13 using the break statement with a label
 */

import javax.swing.JOptionPane;

public class BreakLabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		
		stop: { //labeled block
			//count 10 rows
			for(int row = 1; row <= 10; row++){
				//count 5 columns
				for(int column = 1; column <= 5; column++){
					//if row == 5, jump to end of "stop" block
					if(row == 5)
						break stop; //jump to end of stop block
						
						output += "* ";
						 //end of inner structure
					output += "\n";
				} //end outer for structure
				//the following line is skipped
				output +="\nLoops terminated normally";
				
				
			} // end labeled block
			
			JOptionPane.showMessageDialog(null, output, "Testing break with a label", JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}

	}

}
