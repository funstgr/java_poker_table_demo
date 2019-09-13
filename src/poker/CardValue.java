/*
 * Copyright (c) CardValue.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston  
 */

package poker;

/**
 * Enum class used to create ordinal and integer values for Cards
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public enum CardValue {
	Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(
			10), Jack(11), Queen(12), King(13), Ace(14);

	int cv;

	CardValue(int cv) {
		this.cv = cv;
	}

	public int cardValue() {
		return cv;
	}
}
