package com.tg.diceroller;

import java.util.Random;

/**
 * A die with the functionality to roll a random number between 1 and the specified limit (sides).
 * If no limit is specified, or the value is < 1, sides will be set as the default (DEFAULT_SIDES).
 * 
 * @author Stephen Davis
 *
 */
public class Die {
	
	// Constants
	
	public static final int DEFAULT_SIDES = 6;
	
	// Variables
	
	private int sides;
	
	// Getters/Setters
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int value) {
		sides = value;
	}
	
	// Constructors
	
	public Die() {
		this(DEFAULT_SIDES);
	}
	
	public Die(int sides) {
		if (sides < 1)
			this.sides = DEFAULT_SIDES;
		else
			this.sides = sides;
	}
	
	// Methods
	
	/**
	 * Rolls the die.
	 * @param rng Random Number Generator used to roll the die
	 * @return integer between 1 and the number of sides on the die
	 */
	public int rollDie(Random rng) {
		return rng.nextInt(sides) + 1;
	}
}
