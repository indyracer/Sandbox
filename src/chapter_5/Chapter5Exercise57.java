package chapter_5;

/*
 * How to Program Java
 * Exercise 5.7 calculate the product of odd integers from 1 to 15
 */

import javax.swing.JOptionPane;

public class Chapter5Exercise57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		
		for(int i = 1; i <= 15; i++){
			//check that number is odd
			if(i % 2 != 0){
				product = product * i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "The Product of odd integers between 1 and 15 is:  " + product, "Answer", JOptionPane.INFORMATION_MESSAGE);

	}

}
