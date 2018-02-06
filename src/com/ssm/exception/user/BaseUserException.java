package com.ssm.exception.user;

public class BaseUserException extends Exception {

	/**
	 *  BaseUserException generator method
	 */
	public BaseUserException() {
		// TODO Auto-generated constructor stub
		super("User failed!!!");
	}

	/**
	 *  BaseUserException generator method with String
	 */
	public BaseUserException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	/**
	 *  BaseUserException generator method with String & Throwable
	 */
	public BaseUserException(String msg, Throwable e) {
		// TODO Auto-generated constructor stub
		super(msg, e);
	}

	/**
	 * Pwd Not Match Exception
	 */
	public static class PwdNotMatchException extends BaseUserException {
		public PwdNotMatchException() {
			// TODO Auto-generated constructor stub
			super("Pwd Not Match Exception!!!");
		}
	}



}
