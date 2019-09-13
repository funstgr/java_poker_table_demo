/*
 * Copyright (c) Card.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

/**
 * The Card class is used to hold a Suit and CardValue for each card. There are
 * getters and setters for these Objects.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public class Card {

	private final Suit suit;
	private final CardValue cardValue;

	public Card(Suit suit, CardValue cardValue) {
		this.suit = suit;
		this.cardValue = cardValue;
	}

	public Suit getSuit() {
		return suit;
	}

	public CardValue getCard() {
		return this.cardValue;
	}

	@Override
	public String toString() {
		String card = getCard() + " of " + getSuit().toString();
		return card;
	}
}
