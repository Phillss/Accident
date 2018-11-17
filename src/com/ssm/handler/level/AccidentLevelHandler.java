package com.ssm.handler.level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Vo.Accidentlevel_t_Vo;
import com.ssm.service.accidentlevel.AccidentlevelServiceImpl;

@Controller
@RequestMapping("/accidentlevel")
public class AccidentLevelHandler {

	@Autowired
	private AccidentlevelServiceImpl service;
	
	@RequestMapping("/findlevel")
	public String findlevel(String id,Model model) throws Exception{
		Accidentlevel_t_Vo level=service.serviceFindAccidentlevel(id);
		model.addAttribute("", "");
		System.out.println(level.getAl_name());
		return "";
	}
	
	@RequestMapping("/update")
	public String update(Accidentlevel_t_Vo level,Model model) throws Exception{
		service.serviceupdate(level);;
		model.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/insert")
	public String insert(Accidentlevel_t_Vo level,Model model) throws Exception{
		service.serviceinsert(level);
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
