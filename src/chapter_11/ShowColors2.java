package chapter_11;

/*
 * How to program java
 * Fig 11.6 Demonstrating JColorChooser
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowColors2 extends JFrame {
	private JButton changeColorButton;
	private Color color = Color.lightGray;
	private Container container;

	//set GUI
	public ShowColors2(){
		super("Using JColorChooser");
		container = getContentPane();
		container.setLayout(new FlowLayout());

		//setup changeColorButton and register its event handler
		changeColorButton = new JButton("Change Color");
		changeColorButton.addActionListener(

				//anonymous inner class
				new ActionListener(){
					//display JcolorChooser when user clicks button
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(ShowColors2.this, "Choose a color", color);
						//set default if no color selected
						if(color == null){
							color = color.LIGHT_GRAY;
						}

						//change content pane's background color
						container.setBackground(color);
					}
				}
			);
		
		container.add(changeColorButton);
		setSize(400, 130);
		setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowColors2 application = new ShowColors2();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
