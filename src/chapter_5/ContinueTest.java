package chapter_5;

/*
 * How to program java
 * Fig 5.12 ContinueTest.java Using the continue statement in a for structure
 */

import javax.swing.JOptionPane;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		//loop 10x
		for(int count = 1; count <=10; count++){
			//if count = 5, continue with next iteration of loop
			if(count == 5){
				continue; //skip remaining code in loop, only if count == 5
			}
			output += count + " ";
		}
		
		output += "\nUsed continue to skip printing 5";
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);

	}

}
