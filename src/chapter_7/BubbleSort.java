package chapter_7;

/*
 * How to program java
 * Fig 7.11 Sort an array's values into ascending order
 */

import java.awt.*;
import javax.swing.*;

public class BubbleSort extends JApplet{

	public void init(){
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
		
		String output = "Data items in original order\n";
		
		//append original array values to string
		for(int counter = 0; counter < array.length; counter++){
			output += " " + array[counter];
		}
		
		bubbleSort(array); //sort array
		
		output += "\n\nData items in acsending order\n";
		
		//append sorted array values to string output
		for (int counter = 0; counter < array.length; counter++){
			output += " " + array[counter];
		}
		
		outputArea.setText(output);
	}

	//sort elements of array with bubble sort
	public void bubbleSort( int array2[]){
		//loop to control number of passes
		for(int pass = 1; pass < array2.length; pass++){
			//loop to control number of comparisons
			for (int element = 0; element < array2.length -1; element++){
				//compare side by side elements and swap them if 
				//first element is greater than second element
				if(array2[element] > array2[element + 1]){
					swap(array2, element, element + 1);
				}//end loop to control comparisons
			}
		}//end loop to control passes
	}//end method bubbleSort		

	public void swap(int[] array3, int first, int second) {
		int hold; //temp holding area for swap

		hold = array3[first];
		array3[first] = array3[second];
		array3[second] = hold;

	}

}
