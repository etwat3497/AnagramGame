/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcoin;

/**
 *
 * @author rkaune
 */
import java.util.Random;

public class Coin {
	private int faceUp;	//0 for heads up, 1 for tails up
	Random r = new Random();
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Coin object created. Coin is heads up.
	 */
	public Coin() {
		faceUp = 0;			//heads up
	}
	

	/** 
	 * Returns the side of the coin that is up.
	 * pre: none
	 * post: The face up of the coin has been returned.
	 */
	public int showFace() {
	 	return(faceUp);
	}


	/** 
	 * Flips the coin.
	 * pre: none
	 * post: The coin has been flipped.
	 */
	public void flipCoin() {
	 	
	 	faceUp = r.nextInt(2);
                
	}
        
        public String toString(){
            return("Heads Up");
        }
        
        public void kauneRocks(){
            //do something here
        }
}
