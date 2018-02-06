package com.ssm.exception;

public class BaseOauthException extends Exception {

		public BaseOauthException() {
			super("No OAuth!!!");
		}

		public BaseOauthException(String msg) {
			super(msg);
		}

		public BaseOauthException(String msg, Throwable e) {
			super(msg, e);
		}

		/**
		 * Not Found OAuth Exception
		 */
		public static class NotOauthFoundException extends BaseEhcacheException {
			public NotOauthFoundException() {
				super("No OAuth!!!");
			}
		


	}

}
