package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] strings) {

		final int CARDS_IN_DECK = 52;

		int cardNumber = (int) (Math.random() * CARDS_IN_DECK);

		System.out.print("The card you picked is a(n) ");
		if (cardNumber % 13 == 0) {
			System.out.print("Ace of ");
		} else if (cardNumber % 13 == 10) {
			System.out.print("Jack of ");
		} else if (cardNumber % 13 == 11) {
			System.out.print("Queen of ");
		} else if (cardNumber % 13 == 12) {
			System.out.print("King of ");
		} else {
			System.out.print(cardNumber % 13 + " of ");
		}

		if (cardNumber / 13 == 0) {
			System.out.println("Clubs!");
		} else if (cardNumber / 13 == 1) {
			System.out.println("Diamonds!");
		} else if (cardNumber / 13 == 2) {
			System.out.println("Hearts!");
		} else if (cardNumber / 13 == 3) {
			System.out.println("Spades!");
		}
	}

}
