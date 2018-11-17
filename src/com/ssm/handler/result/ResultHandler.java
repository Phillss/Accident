package com.ssm.handler.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Result_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.result.ResultServiceImpl;

@Controller
@RequestMapping("/result")
public class ResultHandler {

	@Autowired
	private ResultServiceImpl service;
	
	@RequestMapping("/findall")
	public ModelAndView findall(@RequestParam(value="current",defaultValue="0")
	int current) throws Exception{
		PageIndex pageindex=new PageIndex();
		pageindex.setCurrent(current*10);
		List<Result_t_Vo> list=service.servicefindall(pageindex);
		PageBean pagebean=new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.servicefindcount());
		pagebean.setBeanList(list);
		ModelAndView view =new ModelAndView();
		view.addObject("listresult", pagebean);
		view.setViewName("WEB-INF/jsp/");
		return view;
	}
	
	@RequestMapping("/update")
	public String update() throws Exception{
		return "";
	}
	@RequestMapping("/insert")
	public String insert() throws Exception{
		return "";
	}
	@RequestMapping("/delete")
	public String delete() throws Exception{
		return "";
	}
	@RequestMapping("/likefind")
	public String findbyid() throws Exception{
		return "";
	}
}
