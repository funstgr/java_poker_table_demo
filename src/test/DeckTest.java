/*
 * Copyright (c) DeckTest.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston 
 */

package test;

import java.util.TreeMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import poker.Card;
import poker.CardValue;
import poker.Deck;
import poker.Suit;

/**
 * The DeckTest class is an extension of TestCase and is part of the JUnit test
 * framework. This class creates a reference deck and compares it against the
 * deck which is created in the Deck class when it is instantiated.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */
public class DeckTest extends TestCase {

	public void testDeck() {

		// the deck to be tested
		Deck deck = new Deck();

		// used to hold the reference deck
		TreeMap<Integer, Card> testDeck = new TreeMap<Integer, Card>();

		// create a reference deck
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (CardValue rank : CardValue.values()) {

				Card card = new Card(suit, rank);
				testDeck.put(i, card);
				i++;
			}
		}

		// confirm both decks have 52 cards
		assertTrue("Both Decks do not have 52 cards", testDeck.size() == 52
				&& deck.getDeck().size() == 52);

		// confirm both decks have identical keys
		assertTrue(
				"The reference deck and the test deck keys are not the same.",
				testDeck.keySet().equals(deck.getDeck().keySet()));

		TreeMap<Integer, Card> cards = deck.getDeck();

		// used to ensure that assertTrue is only performed once
		int bt = 0;

		// compare the test Deck and the Deck cards.
		for (Integer index : cards.keySet()) {
			Card card = cards.get(index);
			boolean cardTest = (card.getCard().equals(
					testDeck.get(index).getCard()) && card.getSuit().equals(
					testDeck.get(index).getSuit()));

			// only increment if cardTest is false
			if (!cardTest) {
				bt++;
			}

			/**
			 * The above for loop tests for Suit and card value of each card. If
			 * any card fails it makes the cardTest boolean false and increments
			 * the int bt. If either of these conditions occur the test fails.
			 */
			assertTrue(
					"The reference deck and the test deck cards are not the same.",
					cardTest && bt == 0);
		}

		// confirm the test Deck and the reference Deck are not the same object.
		assertFalse("The test Deck is the Deck", testDeck.equals(deck));
	}

	public static Test suite() {
		return new TestSuite(DeckTest.class);
	}

}
