/*
 * Copyright (c) Hand.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

import java.util.LinkedList;
import java.util.List;

/**
 * The Hand class is used to hold Cards and the Hand's value when it is
 * evaluated and the Result of the evaluation.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public class Hand {

	private PokerHandValue handValue;
	private List<Card> hand = new LinkedList<Card>();
	private Result result;

	public Hand() {

	}

	public PokerHandValue getHandValue() {
		return handValue;
	}

	public void setHandValue(PokerHandValue handValue) {
		this.handValue = handValue;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
