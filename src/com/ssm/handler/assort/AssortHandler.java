package com.ssm.handler.assort;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("assort")
public class AssortHandler {

	@RequestMapping("modifycause")
	public ModelAndView modifycause() throws Exception{
		ModelAndView mdoel=new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/modifycause");
		return mdoel;
	}
	
	@RequestMapping("modifyindustry")
	public ModelAndView modifyindustry() throws Exception{
		ModelAndView mdoel=new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/modifyindustry");
		return mdoel;
	}
	
	@RequestMapping("addindustryorcause")
	public ModelAndView addindustryorcause() throws Exception{
		ModelAndView mdoel=new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/addindusorcause");
		return mdoel;
	}
	
	@RequestMapping("causelist")
	public ModelAndView causelist() throws Exception{
		ModelAndView mdoel=new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/causelist");
		return mdoel;
	}
	
	@RequestMapping("industrylist")
	public ModelAndView industrylist() throws Exception{
		ModelAndView mdoel=new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/industrylist");
		return mdoel;
	}
}
