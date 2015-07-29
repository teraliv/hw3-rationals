/*
 * CSCI 143 - Summer 2015 
 * Assignment 3 - Rationals
 * Rationals.java
 * July 20 2015
 * Alex Terikov (teraliv@gmail.com)
 */

package rationals;

import exceptions.DivideByZeroException;

/**
 * A class to create a rational number.
 * 
 * @author Alex Terikov
 * @version 1.0
 */
public class Rational {
	
	/** The numerator value. */
	private int myNumerator;
	
	/** The denominator value. */
	private int myDenominator;
	
	/**
	 * Constructs a new rational number.
	 * 
	 * @param theNumberator The numerator value.
	 * @param theDenominator The denominator value.
	 */
	public Rational(int theNumberator, int theDenominator) {
		myNumerator = theNumberator;
		myDenominator = theDenominator;
		
		if (myDenominator == 0) {
			throw new DivideByZeroException("An error occured creating a Rational object: " 
												+ myNumerator + "/" + myDenominator);
		}
	}
	
	/**
	 * This method returns numerator value.
	 * 
	 * @return Returns the numerator value.
	 */
	public int getNumerator() {
		return myNumerator;
	}
	
	/**
	 * This method returns denominator value.
	 * 
	 * @return Returns denominator value.
	 */
	public int getDenominator() {
		return myDenominator;
	}
	
	/**
	 * String representation of rational number.
	 * 
	 * {@Override}
	 */
	public String toString() {
		return myNumerator + "/" + myDenominator;
	}
}
