package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	/*
	 * Deck
	 * 	 * i. Fields
	 * 	 * 1. cards (List of Card)
	 * 	 * ii. Methods
	 * 	 * 1. shuffle (randomizes the order of the cards)
	 * 	 * 2. draw (removes and returns the top card of the Cards field)
	 * 	 * 3. In the constructor, when a new Deck is instantiated, the Cards field
	 * should be populated with the standard 52 cards.
	 */
	
	List<Card> cards = new ArrayList<Card>();

	  Deck(){
		  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		  String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				  				"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		  
		  for(String suit : suits) {
			  int count = 2;
			  for (String number : numbers) {
				  Card card = new Card (number, suit, count);
				  this.cards.add(card);
				  count++;
			  }
		  }
	  }

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	  
	  
	  public void describe() {
		  for (Card card : this.cards) {
			  card.describe();
		  }
	  }
	  public void shuffle() {
		  Collections.shuffle(this.cards);
	  }
	  public Card draw() {
		  Card card = this.cards.remove(0);
		  return card;
	  }
}
