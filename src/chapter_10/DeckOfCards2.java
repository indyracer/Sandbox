package chapter_10;

/*
 * How to program java
 * Excercise 10.3 Deal 5 cards, evaluate poker hands
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeckOfCards2 extends JFrame {
	
	private Card deck[];
	private Card card1, card2, card3, card4, card5;
	private int currentCard;
	private JButton dealButton, shuffleButton;
	private JTextField displayField, displayCard1, displayCard2, displayCard3, displayCard4, displayCard5;
	private JLabel statusLabel;
	
	//set up deck of cards and GUI
	
	public DeckOfCards2(){
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
						//statusLabel set to blank, resets after each deal
						statusLabel.setText("");
						
						//Card dealt = dealCard();
						card1 = dealCard();
						card2 = dealCard();
						card3 = dealCard();
						card4 = dealCard();
						card5 = dealCard();
						
						displayCard1.setText(card1.toString());
						displayCard2.setText(card2.toString());
						displayCard3.setText(card3.toString());
						displayCard4.setText(card4.toString());
						displayCard5.setText(card5.toString());
						
						if(isPair(card1, card2, card3, card4, card5)){
							statusLabel.setText("Hand contains a pair");
						}
						
						/*if(card1 != null){
							displayField.setText(card1.toString());
							statusLabel.setText("Card #: " + currentCard);
						}
						else{
							displayField.setText("NO MORE CARDS TO DEAL");
							statusLabel.setText("Shuffle cards to continue");
						}*/
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
		
		displayCard1 = new JTextField(20);
		displayCard1.setEditable(false);
		container.add(displayCard1);
		
		displayCard2 = new JTextField(20);
		displayCard2.setEditable(false);
		container.add(displayCard2);
		
		displayCard3 = new JTextField(20);
		displayCard3.setEditable(false);
		container.add(displayCard3);
		
		displayCard4 = new JTextField(20);
		displayCard4.setEditable(false);
		container.add(displayCard4);
		
		displayCard5 = new JTextField(20);
		displayCard5.setEditable(false);
		container.add(displayCard5);
		
		
		statusLabel = new JLabel();
		container.add(statusLabel);
		
		setSize(250,600);
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
	
	//methods to evaluate poker hands
	public boolean isPair(Card card1, Card card2, Card card3, Card card4, Card card5){
		//Checks if there are pairs.  If a pair is found, add to score.  if score at end of evaluations is 1, then there is only 1 pair, return true
		boolean pair = false;  //sets pair to false
		int score = 0;
		if(card1.face.equals(card2.face) || card1.face.equals(card3.face) || card1.face.equals(card4.face) || card1.face.equals(card5.face)){
			score++;
		}
		if (card2.face.equals(card3.face) || card2.face.equals(card4.face) || card2.face.equals(card5.face)){
			score++;
		}
		if (card3.face.equals(card4.face) || card3.face.equals(card5.face)){
			score++;
		} 
		if (card4.face.equals(card5.face)){
			score++;
		}
		
		if(score == 1){
			pair = true;
		} 
		
		return pair;
	}
	
	public boolean isThreeKind (Card card1, Card card2, Card card3, Card card4, Card card5){
		//start here, need to finish up three of a kind
		//similar to pair, score the results.  if score is 1, then only one set of 3 of a kind
		boolean trips = false;
		int score = 0;
		
		//cards into an array
		Card hand [] = {card1, card2, card3, card4, card5};
		
		//count per card
		int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0 , count7 = 0, count8 = 0, count9 = 0, count10 = 0, countJ = 0, countQ = 0, countK = 0, countA = 0;
		
		for(int i = 0; i < hand.length; i++){
			switch(hand[i].face){
			case "Deuce":
				count2++;
				break;
			case "Three":
				count3++;
				break;
			case "Four":
				count4++;
				break;
			case "Five":
				count4++;
				break;
			case "Six":
				count6++;
				break;
			case "Seven":
				count7++;
				break;
			case "Eight":
				count8++;
				break;
			case "Nine":
				count9++;
				break;
			case "Ten":
				count10++;
				break;
			case "Jack":
				countJ++;
				break;
			case "Queen":
				countQ++;
				break;
			case "King":
				countK++;
				break;
			default:
				countA++;
			}
		}
		
		if(count2 == 3 || count3 == 3 || count4 == 3 || count5 == 3 || count6 ==3 || count7 == 3 || count8 == 3 || count9 == 3 ||
				count10 == 3 || countJ == 3 || countQ == 3 || countK == 3 || countA == 3){
			trips = true;
		}
		
		return trips;	
	}

	//execute program
	public static void main(String[] args) {
		DeckOfCards2 app = new DeckOfCards2();
		
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
		
		//return the face value of a card
		public String faceValue(){
			return face;
		}
		
		public String suitValue(){
			return suit;
		}
	}//end class card

}
