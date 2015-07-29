/*
 * CSCI 143 - Summer 2015 
 * Assignment 3 - Rationals
 * RationHelper.java
 * July 20 2015
 * Alex Terikov (teraliv@gmail.com)
 */

package rationals;

import exceptions.DivideByZeroException;
import exceptions.NullValueExceptions;

/**
 * A class to help with basic rational arithmetics.
 * 
 * @author Alex Terikov
 * @version 1.0
 *
 */
public class RationHelper {
	
	/** Private constructor to prevent instantiation. */
	private RationHelper() {
		// do nothing
	}
	
	/**
	 * This method is used to add two rational numbers.
	 * 
	 * @param theFirst The first rational number.
	 * @param theSecond The second rational number.
	 * @return The sum of two rational numbers.
	 */
	public static Rational add(Rational theFirst, Rational theSecond) {
		
		if (theFirst == null || theSecond == null) {
			throw new NullValueExceptions("An error occurred when calling add() with null arguments");
		}
		
		final Rational result;
		final int numerator;
		
		if (theFirst.getDenominator() != theSecond.getDenominator()) {
		
			final int commonDenominator = theFirst.getDenominator() * theSecond.getDenominator(); 
			numerator = theFirst.getNumerator() * theSecond.getDenominator() + 
					    theSecond.getNumerator() * theFirst.getDenominator();
			
			result = new Rational(numerator, commonDenominator);
		
		} else {
			
			numerator = theFirst.getNumerator() + theSecond.getNumerator();
			result = new Rational(numerator, theFirst.getDenominator());
		}
		
		return result;
	}
	
	/**
	 * This method is used to subtract one rational number from another.
	 * 
	 * @param theFirst The first rational number.
	 * @param theSecond The second rational number.
	 * @return The difference of two rational numbers.
	 */
	public static Rational subtract(Rational theFirst, Rational theSecond) {
		
		if (theFirst == null || theSecond == null) {
			throw new NullValueExceptions("An error occurred when calling subtract() with null arguments");
		
		} 
		
		final Rational result;
		final int numerator;
		
		if (theFirst.getDenominator() != theSecond.getDenominator()) {
			
			final int commonDenominator = theFirst.getDenominator() * theSecond.getDenominator();
			numerator = theFirst.getNumerator() * theSecond.getDenominator() - 
						theSecond.getNumerator() * theFirst.getDenominator();
			
			result = new Rational(numerator, commonDenominator);
		
		} else {
			
			numerator = theFirst.getNumerator() - theSecond.getNumerator();
			result = new Rational(numerator, theFirst.getDenominator());
		}
		
		return result;
	}
	
	/**
	 * This method is used to divide two rational numbers.
	 * 
	 * @param theFirst The first rational number.
	 * @param theSecond The second rational number.
	 * @return The quotient of two rational numbers.
	 */
	public static Rational divide(Rational theFirst, Rational theSecond) {
		
		if (theFirst == null || theSecond == null) {
			throw new NullValueExceptions("An error occurred when calling divide() with null arguments");
		
		} else if (theSecond.getNumerator() == 0) {
			
			throw new DivideByZeroException("An error occurred dividing Rationals objects " + 
											theFirst.toString() + " and " + theSecond.toString());
		}
		
		int numerator = theFirst.getNumerator() * theSecond.getDenominator();
		int denominator = theFirst.getDenominator() * theSecond.getNumerator();
		
		return new Rational(numerator, denominator);
	}
	
	/**
	 * This method is used to multiply two rational numbers.
	 * 
	 * @param theFirst The first rational number.
	 * @param theSecond The second rational number
	 * @return The product of two rational numbers.
	 */
	public static Rational multiply(Rational theFirst, Rational theSecond) {
		
		if (theFirst == null || theSecond == null) {
			throw new NullValueExceptions("An error occurred when calling multiply() with null arguments");
		}
		
		int numerator = theFirst.getNumerator() * theSecond.getNumerator();
		int denominator = theFirst.getDenominator() * theSecond.getDenominator();
		
		return new Rational(numerator, denominator);
	}
	
}
