package chapter_10;
/*
 * How to program Java
 * Fig 10.16 demonstrate the insert and delete methods of StringBuffer
 */

import javax.swing.*;

public class StringBufferInsert {

	public static void main(String[] args) {
		Object o = "hello";
		String s = "good bye";
		char charArray[] = {'a', 'b', 'c', 'd','e'};
		boolean b = true;
		char c = 'K';
		int i = 7;
		long l = 10000000;
		float f = 2.5f;
		double d = 33.333;
		StringBuffer buffer = new StringBuffer();
		
		buffer.insert(0, o);
		buffer.insert(0," ");
		buffer.insert(0, s);
		buffer.insert(0, " ");
		buffer.insert(0, charArray);
		buffer.insert(0, " ");
		buffer.insert(0, b);
		buffer.insert(0," ");
		buffer.insert(0, c);
		buffer.insert(0," ");
		buffer.insert(0, i);
		buffer.insert(0, " ");
		buffer.insert(0, l);
		buffer.insert(0, " ");
		buffer.insert(0, f);
		buffer.insert(0, " ");
		buffer.insert(0, d);
		
		String output = "buffer after inserts: \n" + buffer.toString();
		
		buffer.deleteCharAt(10); //delete 5 in 2.5
		buffer.delete(2, 6); //delete .333 in 33.333
		
		output += "\n\nbuffer after deletes:\n " + buffer.toString();
		
		JOptionPane.showMessageDialog(null, output, "Demonstrate StringBuffer Inserts and Deletes", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
