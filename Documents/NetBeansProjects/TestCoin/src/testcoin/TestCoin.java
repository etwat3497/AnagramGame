/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcoin;

/**
 *
 * @author rkaune
 */
public class TestCoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Coin nickel = new Coin();
		nickel.kauneRocks();
		nickel.flipCoin();
                System.out.println(nickel.showFace());
                System.out.println(nickel.toString());
		if (nickel.showFace() == 0) {
			System.out.println("Heads up!");
		} else {
			System.out.println("Tails up!");
		}
	}
}
