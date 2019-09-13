/*
 * Copyright (c) SuiteTest.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * The SuiteTest class is used to run a suite of unit tests for the poker game.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */
public class SuiteTest {

	public static void main(String[] args) {
		// Runs the entire TestSuite
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new TestSuite("All Tests");

		suite.addTest(new TestSuite(DealerTest.class));
		suite.addTest(new TestSuite(DeckTest.class));
		suite.addTest(new TestSuite(FiveCardPokerEvalEngineTest.class));

		return suite;
	}
}
