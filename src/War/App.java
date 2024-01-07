package War;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// adding players name
		/*
		
		Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		d.      After the loop, compare the final score from each player.
		e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.*/
		
	//*a. Instantiate a Deck and two Players, call the shuffle method on the deck.
			Player player1 = new Player("Kate");
			Player player2 = new Player("Jake");
			Deck deck = new Deck();
			deck.shuffle();
		
	// b. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	
			for (int i = 1; i <= 26; i++) {
				player1.hand.add(deck.draw());
				player2.hand.add(deck.draw());			
			}
			
			player1.describe();
			player2.describe();
			
	//c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
			for (int i = 0; i < 26; i++) {
				Card player1Card = player1.flip(); 
				Card player2Card = player2.flip();
				
				System.out.println(player1.name +" "+ player1.getScore());
				System.out.println(player2.name +" "+ player2.getScore());
				
				System.out.println("********************************************");
				System.out.print(player1.name +"'s card is ");
				player1Card.describe();
				System.out.println();
				System.out.print(player2.name + "'s card is ");
				player2Card.describe();
				
	//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.				
				if (player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
					System.out.println("Point to Kate");
				}else if (player1Card.getValue() < player2Card.getValue()) {
					player2.incrementScore();
					System.out.println("Point to Jake");
				}else
					System.out.println("WAR!!");					
					
			}
			// Gives final score
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("AND THE WINNER IS: ");

			if(player1.score > player2.score) {
				System.out.println("***KATE!!*** Final score: " + player1.score + " to " + player2.score);
								
			}else if (player2.score > player1.score) {
				System.out.println("***JAKE!!*** Final score: " + player2.score + " to " + player1.score);

			}else {
				System.out.println("It's a tie!");
			}
		
		}
		
	}


