/*
 * 
 */

import java.util.*; 
import java.io.*;


/**
 * A class representing a bowler in a ten pin bowling game.
 */

public class Bowler {

	private String bowlerName;
	
	
	/**
	 * 
	 */
	
	public Bowler(String bowlerName) {
		bowlerName = this.bowlerName;
	} 
	
	
	/**
	 *
	 */
	 
	 public String getBowlerName() {
	 	return bowlerName;
	 }
	 
	 
	/**
	 * Updates the bowlers name
	 */
	  
    public void setBowlerName(String newBowlerName) {
        bowlerName = newBowlerName;
    }
	  
	
} // end of Bowler class