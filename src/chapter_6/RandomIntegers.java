package chapter_6;

/*
 * How to program Java
 * Fig 6.7 Shifted, scaled random integers
 */

import javax.swing.JOptionPane;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		String output = "";
		
		//loop 20 times
		for(int counter = 1; counter <= 20; counter++){
			//pick random integer between 1 and 6
			value = 1 + (int) (Math.random() * 6);
			
			output += value + " "; //append value to output
			
			//if counter disvisble by 5
			//append newine to String output
			if(counter % 5 == 0){
				output += "\n";
			}
		}//end for structure
		
		JOptionPane.showMessageDialog(null, output, "20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
