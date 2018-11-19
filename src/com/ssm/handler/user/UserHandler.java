package com.ssm.handler.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.user.UserService;

@Controller
@RequestMapping("/userhandler")
public class UserHandler {
	

	
	@Autowired
	private UserService service;
	//查找所有用户
	@RequestMapping("/findAllUsers")
	public ModelAndView findAllUsers(@RequestParam(value="current",defaultValue="0")
										int current) throws Exception {
		PageIndex pageindex=new PageIndex();
		pageindex.setCurrent(current*10);
		List<User_t_Vo> list=service.serviceFindAllUsers(pageindex);
		PageBean pagebean=new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.findsCouts());
		pagebean.setBeanList(list);
		ModelAndView view =new ModelAndView();
		view.addObject("listuser", pagebean);
		view.setViewName("WEB-INF/jsp/superadmin/userlist");
		return view;
	}

	
	//模糊查询用户
	@RequestMapping("/findLikeUsers")
	public String findLikeUsers(@RequestParam(value="current",defaultValue="0")
	int current, String us_account,Model model) throws Exception{
		PageIndex pageindex=new PageIndex();
		pageindex.setCurrent(current*10);
		pageindex.setName(us_account);
		List<User_t_Vo> list=service.serviceLikeUserByName(pageindex);
		PageBean pagebean=new PageBean();
		pagebean.setCurrent(current);
		pagebean.setBeanList(list);
		model.addAttribute("listuser", pagebean);
		return "WEB-INF/jsp/superadmin/likeuserlist";
	}
	
	//进入管理员信息修改页面
	@RequestMapping("/updatelist")
	public ModelAndView updateUsers(@RequestParam(value="us_id") String id) 
			throws Exception {
		User_t_Vo user=new User_t_Vo();
		user=service.serviceFindUserById(id);
		ModelAndView model=new ModelAndView();
		model.addObject("showuser", user);
		model.setViewName("WEB-INF/jsp/superadmin/usersingle");
		return model;
	}
	//提交数据
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(String us_id,Integer us_roles,Integer us_flag,Model model) throws Exception {
		User_t_Vo user=new User_t_Vo();
		user.setUs_id(us_id);
		user.setUs_roles(us_roles);
		user.setUs_flag(us_flag);
		service.serviceUpdate(user);
		ModelMap map=new ModelMap();
		map.addAttribute("message", "修改成功!");
		model.addAllAttributes(map);
		return "redirect:/userhandler/findAllUsers.action";
	}
	
	//删除用户
	@RequestMapping("/deleteUser")
	public String deleteUser(String us_id,Model model) throws Exception{
		service.serviceDelete(us_id);
		model.addAttribute("message", "已成功删除！");
		return "forward:/userhandler/findAllUsers.action";
	}
	//用户个人修改信息
}
