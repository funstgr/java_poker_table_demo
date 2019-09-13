/*
 * Copyright (c) FiveCardPokerEvalEngineTest.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package test;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import poker.FiveCardPokerEvalEngine;
import poker.Hand;
import poker.Result;

/**
 * The FiveCardPokerEvalEngineTest class is used to test the
 * FiveCardPokerEvalEngine. The FiveCardPokerEvalEngine has 2 public methods:
 * getOrderedHand() and handEvaluator(). These methods are tested for the proper
 * return results in this class. TestHand(s) in the TestHand class are used to
 * assist in performing this job.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */
public class FiveCardPokerEvalEngineTest extends TestCase {

	// used to evaluate and sort poker hands
	private static FiveCardPokerEvalEngine pokerEvalEngine = new FiveCardPokerEvalEngine();

	public void testFiveCardPokerEvalEngine() {

		// used to hold a Result for high hand test
		Result winner = null;

		/**
		 * Test a series of TestHand(s) for order. Each TestHand is named for
		 * it's appropriate Poker Hand
		 */

		Hand highStraightFlushSpades = new TestHand()
				.getHighStraightFlushSpades();
		assertEquals(
				"[Ace of Spades, King of Spades, Queen of Spades, Jack of Spades, Ten of Spades]",
				pokerEvalEngine.getOrderedHand(highStraightFlushSpades)
						.toString());

		Hand lowStraightFlushSpades = new TestHand()
				.getLowStraightFlushSpades();
		assertEquals(
				"[Six of Spades, Five of Spades, Four of Spades, Three of Spades, Two of Spades]",
				pokerEvalEngine.getOrderedHand(lowStraightFlushSpades)
						.toString());

		Hand lowStraightFlushHearts = new TestHand()
				.getLowStraightFlushHearts();
		assertEquals(
				"[Six of Hearts, Five of Hearts, Four of Hearts, Three of Hearts, Two of Hearts]",
				pokerEvalEngine.getOrderedHand(lowStraightFlushHearts)
						.toString());

		Hand lowFourOfA_Kind = new TestHand().getLowFourOfA_Kind();
		assertEquals(
				"[Two of Clubs, Two of Hearts, Two of Spades, Two of Diamonds, Jack of Spades]",
				pokerEvalEngine.getOrderedHand(lowFourOfA_Kind).toString());

		Hand highFourOfA_Kind = new TestHand().getHighFourOfA_Kind();
		assertEquals(
				"[Ace of Clubs, Ace of Hearts, Ace of Spades, Ace of Diamonds, Jack of Spades]",
				pokerEvalEngine.getOrderedHand(highFourOfA_Kind).toString());

		Hand lowFullHouse = new TestHand().getLowFullHouse();
		assertEquals(
				"[Two of Hearts, Two of Spades, Two of Diamonds, Jack of Clubs, Jack of Spades]",
				pokerEvalEngine.getOrderedHand(lowFullHouse).toString());

		Hand highFullHouse = new TestHand().getHighFullHouse();
		assertEquals(
				"[Ace of Clubs, Ace of Hearts, Ace of Spades, Jack of Spades, Jack of Diamonds]",
				pokerEvalEngine.getOrderedHand(highFullHouse).toString());

		Hand lowFlushSpades = new TestHand().getLowFlushSpades();
		assertEquals(
				"[Seven of Spades, Five of Spades, Four of Spades, Three of Spades, Two of Spades]",
				pokerEvalEngine.getOrderedHand(lowFlushSpades).toString());

		Hand lowFlushHearts = new TestHand().getLowFlushHearts();
		assertEquals(
				"[Seven of Hearts, Five of Hearts, Four of Hearts, Three of Hearts, Two of Hearts]",
				pokerEvalEngine.getOrderedHand(lowFlushHearts).toString());

		Hand highFlush = new TestHand().getHighFlushSpades();
		assertEquals(
				"[Ace of Spades, Five of Spades, Four of Spades, Three of Spades, Two of Spades]",
				pokerEvalEngine.getOrderedHand(highFlush).toString());

		Hand highStraight = new TestHand().getHighStraight();
		assertEquals(
				"[Ace of Clubs, King of Spades, Queen of Hearts, Jack of Spades, Ten of Diamonds]",
				pokerEvalEngine.getOrderedHand(highStraight).toString());

		Hand lowStraight = new TestHand().getLowStraight();
		assertEquals(
				"[Six of Spades, Five of Hearts, Four of Spades, Three of Diamonds, Two of Spades]",
				pokerEvalEngine.getOrderedHand(lowStraight).toString());

		Hand highThreeOfA_Kind = new TestHand().getHighThreeOfA_Kind();
		assertEquals(
				"[Ace of Hearts, Ace of Spades, Ace of Diamonds, Jack of Spades, Two of Clubs]",
				pokerEvalEngine.getOrderedHand(highThreeOfA_Kind).toString());

		Hand lowThreeOfA_Kind = new TestHand().getLowThreeOfA_Kind();
		assertEquals(
				"[Two of Clubs, Two of Hearts, Two of Diamonds, Ace of Spades, Jack of Spades]",
				pokerEvalEngine.getOrderedHand(lowThreeOfA_Kind).toString());

		Hand highTwoPair = new TestHand().getHighTwoPair();
		assertEquals(
				"[Ace of Hearts, Ace of Diamonds, King of Clubs, King of Spades, Jack of Spades]",
				pokerEvalEngine.getOrderedHand(highTwoPair).toString());

		Hand lowTwoPair = new TestHand().getLowTwoPair();
		assertEquals(
				"[Four of Diamonds, Four of Spades, Two of Hearts, Two of Clubs, Ace of Spades]",
				pokerEvalEngine.getOrderedHand(lowTwoPair).toString());

		Hand lowTwoPairTieCheck = new TestHand().getLowTwoPairTieCheck();
		assertEquals(
				"[Four of Clubs, Four of Hearts, Two of Spades, Two of Clubs, Ace of Spades]",
				pokerEvalEngine.getOrderedHand(lowTwoPairTieCheck).toString());

		Hand onePairHigh = new TestHand().getOnePairHigh();
		assertEquals(
				"[Ace of Hearts, Ace of Diamonds, Seven of Spades, Four of Spades, Two of Clubs]",
				pokerEvalEngine.getOrderedHand(onePairHigh).toString());

		Hand onePairLow = new TestHand().getOnePairLow();
		assertEquals(
				"[Five of Clubs, Five of Hearts, Seven of Spades, Three of Hearts, Two of Clubs]",
				pokerEvalEngine.getOrderedHand(onePairLow).toString());

		Hand onePairLowTieCheck = new TestHand().getOnePairLowTieCheck();
		assertEquals(
				"[Five of Spades, Five of Diamonds, Seven of Spades, Three of Hearts, Two of Clubs]",
				pokerEvalEngine.getOrderedHand(onePairLowTieCheck).toString());

		Hand aceHighCard = new TestHand().getAceHighCard();
		assertEquals(
				"[Ace of Hearts, King of Spades, Jack of Spades, Eight of Clubs, Seven of Diamonds]",
				pokerEvalEngine.getOrderedHand(aceHighCard).toString());

		Hand lowHighCard = new TestHand().getSevenHighCard();
		assertEquals(
				"[Seven of Spades, Five of Diamonds, Four of Spades, Three of Hearts, Two of Clubs]",
				pokerEvalEngine.getOrderedHand(lowHighCard).toString());

		Hand aceHighCardTieCheck = new TestHand().getAceHighCardTieCheck();
		assertEquals(
				"[Ace of Spades, King of Hearts, Jack of Hearts, Eight of Diamonds, Seven of Diamonds]",
				pokerEvalEngine.getOrderedHand(aceHighCardTieCheck).toString());

		/**
		 * Evaluate pairs of TestHand(s) for a winner. The winner is returned by
		 * a Result enum Object. This Result is tested against an expected
		 * Result.
		 */

		// test highStraightFlushSpades against lowStraightFlushSpades
		winner = evaluateHands(winner, highStraightFlushSpades,
				lowStraightFlushSpades);
		assertEquals(Result.Hand1, winner);

		// test lowStraightFlushSpades against lowStraightFlushHearts
		winner = evaluateHands(winner, lowStraightFlushSpades,
				lowStraightFlushHearts);
		assertEquals(Result.Tie, winner);

		// test highStraightFlushSpades against lowFourOfA_Kind
		winner = evaluateHands(winner, highStraightFlushSpades, lowFourOfA_Kind);
		assertEquals(Result.Hand1, winner);

		// test lowFourOfA_Kind against highFourOfA_Kind
		winner = evaluateHands(winner, lowFourOfA_Kind, highFourOfA_Kind);
		assertEquals(Result.Hand2, winner);

		// test highFourOfA_Kind against lowFullHouse
		winner = evaluateHands(winner, highFourOfA_Kind, lowFullHouse);
		assertEquals(Result.Hand1, winner);

		// test lowFullHouse against highFullHouse
		winner = evaluateHands(winner, lowFullHouse, highFullHouse);
		assertEquals(Result.Hand2, winner);

		// test lowFlushSpades against lowFullHouse
		winner = evaluateHands(winner, lowFlushSpades, highFullHouse);
		assertEquals(Result.Hand2, winner);

		// test lowFlushSpades against lowFlushHearts
		winner = evaluateHands(winner, lowFlushSpades, lowFlushHearts);
		assertEquals(Result.Tie, winner);

		// test lowFlushSpades against highFlush
		winner = evaluateHands(winner, lowFlushSpades, highFlush);
		assertEquals(Result.Hand2, winner);

		// test highStraight against lowFlushSpades
		winner = evaluateHands(winner, highStraight, lowFlushSpades);
		assertEquals(Result.Hand2, winner);

		// test highStraight against lowStraight
		winner = evaluateHands(winner, highStraight, lowStraight);
		assertEquals(Result.Hand1, winner);

		// test lowFullHouse against highStraight
		winner = evaluateHands(winner, lowFullHouse, highStraight);
		assertEquals(Result.Hand1, winner);

		// test lowFullHouse against highThreeOfA_Kind
		winner = evaluateHands(winner, lowFullHouse, highThreeOfA_Kind);
		assertEquals(Result.Hand1, winner);

		// test highStraight against highThreeOfA_Kind
		winner = evaluateHands(winner, highStraight, highThreeOfA_Kind);
		assertEquals(Result.Hand1, winner);

		// test highFourOfA_Kind against lowThreeOfA_Kind
		winner = evaluateHands(winner, highFourOfA_Kind, lowThreeOfA_Kind);
		assertEquals(Result.Hand1, winner);

		// test lowThreeOfA_Kind against highThreeOfA_Kind
		winner = evaluateHands(winner, lowThreeOfA_Kind, highThreeOfA_Kind);
		assertEquals(Result.Hand2, winner);

		// test aceHighCard against highThreeOfA_Kind
		winner = evaluateHands(winner, aceHighCard, highThreeOfA_Kind);
		assertEquals(Result.Hand2, winner);

		// test lowFullHouse against highStraight
		winner = evaluateHands(winner, lowFullHouse, highStraight);
		assertEquals(Result.Hand1, winner);

		// test highFourOfA_Kind against lowFullHouse
		winner = evaluateHands(winner, lowFullHouse, highFullHouse);
		assertEquals(Result.Hand2, winner);

		// test highFourOfA_Kind against lowFullHouse
		winner = evaluateHands(winner, lowFullHouse, highFullHouse);
		assertEquals(Result.Hand2, winner);

		// test lowTwoPair against highTwoPair
		winner = evaluateHands(winner, lowTwoPair, highTwoPair);
		assertEquals(Result.Hand2, winner);

		// test aceHighCard against lowFullHouse
		winner = evaluateHands(winner, aceHighCard, lowFullHouse);
		assertEquals(Result.Hand2, winner);

		// test lowFourOfA_Kind against highThreeOfA_Kind
		winner = evaluateHands(winner, lowFourOfA_Kind, highThreeOfA_Kind);
		assertEquals(Result.Hand1, winner);

		// test lowTwoPairTieCheck against lowTwoPairTieCheck
		winner = evaluateHands(winner, lowTwoPair, lowTwoPairTieCheck);
		assertEquals(Result.Tie, winner);

		// test aceHighCard against onePairHigh
		winner = evaluateHands(winner, aceHighCard, onePairHigh);
		assertEquals(Result.Hand2, winner);

		// test onePairLow against onePairHigh
		winner = evaluateHands(winner, onePairLow, onePairHigh);
		assertEquals(Result.Hand2, winner);

		// test onePairLow against onePairLowTieCheck
		winner = evaluateHands(winner, onePairLow, onePairLowTieCheck);
		assertEquals(Result.Tie, winner);

		// test aceHighCard against aceHighCardTieCheck
		winner = evaluateHands(winner, aceHighCard, aceHighCardTieCheck);
		assertEquals(Result.Tie, winner);

		// test aceHighCard against lowHighCard
		winner = evaluateHands(winner, aceHighCard, lowHighCard);
		assertEquals(Result.Hand1, winner);

	}

	/**
	 * Evaluates 2 hands for the winner. It is a private method called from the
	 * testFiveCardPokerEvalEngine() method to reduce repetitive code in the
	 * method and make it easier to read.
	 * 
	 * @param result
	 *            - holds the result to be returned. *
	 * @param hand1
	 *            - The 1st hand to be analyzed
	 * @param hand2
	 *            - The 2nd hand to be analyzed
	 * 
	 * @return A Result Object which represents the winner of the table.
	 */
	private Result evaluateHands(Result result, Hand hand1, Hand hand2) {

		// used to hold a list of test hands
		List<Hand> hands = new LinkedList<>();

		hands.add(hand1);
		hands.add(hand2);
		hands = pokerEvalEngine.handEvaluator(hands);

		/**
		 * Current design has the result stored in all hands. Test for this.
		 */
		assertEquals(hand1.getResult(), hand2.getResult());
		result = hand1.getResult();

		return result;
	}

	public static Test suite() {
		return new TestSuite(FiveCardPokerEvalEngineTest.class);
	}
}
