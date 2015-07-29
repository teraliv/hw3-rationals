/*
 * CSCI 143 - Summer 2015 
 * Assignment 3 - Rationals
 * DivideByZeroException.java
 * July 20 2015
 * Alex Terikov (teraliv@gmail.com)
 */

package exceptions;

/**
 * A custom exception class to catch division by zero.
 * 
 * @author Alex Terikov
 * @version 1.0
 */
public class DivideByZeroException extends RuntimeException {
	
	// used to hide warnings. 
	/** A default generated serialization number. */
	private static final long serialVersionUID = -8000546506111355319L;

	/**
	 * Constructs a new division by zero exception.
	 */
	public DivideByZeroException() {
		super("An error occured creating a Rational object: ");
	}
	
	/**
	 * Constructs a new division by zero exception with specified message.
	 * 
	 * @param message The detailed message used by getMessage().
	 */
	public DivideByZeroException(String message) {
		super(message);
	}
}
