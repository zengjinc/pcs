package com.ssm.exception;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import pcs.exceptions.login.BaseLoginException;

public class WebExceptionResolver implements HandlerExceptionResolver{
	private static Logger logger = LogManager.getLogger(WebExceptionResolver.class);

	/**
	 * resolve Exception
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object o, Exception e) {
		ModelAndView modelAndView = null ;
		logger.error("exception",e);
		
		// define model to ModelAndView
		Map<String, Object> model = new HashMap<String, Object>();  
        model.put("exMsg", e.getMessage()); 
        
        // show the exception in error page
		if(e instanceof BaseLoginException){//login failed
			modelAndView = new ModelAndView("login/loginError",model);
//			modelAndView.getModel().put("ex", e.getMessage());
		}else{ //if(exception instance webservice)
			modelAndView = new ModelAndView("common/error",model);
//			modelAndView.getModel().put("ex", e.getMessage());
		}	
		return modelAndView;
	}
	
}
