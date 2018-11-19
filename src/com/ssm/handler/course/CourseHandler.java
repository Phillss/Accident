package com.ssm.handler.course;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	//查询单门课程
	@RequestMapping("/findCourse")
	public String findCourse(@RequestParam(value="id") String id,Model model) throws Exception {
		Course_t_Vo course=service.serviceFind(id);
		model.addAttribute("single", course);
		return "";
	}
	
	@RequestMapping("/likefinds")
	public String likefinds(String name,Model model) throws Exception{
		List<Course_t_Vo> list=service.servicelikefind(name);
		model.addAttribute("", "");
		return "";
	}
	
	//查询所有课程(分页)
	@RequestMapping("findAll")
	public ModelAndView  findAll(@RequestParam(value="current",defaultValue="0")
	int current) throws Exception{
		PageIndex pageindex=new PageIndex();
		pageindex.setCurrent(current*10);
		List<Course_t_Vo> list=service.servicefindall(pageindex);
		PageBean pagebean=new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.servicefindcouts());
		pagebean.setBeanList(list);
		ModelAndView view =new ModelAndView();
		view.addObject("listcourse", pagebean);
		view.setViewName("WEB-INF/jsp/course/courselist");
		return view;
	}
	
	//更新课程信息
	@RequestMapping("updatecourse")
	public String  updatecourse(Course_t_Vo course) throws Exception{
		service.serviceupdate(course);
		return "";
	}
	
	
	//删除课程
	@RequestMapping("/deletecourse")
	public String deletecourse(String id) throws Exception{
		service.servicedelete(id);
		return "";
	}
}
