package com.ssm.exception.login;

public class BaseLoginException extends Exception {

	/**
	 * Login Exception
	 */
	public BaseLoginException() {
		// TODO Auto-generated constructor stub
		super("Login failed!!!");
	}

	public BaseLoginException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

	public BaseLoginException(String msg, Throwable e) {
		// TODO Auto-generated constructor stub
		super(msg, e);
	}
    /*
     * Password error exception
     */
	public static class EncryptPWDErroException extends BaseLoginException {
		public EncryptPWDErroException() {
			// TODO Auto-generated constructor stub
			super("Encrypt PWD Erro!!!");
		}
	}
    /*
     * userId and password no match exception
     */
	public static class NoMatchUserIdAndPwdException extends BaseLoginException {
		public NoMatchUserIdAndPwdException() {
			// TODO Auto-generated constructor stub
			super("No Match UserId And Pwd!!!");
		}
	}
	
	/**
	 * No Login certificate Exception
	 */
	public static class NoLoginCerException extends BaseLoginException {
		public NoLoginCerException() {
			// TODO Auto-generated constructor stub
			super("Cer non-existent");
		}
	}
	/*
	 * User has Invalid LoginCer Exception
	 */
	public static class InvalidLoginCerUserException extends BaseLoginException {
		public InvalidLoginCerUserException() {
			// TODO Auto-generated constructor stub
			super("Nvalid user in Login Cer");
		}
	}
	/*
	 * Login without https exception
	 */
	public static class LoginWithoutHttpsException extends BaseLoginException {
		public LoginWithoutHttpsException() {
			// TODO Auto-generated constructor stub
			super("Login Without Https");
		}
	}
	/*
	 * Login reaml is not existent exception
	 */
	public static class LoginReamlNotExistentException extends BaseLoginException {
		public LoginReamlNotExistentException() {
			// TODO Auto-generated constructor stub
			super("Login Reaml Not Existent");
		}
	}
	/*
	 * ADId and password is not match exception
	 */
	public static class ADConnectFailException extends BaseLoginException {
		public ADConnectFailException() {
			// TODO Auto-generated constructor stub
			super("AD Connect Fail Exception!!!");
		}
	}
	/*
	 * No role in ADUser exception
	 */
	public static class NoRoleInADUserException extends BaseLoginException {
		public NoRoleInADUserException() {
			// TODO Auto-generated constructor stub
			super("No Role in ADUser!!!");
		}
	}

}
