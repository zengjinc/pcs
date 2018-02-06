package com.ssm.exception;

public class BaseEhcacheException extends Exception {

	public BaseEhcacheException() {
		super("Ehcache failed!!!");
	}

	public BaseEhcacheException(String msg) {
		super(msg);
	}

	public BaseEhcacheException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * Not Found Cache Exception
	 */
	public static class NotCacheFoundException extends BaseEhcacheException {
		public NotCacheFoundException() {
			super("No Found Cache!!!");
		}
	}


}
