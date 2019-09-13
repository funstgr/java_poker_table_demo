/*
 * Copyright (c) EvaluateCardHand.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston  
 */
package poker;

import java.util.List;

/**
 * The EvaluateCardHand Interface implemented by classes to evaluate Card Hands.
 * 
 * @author Gregory Funston
 * @version 1.0
 */
public interface EvaluateCardHand {

	public List<Hand> handEvaluator(List<Hand> hands);

	public List<Card> getOrderedHand(Hand hand);
}
