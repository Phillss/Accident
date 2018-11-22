package com.ssm.shiro.handler;

import java.util.Date;
import java.util.UUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.mapper.employee.EmployeeMapper;
import com.ssm.pojo.Vo.Employeecourse_t_Vo;
import com.ssm.pojo.Vo.Employeeinfo_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.employeeinfo.ServiceEmployeeinfo;
import com.ssm.service.user.UserService;

@Controller
@RequestMapping("/shiro")
public class shiroHandler {

	@Autowired
	private UserService service;
	
	@Autowired
	private ServiceEmployeeinfo serviceEmpl;

	// 登陆认证
	@RequestMapping(value="/login",method= {RequestMethod.POST,RequestMethod.GET})
	public String login(@RequestParam("userid") String userid, @RequestParam("pass") String pass) {
		Subject currentUser = SecurityUtils.getSubject();
		System.out.println("执行认证");
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(userid, pass);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				System.out.println("login false!" + e.getMessage());
			}
		}
		return "redirect:/index.jsp";
	}

	@RequestMapping("/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "redirect:/login.jsp";
	}

	@RequestMapping(value="/logup",method= {RequestMethod.POST,RequestMethod.GET})
	public String logup(Employeeinfo_t_Vo employee) throws Exception {
		User_t_Vo user=new User_t_Vo();
		user.setUs_account(employee.getUs_account());
		user.setUs_passwd(employee.getUs_passwd());
		user.setUs_roles(0);
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		user.setUs_id(id);
		System.out.println("用户角色为：员工");
		String algorithmName = "MD5";
		Object source = user.getUs_passwd();
		Object salt = ByteSource.Util.bytes(user.getUs_account());
		int hashIterations = 1024;
		Object result = new SimpleHash(algorithmName, source, salt, hashIterations);
		user.setUs_passwd(result.toString());
		user.setUs_flag(0);
		user.setUs_createTime(new Date());
		service.serviceInsert(user);
		employee.setEm_number(employee.getUs_account());
		employee.setEm_id(id);
		serviceEmpl.serviceinsertEmployee(employee);
		return "redirect:/login.jsp";
	}
}
