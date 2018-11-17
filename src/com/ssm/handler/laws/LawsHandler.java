package com.ssm.handler.laws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.pojo.Vo.Laws_t_Vo;
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
	
	@RequestMapping("/findall")
	public String findall(Model mdoel) throws Exception{
		System.out.println("hhah");
		List<Laws_t_Vo> list=service.servicefindall();
		mdoel.addAttribute("", "");
		return "";
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
