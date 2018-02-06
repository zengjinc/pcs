package com.ssm.exception;

public class BaseObjectPoolException extends Exception {

	public BaseObjectPoolException() {
		super("ObjectPool failed!!!");
	}

	public BaseObjectPoolException(String msg) {
		super(msg);
	}

	public BaseObjectPoolException(String msg, Throwable e) {
		super(msg, e);
	}

	/**
	 * Not Found Ehcache Exception
	 */
	public static class NoSuchPoolException extends BaseObjectPoolException {
		public NoSuchPoolException() {
			super("Pool Not Found!!!");
		}
		
		public NoSuchPoolException(String msg){
			super(msg);
		}
	}

	/**
	 * Not Found PoolConfig
	 */
	public static class ObjectPoolSettingXmlError extends BaseObjectPoolException {
		public ObjectPoolSettingXmlError(){
			super("PoolConfig Not Found In ObjectPool Setting Xml!!!");
		}
	}
	
	/**
	 * Not Found Object,return object fail,
	 */
	public static class ReturnObjectFail extends BaseObjectPoolException{
		public ReturnObjectFail(){
			super("Return Object Fail,This Object Is Not Found In Pool!!!");
		}
	}

}
