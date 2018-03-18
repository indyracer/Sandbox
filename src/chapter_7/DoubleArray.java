package chapter_7;
/*
 * How to program java
 * Fig 7.16 Double-subscripted array example
 */

import java.awt.*;
import javax.swing.*;

public class DoubleArray extends JApplet{
	
	int grades[][] = {{77,68,86,73},{96,87,89,81},{70,90,86,81}};
	
	int students, exams;
	String output;
	JTextArea outputArea;
	
	//initialize instance variables
	public void init(){
		students = grades.length;  //number students
		exams = grades[0].length; //number of exams
		
		//create JTextArea and attach applet
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
		//build output string
		output = "The array is:\n";
		buildString();
		
		//call methods minimum and maximum
		output += "\n\nLowest grade: " + minimum() +
				"\nHighest grade; " + maximum() + "\n";
		
		//call method average to calculate each students average
		for(int counter = 0; counter < students; counter++){
			output += "\nAverage for student " + counter + " is " + average(grades[counter]);
		}
		
		//change outputArea's display font
		outputArea.setFont(new Font ("Courier", Font.PLAIN, 12));
		
		//place output string in outputArea
		outputArea.setText(output);
	}
	
	//find minimum grade
	public int minimum(){
		//assume first element of grades array is smallest
		int lowGrade = grades[0][0];
		
		//loop through rows of grades array
		for(int row = 0; row < students; row++){
			//loop through columns of current row
			for (int column = 0; column < exams; column++){
				//test if current grade is less than lowGrade
				//If so, assign current grade to low grade
				if(grades[row][column] < lowGrade){
					lowGrade= grades[row][column];
				}
			}
		}
		
		return lowGrade;
	}
	
	//find max grade
	public int maximum(){
		//Assume first element of grades array is highest
		int highGrade = grades[0][0];
		
		//loop through rows of grade array
		for (int row = 0; row < students; row++){
			//loop through columns of grade array
			for(int column = 0; column < exams; column++){
				//test if current grade is higher than highGrade
				//if so assign current grade to highGrade
				if(grades[row][column] > highGrade){
					highGrade = grades[row][column];
				}
			}
		}
		
		return highGrade;
	}
	
	//determine average grade for particular student (or set of grades)
	public double average(int setOfGrades[]){
		int total = 0;  //initialize total
		
		//sum grades for one student
		for(int count = 0; count < setOfGrades.length; count++){
			total += setOfGrades[count];
		}
		
		return (double) total / setOfGrades.length;
	}
	
	//build output string
	public void buildString(){
		output += "          "; //used to align column heads
		
		//create column heads
		for(int counter = 0; counter < exams; counter++){
			output += "[" + counter + "] ";
		}
		
		//create row/column of text representing array grades
		for(int row = 0; row < students; row++){
			output += "\ngrades[" + row + "] ";
			
			for(int column = 0; column < exams; column++){
				output += grades[row][column] + "  ";
			}
		}
	}

}
