package com.ssm.exception;

public class BaseEmailException extends Exception {

	public BaseEmailException() {
		super("Email failed!!!");
	}

	public BaseEmailException(String msg) {
		super(msg);
	}

	public BaseEmailException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * File No Found Exception
	 */
	public static class HtmlFileNoFoundException extends BaseEmailException {
		public HtmlFileNoFoundException(String fileName) {
			super(fileName + " File No Found Exception!!!");
		}
	}
	
	/**
	 * Html Name Not Found Exception
	 */
	public static class HtmlNameNoFoundException extends BaseEmailException {
		public HtmlNameNoFoundException(String type) {
			super("'Key = " + type + "' No Found In Database Exception!!!");
		}
	}

}
