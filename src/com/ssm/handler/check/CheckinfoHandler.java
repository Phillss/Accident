package com.ssm.handler.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Vo.Checkinfo_t_Vo;
import com.ssm.service.checkinfo.CheckinfoServiceImpl;

@Controller
@RequestMapping("/check")
public class CheckinfoHandler {

	@Autowired
	private CheckinfoServiceImpl service;
	
	@RequestMapping("/findCheck")
	public String findCheck(String id,Model model) throws Exception{
		Checkinfo_t_Vo check=service.servicefind(id);
		System.out.println(check.getCh_name());
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/update")
	public String update(Checkinfo_t_Vo check,Model model) throws Exception{
		service.serviceupdate(check);;
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/insert")
	public String insert(Checkinfo_t_Vo check,Model model) throws Exception{
		service.serviceinsert(check);;
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/delete")
	public String delete(String id,Model model) throws Exception{
		service.servicedelete(id);;
		model.addAttribute("", "");
		return "";
	}
	
}
