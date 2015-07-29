/*
 * CSCI 143 - Summer 2015 
 * Assignment 3 - Rationals
 * NullValueExceptions.java
 * July 20 2015
 * Alex Terikov (teraliv@gmail.com)
 */

package exceptions;

/**
 * A custom exception class to catch a null value as a parameter.
 * 
 * @author Alex Terikov
 * @version 1.0
 */
public class NullValueExceptions extends RuntimeException {
	
	// used to hide warnings. 
	/** A default generated serialization number. */
	private static final long serialVersionUID = -3659514905035717214L;

	/**
	 * Constructs a new null value exception.
	 */
	public NullValueExceptions() {
		super("An error occured with null argument.");
	}
	
	/**
	 * Constructs a new null value exception with specified message.
	 * 
	 * @param message The detailed message used by getMessage().
	 */
	public NullValueExceptions(String message) {
		super(message);
	}

}
