/*
 * Copyright (c) Deck.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

import java.util.TreeMap;

/**
 * The Deck class holds a brand new deck of 52 cards. The cards are in all 4
 * suits and in order when a new deck is created. This class has a getter for
 * the deck of cards returned as a TreeMap and indexed with integers 0 to 51.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public class Deck {
	public TreeMap<Integer, Card> deck = new TreeMap<Integer, Card>();

	public Deck() {
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (CardValue rank : CardValue.values()) {
				Card card = new Card(suit, rank);
				deck.put(i, card);
				i++;
			}
		}
	}

	public TreeMap<Integer, Card> getDeck() {
		return deck;
	}
}
