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

	/**
	 * Running the application
	 */
	 
	public static void main(String[] args) {
	
		System.out.println("Welcome to Bowling Heaven!");
	
		//Prompt the user to enter the number of players
		System.out.println("Please enter the number of players: ");
	
		//Open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numberOfBowlers;
	
		// Read the number of bowlers from the command line; 
		try {

			String a = br.readLine();
	
			//If the number entered is between 1 and 6, initialise an array
			//of bowlers of this length and continue with the application
    		if (0 < Integer.parseInt(a) && Integer.parseInt(a) < 7) {
        		
        		numberOfBowlers = Integer.parseInt(a);
        		
        		System.out.println("Great, " + numberOfBowlers + " it is!");
        		
        		Bowler[] bowlers = new Bowler[numberOfBowlers];
        		
        		
        		//Store each bowlers name as it is given in the command line
        		for (int i = 0; i < numberOfBowlers; i++) {
        			
        			int iPlusOne = i+1;
        			//Prompt the user to enter the number of players
					System.out.println("Please enter the name of player " + (iPlusOne) + ": ");
					
					String name = br.readLine();
					
					Bowler bowler = new Bowler("");
					bowlers[i] = bowler;
					bowlers[i].setName(name);
						
				}
				
				//Print the names for each player	
        		System.out.println("So the players for this game are: ");
        		for (int i = 0; i < numberOfBowlers; i++) {
        			int iPlusOne = i+1;
        			System.out.println("Player " + (iPlusOne) + ": " + bowlers[i].getName());	
        		}
        		
        		
        		System.out.println("Let's start the game!");
        		
        		
        		//For each bowler, read in the integers from the command line
        		//associated with the number of pins knocked down for both rolls in a frame
        		//Store these in an array 'roll' for each bowler. 
        		
        		for (int j = 0; j < 10; j++) { 
        			for (int i = 0; i < numberOfBowlers; i++) {
        				
        				int jPlusOne = j+1;
        				int iPlusOne = i+1;
        				System.out.println("Frame " + jPlusOne);
        				System.out.println("Player " + iPlusOne + ": " + bowlers[i].getName() + " is up!"); 
        			
        				int pins = Integer.parseInt(br.readLine());
        				//TODO NEED METHOD HERE TO THROW ERROR IF AMOUNT ENTERED IS GREATER THAN 10
	       				if (pins == 10) {
        					System.out.println("Strike!");
        					bowlers[i].setRolls(j, pins);
        				}
        				else if (0 <= pins && pins < 10) {
        					bowlers[i].setRolls(j, pins);
        				}
        				else {
        					//TODO: NEED TO THROW AN EXCEPTION
        					System.out.println("This is not a valid number");
        					//TODO: NEED TO LOOP BACK
        				}
        				
        				pins = Integer.parseInt(br.readLine());
	       				if (pins == 10) {
        					System.out.println("Strike!");
        					bowlers[i].setRolls(j+1, pins);
        				}
        				else if ((0 <= pins && pins < 10 - bowlers[i].getRolls(j)) | ((0 <= pins && pins < 10) && bowlers[i].getRolls(j) == 10)) {
        					bowlers[i].setRolls(j+1, pins);
        				}        				
        				
        				else if (bowlers[i].getRolls(j) + pins == 10) {
        					System.out.println("Spare!");
        					bowlers[i].setRolls(j+1, pins);
        				}
        				else {
        				    //TODO: NEED TO THROW AN EXCEPTION
        					System.out.println("This is not a valid number");
        				}
        				
        			}
        		}
    			
    			
    			//Print out the pins knocked down per frame for each bowler
    			for (int i = 0; i < numberOfBowlers; i++) {
    				
    				int iPlusOne = i+1;
    				System.out.println("So, per frame " + bowlers[i].getName() + " knocked down: "); 
    				
    				for (int j = 0; j < 10; j++) {
    					
    					int totalPinsKnockedInAFrame = bowlers[i].getRolls(j) + bowlers[i].getRolls(j+1);
    					int jPlusOne = j+1;
    					
    					//TODO FIX THIS
    					System.out.println("Frame " + jPlusOne + ": " + totalPinsKnockedInAFrame);
    				}
    			}
    		
			}
    		
    		else {
    			System.out.println("This is not a valid format. Please enter a number between 1 and 6: ");  				
				//TODO: LOOP BACK
				//if still not in a valid format:
				//System.out.println("You don't seem to have the right amount of people. Please try again when you do!");
   			}

   		} //try

   		catch (NumberFormatException e) {
   			System.out.println(e.getMessage());
  	 	}
	   	catch (IOException e) {
  	 		System.out.println(e.getMessage());
 		} 		
 		

	} //end of main
    
} // end of BowlingGame class