package com.tg.diceroller;

import java.util.Random;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Button containing a Die and the functionality to roll it.
 * 
 * @author Stephen Davis
 *
 */
public class DieButton extends Button {
	
	// Variables
	
	private Die die;
	
	// Getters/Setters
	
	public int getSides() {
		return die.getSides();
	}
	
	// Constructors
	
	public DieButton(Context context) {
		super(context);
		initialize(Integer.parseInt(this.getTag().toString()));
	}
	
	public DieButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize(Integer.parseInt(this.getTag().toString()));
	}
	
	public DieButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialize(Integer.parseInt(this.getTag().toString()));
	}
	
	// Initialize
	
	private void initialize(int sides) {
			die = new Die(sides);
	}
	
	// Methods
	
	/**
	 * Rolls the die.
	 * @param rng Random Number Generator used to roll the die
	 * @return integer between 1 and the number of sides on the die
	 */
	public int rollDie(Random rng) {
		return die.rollDie(rng);
	}
}
