package com.ssm.handler.industry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Vo.Industry_t_Vo;
import com.ssm.service.industry.IndustryServiceImpl;

@Controller
@RequestMapping("/industry")
public class IndustryHandler {

	@Autowired
	private IndustryServiceImpl service;
	
	@RequestMapping("/findIndustry")
	public String findIndustry(String id,Model model) throws Exception{
		Industry_t_Vo industry=service.serviceFindIndustry(id);
		System.out.println(industry.getIn_name());
		model.addAttribute("", "");
		return "";
	}
	
	
	
	@RequestMapping("/update")
	public String update(Industry_t_Vo industry,Model model) throws Exception{
		service.serviceupdate(industry);;
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/insert")
	public String insert(Industry_t_Vo industry,Model model) throws Exception{
		service.serviceinsert(industry);
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/delete")
	public String delete(String id,Model model) throws Exception{
		service.servicedelete(id);
		model.addAttribute("", "");
		return "";
	}
}
