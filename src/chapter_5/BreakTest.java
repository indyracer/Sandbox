package chapter_5;

/*
 * How to Program Java
 * BreakTest.java
 * Fig 5.11 Using the Break statement in a for structure
 */

import javax.swing.JOptionPane;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		int count;
		
		//loop 10x
		for(count = 1; count <= 10; count++){
			//if count is 5, terminate loop
			if(count == 5){
				break;
			}
			
			output += count + " ";
		}
		
		output += "\nBroke out of loop at count " + count;
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	}

}
