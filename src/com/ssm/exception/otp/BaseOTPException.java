package com.ssm.exception.otp;

public class BaseOTPException extends Exception {

	public BaseOTPException() {
		// TODO Auto-generated constructor stub
		super("User failed!!!");
	}

	public BaseOTPException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	public BaseOTPException(String msg, Throwable e) {
		// TODO Auto-generated constructor stub
		super(msg, e);
	}

	/**
	 * OTP Expired Exception
	 */
	public static class OTPExpiredException extends BaseOTPException {
		public OTPExpiredException() {
			// TODO Auto-generated constructor stub
			super("OTP Expired Exception!!!");
		}
	}

	/**
	 * OTP Not Match Exception
	 */
	public static class OTPNotMathcException extends BaseOTPException {
		public OTPNotMathcException() {
			// TODO Auto-generated constructor stub
			super("OTP Not Mathc Exception!!!");
		}
	}

}
