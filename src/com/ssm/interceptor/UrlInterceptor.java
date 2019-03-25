package com.ssm.interceptor;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Vo.Log_t_Vo;
import com.ssm.service.log.LogServiceImpl;
import com.ssm.service.user.UserService;

public class UrlInterceptor implements HandlerInterceptor {

	@Autowired
	private UserService service;

	@Autowired
	private LogServiceImpl logservice;
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelandview) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		if (url.contains("userupdate")) {
			HttpSession session = request.getSession();
			String userid = (String) session.getAttribute("userupdate");
			String who=service.serviceFindUserById(session.getAttribute("whouser").toString()).getUs_account();
			session.removeAttribute("whouser");
			Log_t_Vo log = new Log_t_Vo();
			log.setLo_createId(userid);
			log.setLo_createTime(new Date());
			String logid = UUID.randomUUID().toString().replaceAll("-", "");
			log.setLo_id(logid);
			log.setLo_class(8);
			log.setLo_text("修改用户信息："+who);
			String name=service.serviceFindUserById(userid).getUs_account();
			log.setLo_name(name);
			logservice.serviceinsertlog(log);
		}
		if(url.contains("deleteUser")) {
			HttpSession session = request.getSession();
			String userid = (String) session.getAttribute("deleteUser");
			String who=session.getAttribute("whouser").toString();
			session.removeAttribute("whouser");
			Log_t_Vo log = new Log_t_Vo();
			log.setLo_createId(userid);
			log.setLo_createTime(new Date());
			String logid = UUID.randomUUID().toString().replaceAll("-", "");
			log.setLo_id(logid);
			log.setLo_class(8);
			log.setLo_text("删除用户:"+who);
			String name=service.serviceFindUserById(userid).getUs_account();
			log.setLo_name(name);
			logservice.serviceinsertlog(log);
		}
		if(url.contains("submitadduser")) {
			HttpSession session = request.getSession();
			String userid = (String) session.getAttribute("submitadduser");
			String who=service.serviceFindUserById(session.getAttribute("whouser").toString()).getUs_account();
			session.removeAttribute("whouser");
			Log_t_Vo log = new Log_t_Vo();
			log.setLo_createId(userid);
			log.setLo_createTime(new Date());
			String logid = UUID.randomUUID().toString().replaceAll("-", "");
			log.setLo_id(logid);
			log.setLo_class(8);
			log.setLo_text("增加用户"+who);
			String name=service.serviceFindUserById(userid).getUs_account();
			log.setLo_name(name);
			logservice.serviceinsertlog(log);
		}

	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println("successful");
	}

}
