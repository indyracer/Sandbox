package chapter_7;

/*
 * How to program java
 * fig 7.6 total the values of an array
 */

import javax.swing.*;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		//add each element's value to total
		for (int i = 0; i < array.length; i++){
			total += array[i];
		}
		
		JOptionPane.showMessageDialog(null, "Total of array elements: " + total, "Sum of elements of an array", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
