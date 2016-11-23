package test;

import java.util.ArrayList;

import core.Deck;
import core.Card;

public class TestDeck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.buildAccessoryDeck("");
		System.out.println(deck.getDeckName() + " is a deck of " + deck.getDeck().size() + " cards.");
		
		ArrayList<Card> AccessoryDeck = deck.getDeck();
		deck.shuffleDeck(AccessoryDeck);
		
		for (Card card : AccessoryDeck)
			System.out.println(card.getCardName());
	}
}
