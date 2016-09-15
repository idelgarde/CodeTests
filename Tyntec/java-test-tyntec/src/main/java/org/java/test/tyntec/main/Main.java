package org.java.test.tyntec.main;

import java.util.Map;
import org.java.test.tyntec.main.core.GameCore;
import org.java.test.tyntec.types.Types;

/**
 *  Main Class application
 */
public class Main 
{	
	/*
	 * The application is ready to be changed for a different playing choice for player A.
	 * If the method compareChoices(Types playerAChoice, Types playerBChoice) from GameCore class is called, 
	 * the application is ready to work with different options for players A and B 
	 */
	final static Types playerAChoice = Types.PAPER;
	final static int gamesAmount = 100;

	
	public static void main(String[] args) {
		GameCore gc = new GameCore();

		Map<String, Integer> results = gc.processRandomly(gamesAmount, playerAChoice);
		
		/*
		 * First option as a result
		 * Prints in console with the results as requested
		 */
		System.out.println("Player A wins "+ results.get("A") +" of "+gamesAmount+" games");
		System.out.println("Player B wins "+ results.get("B") +" of "+gamesAmount+" games");
		System.out.println("Tie: "+ results.get("T") +" of "+gamesAmount+" games");
		
		/*
		 * Second option as a result
		 * The method resultAsString(gamesAmount) returns a String with formatted as requested
		 */
		
//		Uncomment the line below to get the full result as only one String 
//		System.out.println(gc.resultAsString(gamesAmount));
	}
}
