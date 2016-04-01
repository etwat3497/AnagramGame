/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rps2;
import java.util.Scanner;
 
 /**
 * Computer plays Rock Paper Scissors against one player.
 */
 public class RPS2 {

	public static void main(String[] args) {
		RPSGame rps = new RPSGame();
		RPSPlayer rpsOpponent = new RPSPlayer();
		int rounds;
		int playerThrow;
		Scanner input = new Scanner(System.in);
		
		/* play RPS */
		System.out.print("How many rounds? ");
		rounds = input.nextInt();
		for (int i = 0; i < rounds; i++) {
			System.out.print("Enter your throw (ROCK=1, PAPER=2, SCISSORS=3): ");
			playerThrow = input.nextInt();
			rpsOpponent.makeThrow(playerThrow);
		
			rps.makeCompThrow();
			rps.announceWinner(rpsOpponent.getThrow());
		}
		rps.bigWinner();
	}
}