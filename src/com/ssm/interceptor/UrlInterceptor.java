package com.ssm.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UrlInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object object) throws Exception {
		// TODO Auto-generated method stub
		String url=request.getRequestURI();
		if(url.contains("eChar.jsp")) {
			HttpSession session=request.getSession();
			Enumeration<String> names=session.getAttributeNames();
			while(names.hasMoreElements()) {
				System.out.println(names.nextElement());
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, 
			HttpServletResponse response, Object object,
			ModelAndView modelandview) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, 
			HttpServletResponse response, Object object,
			Exception exception) throws Exception {
		// TODO Auto-generated method stub

	}

}
