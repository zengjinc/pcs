package com.ssm.exception.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pcs.controller.PermissionController;

public class BaseDaoException extends Exception {

	private static Logger logger = LogManager.getLogger(BaseDaoException.class);
	public BaseDaoException() {
		// TODO Auto-generated constructor stub
		super("Dao failed!!!");
	}

	public BaseDaoException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	public BaseDaoException(String msg, Throwable e) {
		// TODO Auto-generated constructor stub
		super(msg, e);
	}

	/**
	 * Condition Is Not Allow Null Exception
	 */
	public static class ConditionIsNotAllowNullException extends BaseDaoException {
		public ConditionIsNotAllowNullException() {
			// TODO Auto-generated constructor stub
			super("Condition Is Not Allow Null Exception");
			logger.debug("Condition Is Not Allow Null Exception");
		}
	}
	
	/**
	 * No Found Table Exception
	 */
	public static class NoFoundTableException extends BaseDaoException {
		public NoFoundTableException() {
			// TODO Auto-generated constructor stub
			super("No Found Table Exception");
			logger.debug("No Found Table Exception");
		}
	}
	
	/**
	 * No Found Key Of Mapping Exception
	 */
	public static class NoFoundKeyOfMappingException extends BaseDaoException {
		public NoFoundKeyOfMappingException() {
			// TODO Auto-generated constructor stub
			super("No Found Key Of Mapping Exception");
			logger.debug("No Found Key Of Mapping Exception");
		}
	}

	/**
	 * No Config Found Exception
	 */
	public static class NoConfigFoundException extends BaseDaoException {
		public NoConfigFoundException() {
			// TODO Auto-generated constructor stub
			super("No Config Found Exception");
			logger.debug("No Config Found Exception");
		}
	}


}
