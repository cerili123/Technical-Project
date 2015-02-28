/*
 * BBC technical project
 * Cerian Lindsay 2015
 */
 
import java.util.*; 
import java.io.*;

/**
 * A class to calculate the score of a ten pin bowling game for up to 6 bowlers
 */
	 
public class BowlingGame {


	public static void main(String[] args) {
	
	
		System.out.println("Welcome to Bowling Heaven!");
	
		//Prompt the user to enter the number of players
		System.out.println("Please enter the number of bowlers: ");
	
		//Open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int numberOfBowlers = 0;
	
		// Read the number of bowlers from the command line; 
    	try {

    		if (0 < Integer.parseInt("br.read()") && Integer.parseInt("br.read()") < 7) {
        		numberOfBowlers = Integer.parseInt("br.read()");
        		System.out.println("Great, " + numberOfBowlers + " it is!");
    		}
    		else {
    			System.out.println("This is not a valid format. Please enter a number between 1 and 6");
        		System.exit(1);
   			}
   		}
   		catch (NumberFormatException e) {
   			System.out.println(e.getMessage());
  	 	}
//   	catch (IOException e) {
  // 		System.out.println(e.getMessage());
 		//}

	} //end of main
    
} // end of BowlingGame class