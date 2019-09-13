/*
 * Copyright (c) Player.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

/**
 * The Player class is used to hold a card Hand. There is a getter and setter
 * provided for Hand.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public class Player {

	// Each Player has a Hand of cards
	private Hand hand;

	public Player() {
		this.hand = new Hand();
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
