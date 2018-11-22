package com.ssm.handler.course;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Course_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.course.CourseServiceImpl;

@Controller
@RequestMapping("/course")
public class CourseHandler {

	@Autowired
	private CourseServiceImpl service;

	// 查询单门课程
	@RequestMapping("/findCourse")
	public String findCourse(@RequestParam(value = "id") String id, Model model) throws Exception {
		Course_t_Vo course = service.serviceFind(id);
		model.addAttribute("single", course);
		return "";
	}

	@RequestMapping("/likefinds")
	public String likefinds(String name, Model model) throws Exception {
		List<Course_t_Vo> list = service.servicelikefind(name);
		model.addAttribute("", "");
		return "";
	}

	// 查询所有课程(分页)
	@RequestMapping("findAll")
	public ModelAndView findAll(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Course_t_Vo> list = service.servicefindall(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.servicefindcouts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listcourse", pagebean);
		view.setViewName("WEB-INF/jsp/course/courselist");
		return view;
	}

	// 转到原因页面
	@RequestMapping("theory")
	public ModelAndView theory(Course_t_Vo course) throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/course/causetheory");
		return view;
	}

	// 添加课程页面
	@RequestMapping("addcourse")
	public ModelAndView addcourse(Course_t_Vo course) throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/course/addcourse");
		return view;
	}

	// 添加课程提交页面
	@RequestMapping("submitadd")
	public ModelAndView submitadd(Course_t_Vo course) throws Exception {
		return null;
	}

	// 进入修改页面
	@RequestMapping("updatelist")
	public ModelAndView updatelist(String cu_id) throws Exception {
		Course_t_Vo course = service.serviceFind(cu_id);
		ModelAndView model = new ModelAndView();
		model.addObject("updatelist", course);
		model.setViewName("WEB-INF/jsp/course/coursemodify");
		return model;
	}

	// 更新课程信息
	@RequestMapping(value = "updatecourse", method = RequestMethod.POST)
	public String updatecourse(Course_t_Vo course) throws Exception {
		System.out.println(course.getCu_id());

		System.out.println(course.getCu_industry());
		System.out.println(course.getCu_fileName());
		System.out.println(course.getCu_introduce());
		service.serviceupdate(course);
		return "redirect:/course/findAll.action";
	}

	// 删除课程
	@RequestMapping("/deletecourse")
	public String deletecourse(String cu_id) throws Exception {
		service.servicedelete(cu_id);
		return "forward:/course/findAll.action";
	}
}
