package com.ssm.handler.laws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Laws_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.laws.LawsServiceImpl;

@Controller
@RequestMapping("/laws")
public class LawsHandler {

	@Autowired
	private LawsServiceImpl service;
	
	@RequestMapping("/findbyid")
	public String lawsFindById(@RequestParam(value="id") String id,
			Model model) throws Exception{
		Laws_t_Vo law=service.serviceFind(id);
		model.addAttribute("", "");
		return "";
	}
	
	
	//法规列表（分页）
	@RequestMapping("/findall")
	public ModelAndView findall(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception{
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Laws_t_Vo> list = service.servicefindall(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.servicefindcounts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listlaws", pagebean);
		view.setViewName("WEB-INF/jsp/regulations/lawslist");
		return view;
	}
	
	@RequestMapping("/insert")
	public String insert(Laws_t_Vo laws,Model model) throws Exception{
		service.serviceinsert(laws);
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/update")
	public String update(Laws_t_Vo laws,Model mdoel) throws Exception{
		service.serviceupdate(laws);
		mdoel.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id") String id,Model mdoel) throws Exception{
		service.servicedelete(id);
		mdoel.addAttribute("", "");
		return "";
	}
	
}
