package com.ssm.controller;


import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.exception.dao.BaseDaoException.NoConfigFoundException;
import com.ssm.exception.login.BaseLoginException.ADConnectFailException;
import com.ssm.exception.login.BaseLoginException.EncryptPWDErroException;
import com.ssm.exception.login.BaseLoginException.InvalidLoginCerUserException;
import com.ssm.exception.login.BaseLoginException.LoginReamlNotExistentException;
import com.ssm.exception.login.BaseLoginException.LoginWithoutHttpsException;
import com.ssm.exception.login.BaseLoginException.NoLoginCerException;
import com.ssm.exception.login.BaseLoginException.NoMatchUserIdAndPwdException;
import com.ssm.exception.login.BaseLoginException.NoRoleInADUserException;


@Controller
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
//
//	/**
//	 * when can not found page (404), go into specified page
//	 * @throws NoConfigFoundException 
//	 */
//	@RequestMapping(value = "/*")
//	public String noFound(HttpServletRequest request) throws NoConfigFoundException {
//		UserSessionHelper.logoText(request, queryService.queryLogoText());
//		return "/index";
//	}
//	
//	/**
//	 * go to login page
//	 * @throws NoConfigFoundException 
//	 */
//	@RequestMapping(value = "/tologinpage")
//	public String userLogin(HttpServletRequest request) throws NoConfigFoundException {
//		UserSessionHelper.logoText(request, queryService.queryLogoText());
//		return "login/login";
//	}
//	
//	/**
//	 * go to ChangeLanguageLogin page
//	 * @throws NoConfigFoundException 
//	 */
//	@RequestMapping(value = "/tochangelanguageloginpage")
//	public String ChangeLanguageLogin(HttpServletRequest request, HttpSession httpSession) throws NoConfigFoundException {
//		UserSessionHelper.logoText(request, queryService.queryLogoText());
//		String parameter = request.getParameter("language");
//		httpSession.setAttribute("language", request.getParameter("language"));;
//		return "login/login";
//	}
//
//	/**
//	 * login
//	 * @throws NoConfigFoundException 
//	 */
//	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
//	public String userLogin(LoginUser loginUser, HttpServletRequest request, HttpSession httpSession,HttpServletResponse response)
//			throws NoMatchUserIdAndPwdException, EncryptPWDErroException,NoLoginCerException,
//			ADConnectFailException,NoRoleInADUserException,InvalidLoginCerUserException,
//			LoginWithoutHttpsException,LoginReamlNotExistentException,NamingException,InstantiationException,
//			IllegalAccessException,IllegalArgumentException,InvocationTargetException,DocumentException, NoConfigFoundException{
//		
//		    logger.debug("userLogin() begin--");
//		    //get the login realm
//		    String realm = request.getParameter("realm").toString();
//		    logger.debug("get the login realm,realm:"+realm);
//		    
//		    //when realm = local
//		    if(realm.equals("local")){
//		    	
//		    	//Verify username password 
//				LoginUser loginUserResult = authenticService.login(loginUser);
//				logger.debug("loginUserResult:"+loginUserResult);
//				//set user info(uuid, id, name) in httpSession when user Login
//		    	UserSessionHelper.userLogin(httpSession, loginUserResult);
//		    	//get logoTexts
//				UserSessionHelper.logoText(request, queryService.queryLogoText());
//				SessionTokenHelper.setSessionToken(httpSession, loginUserResult,response);
//				return "index";
//			
//		    //when realm = AD
//		    }else if(realm.equals("AD")){
//		    	
//		    	//Get the ADUUID from AD and Query user role in system by ADUUID
//		    	Map<String,String> ADuser = LoginValidateHelper.ADRealmValidate(queryService, loginUser);
//		    	String objectGUID = null;
//		    	String userrole = null;
//		    	//when AD connect fail,ADuser's key have error
//		    	if(ADuser.containsKey("error")){
//		    		throw new ADConnectFailException();
//		    	}else{
//		    		objectGUID = ADuser.get("objectGUID");
//		    		userrole = ADuser.get("ADuserrole");
//		    		//when AD user not role in pcs,userrole equal null
//		    		if(userrole.equals("null")){
//		    			throw new NoRoleInADUserException();
//		    		}
//		    	}
//		    	loginUser.setUuid("AD:"+objectGUID);
//		    	loginUser.setName(loginUser.getId());
//		    	//set user info(uuid, id, name) in httpSession when user Login
//		    	UserSessionHelper.userLogin(httpSession, loginUser);
//		    	//get logoTexts
//				UserSessionHelper.logoText(request, queryService.queryLogoText());
//				SessionTokenHelper.setSessionToken(httpSession, loginUser,response);
//		    	return "index";
//		    
//		    //when realm = Certificate
//		    }else if(realm.equals("Certificate")){
//		    	
//		    	//get the URL
//		    	String URL = request.getRequestURL().toString();
//		    	logger.debug("get the URL,URL:"+URL);
//		    	//when realm = Certificate,must be https
//			    if(URL.startsWith("https:"))  
//			    {  
//			    	
//			    	//get the login user name from Certificate
//			    	Map<String,String> cerlogin = LoginValidateHelper.CertificateRealmValidate(authenticService, request);
//			    	//when No Cer,cerlogin's key have error
//			    	if(cerlogin.containsKey("error")){
//			    		throw new NoLoginCerException();
//			    	}else{
//			    		//when the use name which in cer is not pcs user
//			    		if(cerlogin.containsKey("NoUser")){
//			    			throw new InvalidLoginCerUserException();
//			    		}else{
//			    			loginUser.setId(cerlogin.get("resultLoginUserID"));
//			    			loginUser.setUuid(cerlogin.get("resultLoginUserUUID"));
//			    			loginUser.setName(cerlogin.get("resultLoginUserName"));
//			    		}
//			    	}
//			    	//set user info(uuid, id, name) in httpSession when user Login
//					UserSessionHelper.userLogin(httpSession, loginUser);
//					//get logoTexts
//					UserSessionHelper.logoText(request, queryService.queryLogoText());
//					SessionTokenHelper.setSessionToken(httpSession, loginUser,response);
//			        return "index";
//				
//			    }else{
//			    	throw new LoginWithoutHttpsException();
//			    }  
//		    	
//		    }else{
//		    	throw new LoginReamlNotExistentException();
//		    }
//		    
//		
//	}
//
//	/**
//	 * logout
//	 * @throws NoConfigFoundException 
//	 */
//	@RequestMapping(value = "/logout")
//	public String logOut(HttpSession httpSession, HttpServletRequest request) throws NoConfigFoundException {
//		UserSessionHelper.logoText(request, queryService.queryLogoText());
//		UserSessionHelper.userLogout(httpSession);
//		return "login/logout";
//	}
//	


}
