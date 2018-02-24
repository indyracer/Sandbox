package chapter_6;

/*
 * Fig. 6.1: Scoping.java
 * A scoping example
 */

import java.awt.Container;
import javax.swing.*;

public class Scoping extends JApplet{
	
	JTextArea outputArea;
	
	//instance variable accessible to all methods of this class
	int x = 1;
	
	//set up applets GUI
	public void init(){
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
	} // end method init
	
	//method start called after init completes; start calls
	//method useLocal and useInstance
	public void start(){
		int x = 5; //variable local to method start
		
		outputArea.append("local x in start is " + x);
		
		useLocal();  //useLocal has local x
		useInstance();  //useInstance uses instance variable x
		useLocal();  //useLocal reinitializes local x
		useInstance();  //instance variable x retains its value
		
		outputArea.append("\n\nlocal x in start is " + x);
	}  //end method start
	
	//useLocal reinitializes local variable x during each call
	public void useLocal(){
		int x = 25; //initializes each time useLocal is called
		
		outputArea.append("\n\nlocal x in useLocal is " + x + " after entering useLocal");
		
		++x;
		outputArea.append("\nlocal x in useLocal is " + x + " before exiting useLocal");
	} //end useLocal
	
	//useInstance modifies instance variable x during each call
	public void useInstance() {
		outputArea.append("\n\ninstance variable x is " + x + " on entering useInstance");
		
		x *= 10;
		
		outputArea.append("\ninstance variable x is " + x + " on exiting useInstance");
	} //exit method useInstance

} // end class Scoping
