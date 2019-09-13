/*
 * Copyright (c) Table.java 1.0 10/15/2012
 * 
 * Author: Gregory L. Funston
 */

package poker;

/**
 * The Table class is used to hold Players. It is used to hold 2 Players
 * currently but more can be added by creating more constructors and players.
 * 
 * @author Gregory L.Funston
 * @version 1.0
 */

public class Table {

	/**
	 * Players to be added to the Table. Additional Tables with greater numbers
	 * of players can be added by creating new constructors and adding more
	 * Player objects to this class. Getters and Setters are required for each
	 * Player
	 */
	private Player player1;
	private Player player2;

	Table(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
}
