package com.ssm.handler.assort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Causeclass_t_Vo;
import com.ssm.pojo.Vo.Industry_t_Vo;
import com.ssm.service.cause.CauseService;
import com.ssm.service.industry.IndustryServiceImpl;

@Component
@RequestMapping("assort")
public class AssortHandler {

	@Autowired
	private IndustryServiceImpl indusservice;

	@Autowired
	private CauseService causeservice;

	// 修改原因页面
	@RequestMapping("modifycause")
	public ModelAndView modifycause(String ca_id) throws Exception {
		ModelAndView mdoel = new ModelAndView();
		Causeclass_t_Vo cause=causeservice.serviceFindById(ca_id);
		mdoel.addObject("cause", cause);
		mdoel.setViewName("/WEB-INF/jsp/assortment/modifycause");
		return mdoel;
	}

	// 提交修改原因
	@RequestMapping(value="subcause",method=RequestMethod.POST)
	public String subcause(Causeclass_t_Vo cause) throws Exception {
		causeservice.serviceupdatecause(cause);
		return "redirect:/assort/causelist.action";
	}

	// 修改行业页面
	@RequestMapping("modifyindustry")
	public ModelAndView modifyindustry(String in_id) throws Exception {
		ModelAndView mdoel = new ModelAndView();
		Industry_t_Vo indus=indusservice.serviceFindIndustry(in_id);
		mdoel.addObject("industry", indus);
		mdoel.setViewName("/WEB-INF/jsp/assortment/modifyindustry");
		return mdoel;
	}

	// 提交修改行业页面
	@RequestMapping(value="subindustry",method=RequestMethod.POST)
	public String subindustry(Industry_t_Vo industry) throws Exception {
		indusservice.serviceupdate(industry);
		return "redirect:/assort/industrylist.action";
	}

	// 添加行业或原因页面
	@RequestMapping("addindustryorcause")
	public ModelAndView addindustryorcause() throws Exception {
		ModelAndView mdoel = new ModelAndView();
		mdoel.setViewName("/WEB-INF/jsp/assortment/addindusorcause");
		return mdoel;
	}

	@RequestMapping("causelist")
	public ModelAndView causelist(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Causeclass_t_Vo> list = causeservice.serviceFindAll(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(causeservice.servicefindcount());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("causelist", pagebean);
		view.setViewName("WEB-INF/jsp/assortment/causelist");
		return view;
	}

	@RequestMapping("industrylist")
	public ModelAndView industrylist() throws Exception {
		ModelAndView view = new ModelAndView();
		List<Industry_t_Vo> list = indusservice.serviceFindAll();
		view.addObject("industrylist", list);
		view.setViewName("WEB-INF/jsp/assortment/industrylist");
		return view;
	}

	@RequestMapping("deletecause")
	public String deletecause(String ca_id) throws Exception {
		causeservice.servicedelete(ca_id);
		return "redirect:/assort/causelist.action";
	}

	@RequestMapping("deleteindus")
	public String deleteindus(String in_id) throws Exception {
		indusservice.servicedelete(in_id);
		return "redirect:/assort/industrylist.action";
	}
}
