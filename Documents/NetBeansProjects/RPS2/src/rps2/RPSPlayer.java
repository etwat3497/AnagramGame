/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rps2;
/**
 * models the player in a game of RPS
 */
public class RPSPlayer {
	private int playerThrow;							//ROCK = 1, PAPER = 2, SCISSORS = 3

	/**
	 * constructor
	 * pre: none
	 * post: RPSPlayer object created. The player is given a default throw.
	 */
	public RPSPlayer() {
		playerThrow = 1;	//default throw
	}
	

	/**
	 * Sets the player's throw.
	 * pre: newThrow is the integer 1, 2, or 3.
	 * post: Player's throw has been made.
	 */
	 public void makeThrow(int newThrow){
	 	playerThrow = newThrow;
	 }
	

	/**
	 * Returns the player's throw.
	 * pre: none
	 * post: Player's throw has been returned.
	 */
	 public int getThrow() {
	 	return(playerThrow);
	 }
	
}