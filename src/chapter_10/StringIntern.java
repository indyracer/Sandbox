package chapter_10;
/*
 * How to program Java
 * Fig 10.11 demonstrating String class method Intern
 */
import javax.swing.*;

public class StringIntern {

	public static void main(String[] args) {
		String s1, s2, s3, s4, output;
		s1 = new String ("hello");
		s2 = new String ("hello");
		
		//test strings to determine if they are the same
		//String object in memory
		if(s1 == s2){
			output = "s1 and s2 are the same object in memory";
		}
		else{
			output = "s1 and s2 are not the same object in memory";
		}
		
		//test string for equality of contents
		if(s1.equals(s2)){
			output += "\ns1 and s2 are equal";
		}
		else{
			output += "\ns1 and s2 are not equal";
		}
		
		//use String intern method to get unique copy of "hello" referred to by both s3 and s4
		s3 = s1.intern();
		s4 = s2.intern();
		
		//test Strings to determine if they are the same
		//String object in memory
		if(s3 == s4){
			output += "\ns3 and s4 are the same object in memory";
		}
		else{
			output += "\ns3 and s4 are not the same object in memory";
		}
		
		//deremine if s1 and s3 refer to same object
		if(s1 == s3){
			output += "\ns1 and s3 are the same object in memory";
		}
		else{
			output += "\ns1 and s3 are not the same object in memeory";
		}
		
		//determine if s2 and s4 refer to the same object
		if(s2 == s4){
			output += "\ns2 and s4 are the same object in memory";
		}
		else {
			output += "\ns2 and s4 are not the same object in memory";
		}
		
		//determine if s1 and s4 refer to the same object
		if(s1 == s4){
			output += "\ns1 and s4 are the same object in memory";
		}
		else {
			output += "\ns1 and s4 are not the same object in memory";
		}
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating String Class Method Intern", JOptionPane.INFORMATION_MESSAGE);;
		
		System.exit(0);
		
	}

}
