/*
 * 
 */
 
import java.util.*; 
import java.io.*;

/**
 *
 */
	 
public class BowlingCalculator {

/*	//Define an array of integers to store the scores in a players game.
	//A game consists of 10 frames, each of two rolls.
	//A player earns a bonus roll if they score a strike in the final frame. 
	
	private int[] rolls = new int[21];
*/	
	
	private int[] rolls = {1,1, 2,5, 1,8, 10,4, 9,1, 0,0, 2,5, 2,5, 8,1, 8,2};
	
	
	/**
	 *
	 */
	 
	 public BowlingCalculator(Bowler bowler) {
	 	this.bowler = bowler;
	 }	
	
	
	/**
	 *
	 */
	 
	private int[] getRolls() {
		return rolls;
	}
	
	
	/**
	 * A method to store the score from a players game,
	 * specifying a strike, spare and bonus ...
	 */
	 
	public int score(Bowler bowler) {
		
		//Initialise the score as 0
		int score = 0;
		
		//Assigns the variable 'rolls' with the array of pins knocked down by a specified bowler 
		rolls = getRolls();
		
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
		
		return score;
	
	} //end of score() method


	/**
	 * Gets a bowler's total score
	 */
	 
//    public int getScore() {
//        return score;
//    }

	public static void main(String[] args){
	
		BowlingCalculator calc = new BowlingCalculator(bowler1);
		//Bowler bowler1 = new Bowler("The Dude");
		
		System.out.println(calc.score(bowler1));
		
	}
    
} // end of BowlingCalculator