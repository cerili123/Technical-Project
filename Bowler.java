/*
 * BBC technical project
 * Cerian Lindsay 2015
 */

import java.util.*; 
import java.io.*;


/**
 * A class representing a bowler in a ten pin bowling game.
 */

public class Bowler {

	//
	private String name;
	
	//Define an array of integers to store the scores in a bowlers game.
	//A game consists of 10 frames, each of two rolls.
	//A bowler earns a bonus roll if they score a strike in the final frame.
	private int[] rolls = new int[21];
	
	//
	int score;
	
	
	/**
	 * 
	 */
	
	public Bowler(String name) {
		name = this.name;
		rolls = this.rolls;
		score = 0;
		
	} 
	
	
	/**
	 *
	 */
	 
//	 public String getName() {
//	 	return name;
//	 }
	 
	 
	/**
	 * Updates the bowlers name - not important?
	 */
	  
    public void setName(String newName) {
        name = newName;
    }
    
    
	/**
	 * A method to store the score from a bowlers game,
	 * specifying a strike, spare and bonus ...
	 */
	 
	public void setScore() /* throws exception*/ {
		
		for (int j = 0; j < 20; j = j+2) {
			
			if (rolls[j] == 10) {
				//strike!
				score += rolls[j] + rolls[j+1] + rolls[j+2];
			}
			
			else if (rolls[j] + rolls[j+1] == 10) {
				//spare!
				score += rolls[j] + rolls[j+1] + rolls[j+2];
			}
			
			else if (rolls[j] + rolls[j+1] < 10 ) {
				score += rolls[j] + rolls[j+1];
			}
			
		}
		
	} //end of score() method
	
	
	/**
	 *
	 */
	    
    public int[] getRolls() {
    	return rolls;
    }
     
	
} // end of Bowler class
