package chapter_10;

/*
 * How to program java
 * Exercise 10.7 Use compareTo to compare two strings
 */

import javax.swing.*;
import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String first = in.nextLine();
		
		System.out.println("Enter a second string: ");
		
		String second = in.nextLine();
		
		if(first.compareTo(second) > 0){
			System.out.println(first + " is greater than " + second);
		}
		else if (first.compareTo(second) < 0){
			System.out.println(first + " is less than " + second);
		}
		else{
			System.out.println(first + " is equal to " + second);
		}

	}

}
