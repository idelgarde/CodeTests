package org.java.test.tyntec.main.core;

import java.util.Random;

import org.java.test.tyntec.types.Types;

public class RandomEnum{
	/*
	 * Method to Randomize the values from Types
	 */
	public static Types randomTypes(){
		Types[] types = Types.values();
		Random randomValue = new Random();
		return types[randomValue.nextInt(types.length)];
	}
}