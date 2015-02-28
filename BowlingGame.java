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
		
		int numberOfBowlers;
	
		// Read the number of bowlers from the command line; 
		try {

			String a = br.readLine();
	
    		if (0 < Integer.parseInt(a) && Integer.parseInt(a) < 7) {
        		numberOfBowlers = Integer.parseInt(a);
        		System.out.println("Great, " + numberOfBowlers + " it is!");
        		
        		
        		//Create a list of the bowlers 
        		Bowler[] bowlers = new Bowler[numberOfBowlers];
        		//List<Bowler> bowlers = new ArrayList<Bowler>();
        		
        		for (int i = 0; i < numberOfBowlers; i++) {
        			
        			//Prompt the user to enter the number of players
					System.out.println("Please enter the name of bowler " + (i+1) + ": ");
					
					String name = br.readLine();
					
					//Method 1 with array
					Bowler bowler = new Bowler("");
					bowlers[i] = bowler;
					bowlers[i].setName(name);
					System.out.println(bowlers[i]);
					
					//Method 2 with Array list
					//Bowler bowler = new Bowler("");
					//bowler.setName(name);
					//bowlers.add(bowler);
					//System.out.println(bowlers.get(i));
					
				}
					
        		System.out.println( "So the players for this game are: " + bowlers);	
    		
			}
    		
    		else {
    			System.out.println("This is not a valid format. Please enter a number between 1 and 6.");
  				//TODO: LOOP BACK
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