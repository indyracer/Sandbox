package chapter_10;

/*
 * How to program java
 * Fig 10.21 Card shuffling and dealing program
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeckOfCards extends JFrame {
	
	private Card deck[];
	private int currentCard;
	private JButton dealButton, shuffleButton;
	private JTextField displayField;
	private JLabel statusLabel;
	
	//set up deck of cards and GUI
	
	public DeckOfCards(){
		super("Card Dealing Program");
		
		String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[52];
		currentCard = -1;
		
		//populate deck with Card objects
		for (int count = 0; count < deck.length; count++){
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
		
		//set up GUI
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		dealButton = new JButton("Deal Card");
		dealButton.addActionListener(
				//anonymous inner class
				new ActionListener(){
					//deal one card
					public void actionPerformed(ActionEvent actionEvent){
						Card dealt = dealCard();
						
						if(dealt != null){
							displayField.setText(dealt.toString());
							statusLabel.setText("Card #: " + currentCard);
						}
						else{
							displayField.setText("NO MORE CARDS TO DEAL");
							statusLabel.setText("Shuffle cards to continue");
						}
					}
				}//end call to actionListener
				);//end call to AddActionListener
		
		container.add(dealButton);
		
		shuffleButton = new JButton("Shuffle Cards");
		shuffleButton.addActionListener(
				//anonymous inner class
				new ActionListener(){
					//shuffle deck
					public void actionPerformed(ActionEvent actionEvent){
						displayField.setText("Shuffling.....");
						shuffle();
						displayField.setText("DECK IS SHUFFLED");
					}
				}//end anonymous inner class
				
				);//end call to addActionListener
		
		container.add(shuffleButton);
		
		displayField = new JTextField(20);
		displayField.setEditable(false);
		container.add(displayField);
		
		statusLabel = new JLabel();
		container.add(statusLabel);
		
		setSize(275,120);
		show();
		}
	
	//shuffle deck of cards with one-pass algorithm
	public void shuffle(){
		
		currentCard = -1;
		
		//for each card, pick another random card and swap them
		for(int first = 0; first < deck.length; first++){
			int second = (int)(Math.random() * 52);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		dealButton.setEnabled(true);
		
	}
	
	//deal one card
	public Card dealCard(){
		if(++currentCard < deck.length){
			return deck[currentCard];
		}
		else{
			dealButton.setEnabled(false);
			return null;
		}
	}

	//execute program
	public static void main(String[] args) {
		DeckOfCards app = new DeckOfCards();
		
		app.addWindowListener(
				//anonymous inner class
				new WindowAdapter(){
					//terminate application when user closes window
					public void windowClosing(WindowEvent windowEvent){
						System.exit(0);
					}
				}//end anonymous inner class
				
				);//end call to addWindowListener

	}//end method main
	
	// class to represent Card
	class Card{
		private String face;
		private String suit;
		
		//constructor to initialize a card
		public Card(String cardFace, String cardSuit){
			face = cardFace;
			suit = cardSuit;
		}
		
		//return String representation of Card
		public String toString(){
			return face + " of " + suit;
		}
	}//end class card

}
