package chapter_13;
/*
 * How to program java
 * Fig 13.3 Using a custom Panel Object
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomePanelTest extends JFrame{
	private JPanel buttonPanel;
	private CustomPanel myPanel;
	private JButton circleButton, squareButton;
	
	//set up GUI
	public CustomePanelTest()
	{
		super("CustomPanel Test");
		
		//create custom drawing area
		myPanel = new CustomPanel();
		myPanel.setBackground(Color.GREEN);
		
		//set up square button
		squareButton = new JButton("Square");
		squareButton.addActionListener(
				//anonymous inner class to handle squareButton events
				new ActionListener(){
					//draw square
					public void actionPerformed(ActionEvent event){
						myPanel.draw(CustomPanel.SQUARE);
					}
				}// end anonymous inner class
			);//end call to addActionListener
		
		circleButton = new JButton("Circle");
		circleButton.addActionListener(
				//anonymous inner class to handle circleButton events
				new ActionListener(){
				public void actionPerformed(ActionEvent event){
					myPanel.draw(CustomPanel.CIRCLE);
					}
				}//end anonymous inner class
			);//end call to addActionListener
		
		//set up panel containing buttons
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,2));
		buttonPanel.add(circleButton);
		buttonPanel.add(squareButton);
		
		//attach button panel & custom drawing area to content pane
		Container container = getContentPane();
		container.add(myPanel, BorderLayout.CENTER);
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomePanelTest application = new CustomePanelTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
