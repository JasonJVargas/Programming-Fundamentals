import java.util.Random;

public class Card {

	public static void main(String[] args) {

		System.out.println("I am going to deal 5 random cards.\n");

		Card hand = new Card();

		System.out.print(hand.playerCard() + " of " + hand.playerSuit() + "\n" + hand.playerCard() + " of "
				+ hand.playerSuit() + "\n" + hand.playerCard() + " of " + hand.playerSuit() + "\n" + hand.playerCard()
				+ " of " + hand.playerSuit() + "\n" + hand.playerCard() + " of " + hand.playerSuit() + "\n");

	}

	public String playerCard() {
		int[] card = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int rndCard = card[new Random().nextInt(card.length)];
		String str;
		switch (rndCard) {
		case 1:
			str = "Ace";
			break;

		case 11:
			str = "Jack";
			break;

		case 12:
			str = "Queen";
			break;

		case 13:
			str = "King";
			break;

		default:
			str = Integer.toString(rndCard);
			break;
		}
		return str;

	}

	public String playerSuit() {
		String[] suit = { "Spades", "Clubs", "Diamonds", "Hearts" };
		String rndSuit = suit[new Random().nextInt(suit.length)];
		return rndSuit;
	}
}