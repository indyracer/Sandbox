package chapter_12;
/*
 * How to program java
 * Fig 12.13 Using a JComboBox to select an image to display
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxTest extends JFrame{
	
	private JComboBox imagesComboBox;
	private JLabel label;
	private String names[] = {"/smallBug.png", "/smallBug2.png"};
	private Icon bug = new ImageIcon(this.getClass().getResource("/smallBug.png")); 
	private Icon icons[] = {new ImageIcon(this.getClass().getResource(names[0])), new ImageIcon(this.getClass().getResource(names[1]))};
	
	//set up GUI
	public ComboBoxTest(){
		super("Testing JComboBox");
		
		//get content page and set its layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//set up JComboBox and register its event handler
		imagesComboBox = new JComboBox(names);
		imagesComboBox.setMaximumRowCount(2);
		
		imagesComboBox.addItemListener(
				//Anonymous inner class to handle JComboBox events
				new ItemListener(){
					//handle JComboBox event
					public void itemStateChanged(ItemEvent event){
						//determine whether check box selected
						if(event.getStateChange() == ItemEvent.SELECTED){
							label.setIcon(icons[imagesComboBox.getSelectedIndex()]);
						}
					}//end anonymous inner class
				}//end call to addItemListener
				);
		
		container.add(imagesComboBox);
		
		//set up JLabel to display ImageIcons
		label = new JLabel(icons[0]);
		container.add(label);
		
		setSize(350, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		ComboBoxTest application = new ComboBoxTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	

}
