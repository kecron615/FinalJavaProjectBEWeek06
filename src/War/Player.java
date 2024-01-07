package War;
import java.util.ArrayList;
import java.util.List;

public class Player {
	/*Player

	i.     Fields
        1. hand (List of Card)
	 	2. score (set to 0 in the constructor)
	    3. name
	ii.    Methods
	    1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
	    2. flip (removes and returns the top card of the Hand)
	    3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	    4. incrementScore (adds 1 to the Player’s score field)
}*/
		List<Card> hand = new ArrayList<Card>();
		int score;
		String name;
		
		public Player(String name) {
			this.name = name;
			this.score = 0;
		}
		public void describe() {
			System.out.println("********************************************");
			System.out.println(name + " with a score of: " + score + "; has the following cards: ");
			System.out.println("********************************************");
			for (Card card : hand) {
				card.describe();
			}
		}
		
		public Card flip() {
			Card drawTopCard = hand.get(0);
			hand.remove(0);
			return drawTopCard;
		}
		
		public void draw (Deck deck) {
			Card card = deck.draw();
			hand.add(card);
		}
		
		public void incrementScore() {
			this.score++;
		}
		
		public int getScore() {
			return score;
		}
}