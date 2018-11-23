package com.ssm.handler.log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Log_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.log.LogServiceImpl;

@Controller
@RequestMapping("/log")
public class LogHandler {

	@Autowired
	private LogServiceImpl logservice;
	
	@RequestMapping("/loglist")
	public ModelAndView loglist(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception{
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Log_t_Vo> list = logservice.servicefindalllog(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(logservice.servicefindcounts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listlog", pagebean);
		view.setViewName("WEB-INF/jsp/record/logrecord");
		return view;
	}
}
