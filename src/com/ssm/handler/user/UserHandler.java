package com.ssm.handler.user;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.employeeinfo.ServiceEmployeeinfo;
import com.ssm.service.user.UserService;

@Controller
@RequestMapping("/userhandler")
public class UserHandler {

	@Autowired
	private UserService service;

	@Autowired
	private ServiceEmployeeinfo emService;

	// 验证公司是否被收录
	@RequestMapping(value = "/vertifycompany", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Boolean vertifycompany(String em_companyName) throws Exception {
		if (emService.serviceselectCompanyByName(em_companyName).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 验证部门是否存在
	@RequestMapping(value = "/vertifydepart", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Boolean vertifydepart(String em_departmentName) throws Exception {
		if (emService.serviceselectDepartByName(em_departmentName).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 验证职位是否存在
	@RequestMapping(value = "/vertifyposi", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Boolean vertifyposi(String em_positionName) throws Exception {
		if (emService.servicselectPositionByName(em_positionName).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 验证用户名是否重复
	@RequestMapping(value = "/vertify", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Boolean vertify(User_t_Vo user) throws Exception {
		if (service.serviceFindUserByName(user.getUs_account()).size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	// 查找所有用户
	@RequestMapping("/findAllUsers")
	public ModelAndView findAllUsers(@RequestParam(value = "current", defaultValue = "0") int current)
			throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<User_t_Vo> list = service.serviceFindAllUsers(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.findsCouts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listuser", pagebean);
		view.setViewName("WEB-INF/jsp/superadmin/userlist");
		return view;
	}

	// 模糊查询用户
	@RequestMapping("/findLikeUsers")
	public String findLikeUsers(@RequestParam(value = "current", defaultValue = "0") int current, String us_account,
			Model model) throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		pageindex.setName(us_account);
		List<User_t_Vo> list = service.serviceLikeUserByName(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setBeanList(list);
		model.addAttribute("listuser", pagebean);
		return "WEB-INF/jsp/superadmin/likeuserlist";
	}

	// 进入人员添加页面
	@RequestMapping("/adduser")
	public ModelAndView adduser() throws Exception {
		ModelAndView model = new ModelAndView();
		model.setViewName("WEB-INF/jsp/superadmin/adduser");
		return model;
	}

	// 人员添加提交页面
	@RequestMapping("/submitadduser")
	public ModelAndView submitadduser(HttpSession session) throws Exception {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("WEB-INF/jsp/superadmin/adduser");
		return null;
	}

	// 进入管理员信息修改页面
	@RequestMapping("/updatelist")
	public ModelAndView updateUsers(@RequestParam(value = "us_id") String id) throws Exception {
		User_t_Vo user = new User_t_Vo();
		user = service.serviceFindUserById(id);
		ModelAndView model = new ModelAndView();
		model.addObject("showuser", user);
		model.setViewName("WEB-INF/jsp/superadmin/usersingle");
		return model;
	}

	// 提交数据
	@RequestMapping(value = "/userupdate", method = RequestMethod.POST)
	public String update(String us_id, Integer us_roles, Integer us_flag, Model model,HttpSession session) throws Exception {
		session.setAttribute("userupdate", us_id);   //暂时用被操作者的id
		User_t_Vo user = new User_t_Vo();
		user.setUs_id(us_id);
		user.setUs_roles(us_roles);
		user.setUs_flag(us_flag);
		service.serviceUpdate(user);
		ModelMap map = new ModelMap();
		map.addAttribute("message", "修改成功!");
		model.addAllAttributes(map);
		return "redirect:/userhandler/findAllUsers.action";
	}

	// 删除用户
	@RequestMapping("/deleteUser")
	public String deleteUser(String us_id, Model model) throws Exception {
		service.serviceDelete(us_id);
		model.addAttribute("message", "已成功删除！");
		return "forward:/userhandler/findAllUsers.action";
	}
	// 用户个人修改信息
}
