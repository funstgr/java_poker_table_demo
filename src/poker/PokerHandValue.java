/*
 * Copyright (c) PokerHandValue.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

/**
 * Enum class used to create ordinal and integer value hands for Poker
 * evaluations.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public enum PokerHandValue {

	StraightFlush(9), FourOfA_Kind(8), FullHouse(7), Flush(6), Straight(5), ThreeOfA_KInd(
			4), TwoPair(3), OnePair(2), HighCard(1);

	int cv;

	PokerHandValue(int cv) {
		this.cv = cv;
	}

	public int handValue() {
		return cv;
	}

}
