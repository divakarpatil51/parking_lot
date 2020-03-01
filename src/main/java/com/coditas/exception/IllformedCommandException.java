package com.coditas.exception;

/**
 * Exception thrown in case of ill-formed command is found.
 */
public class IllformedCommandException extends RuntimeException {

	private static final long serialVersionUID = -7916916889893987249L;

	public IllformedCommandException(String message) {
		super(message);
	}
}
