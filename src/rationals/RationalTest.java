/*
 * CSCI 143 - Summer 2015 
 * Assignment 3 - Rationals
 * RationalTest.java
 * July 20 2015
 * Alex Terikov (teraliv@gmail.com)
 */

package rationals;

import exceptions.DivideByZeroException;
import exceptions.NullValueExceptions;

/**
 * 
 * @author Alex Terikov
 * @version 1.0
 */
public class RationalTest {
	
	/**
	 * The main test method.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		
		mathOperations();
		
		Rational rn1 = null;
		Rational rn2 = null;
		
		// handle zero in denominator exception
		try {
			Rational rn = new Rational(3, 0);
			System.out.println(rn.toString());
		
		} catch (DivideByZeroException ex) {
			System.out.println(ex.getMessage());
		}
		
		// handle division with zero in numerator exception
		try {
			rn1 = new Rational(2, 4);
			rn2 = new Rational(0, 5);
			
			Rational divide = RationHelper.divide(rn1, rn2);
			System.out.println(divide.toString());
			
		} catch (DivideByZeroException ex) {
			System.out.println(ex.getMessage());
		}
		
		// handle null value exception
		try {
			Rational add = RationHelper.add(null, rn2);
			System.out.println(add.toString());
		
		} catch (NullValueExceptions ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	/**
	 * This method performs different math operations with rational numbers.
	 */
	private static void mathOperations() {
		
		Rational rn1 = new Rational(2, 4);
		Rational rn2 = new Rational(4, 5);
		
		Rational add = RationHelper.add(rn1, rn2);
		System.out.println("The result of " + rn1.toString() + " + " + rn2.toString() + " = " +  add.toString());
		
		Rational subtract = RationHelper.subtract(rn1, rn2);
		System.out.println("The resulf of " + rn1.toString() + " - " + rn2.toString() + " = " + subtract.toString());
		
		Rational multiply = RationHelper.multiply(rn1, rn2);
		System.out.println("The resulf of " + rn1.toString() + " * " + rn2.toString() + " = " + multiply.toString());
		
		Rational divide = RationHelper.divide(rn1, rn2);
		System.out.println("The resulf of " + rn1.toString() + " / " + rn2.toString() + " = " + divide.toString());
		
	}
	
}
