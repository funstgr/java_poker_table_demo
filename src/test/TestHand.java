/*
 * Copyright (c) TestHand.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import poker.Card;
import poker.CardValue;
import poker.Hand;
import poker.Suit;

/**
 * The TestHand class is used by the FiveCardPokerEvalEngineTest as a way to
 * test the getOrderedHand() and handEvaluator() methods in
 * FiveCardPokerEvalEngine. Putting a series of test hands here is a way to keep
 * the code cleaner and easy to read. The TestHand(s) here only have getter
 * methods.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */
public class TestHand {

	public TestHand() {

	}

	public Hand getHighStraightFlushSpades() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Spades, CardValue.Queen),
				new Card(Suit.Spades, CardValue.King),
				new Card(Suit.Spades, CardValue.Ten) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowStraightFlushSpades() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Spades, CardValue.Three),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Spades, CardValue.Five),
				new Card(Suit.Spades, CardValue.Six) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowStraightFlushHearts() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Hearts, CardValue.Three),
				new Card(Suit.Hearts, CardValue.Four),
				new Card(Suit.Hearts, CardValue.Five),
				new Card(Suit.Hearts, CardValue.Six) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighFourOfA_Kind() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Diamonds, CardValue.Ace) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowFourOfA_Kind() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Diamonds, CardValue.Two) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighFullHouse() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Diamonds, CardValue.Jack) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowFullHouse() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Jack),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Diamonds, CardValue.Two) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowFlushHearts() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Hearts, CardValue.Three),
				new Card(Suit.Hearts, CardValue.Four),
				new Card(Suit.Hearts, CardValue.Five),
				new Card(Suit.Hearts, CardValue.Seven) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowFlushSpades() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Spades, CardValue.Three),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Spades, CardValue.Five),
				new Card(Suit.Spades, CardValue.Seven) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighFlushSpades() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Spades, CardValue.Three),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Spades, CardValue.Five),
				new Card(Suit.Spades, CardValue.Ace) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighStraight() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Queen),
				new Card(Suit.Spades, CardValue.King),
				new Card(Suit.Diamonds, CardValue.Ten) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowStraight() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Hearts, CardValue.Five),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Diamonds, CardValue.Three),
				new Card(Suit.Spades, CardValue.Six) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighThreeOfA_Kind() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Diamonds, CardValue.Ace) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowThreeOfA_Kind() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Diamonds, CardValue.Two) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getHighTwoPair() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.King),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.King),
				new Card(Suit.Diamonds, CardValue.Ace) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowTwoPair() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Diamonds, CardValue.Four),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Hearts, CardValue.Two),
				new Card(Suit.Clubs, CardValue.Two) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getLowTwoPairTieCheck() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Spades, CardValue.Two),
				new Card(Suit.Clubs, CardValue.Four),
				new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Hearts, CardValue.Four) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getAceHighCard() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Eight),
				new Card(Suit.Spades, CardValue.Jack),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.King),
				new Card(Suit.Diamonds, CardValue.Seven) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getAceHighCardTieCheck() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Diamonds, CardValue.Eight),
				new Card(Suit.Hearts, CardValue.Jack),
				new Card(Suit.Spades, CardValue.Ace),
				new Card(Suit.Hearts, CardValue.King),
				new Card(Suit.Diamonds, CardValue.Seven) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getSevenHighCard() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Hearts, CardValue.Three),
				new Card(Suit.Spades, CardValue.Seven),
				new Card(Suit.Diamonds, CardValue.Five) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getOnePairHigh() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Four),
				new Card(Suit.Hearts, CardValue.Ace),
				new Card(Suit.Spades, CardValue.Seven),
				new Card(Suit.Diamonds, CardValue.Ace) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getOnePairLow() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Clubs, CardValue.Five),
				new Card(Suit.Hearts, CardValue.Three),
				new Card(Suit.Spades, CardValue.Seven),
				new Card(Suit.Hearts, CardValue.Five) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

	public Hand getOnePairLowTieCheck() {

		List<Card> testHandList = null;
		Hand hand = new Hand();
		Card[] testHand1 = { new Card(Suit.Clubs, CardValue.Two),
				new Card(Suit.Spades, CardValue.Five),
				new Card(Suit.Hearts, CardValue.Three),
				new Card(Suit.Spades, CardValue.Seven),
				new Card(Suit.Diamonds, CardValue.Five) };

		testHandList = new LinkedList<Card>(Arrays.asList(testHand1));
		hand.setHand(testHandList);

		return hand;
	}

}
