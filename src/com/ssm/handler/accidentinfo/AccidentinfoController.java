package com.ssm.handler.accidentinfo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;
import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.accidentinfo.AccidentinfoServiceImpl;

@Controller
@RequestMapping("/accident")
public class AccidentinfoController {

	@Autowired
	private AccidentinfoServiceImpl service;

	@RequestMapping("/findid")
	public void findid(@RequestParam(value = "id") String id) throws Exception {
		Accidentinfo_t_Vo acciden = service.serviceAccidentinfoFind(id);
		System.out.println(acciden.getAcc_name());
		;
	}

	// 跳转添加事故页面
	@RequestMapping("/showadd")
	public ModelAndView showadd() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/accident/addaccident");
		return view;
	}

	// 增加事故信息
	@RequestMapping("/insert")
	public String insert(Accidentinfo_t_Vo accident, Model model) throws Exception {
		service.serviceinsert(accident);
		model.addAttribute("", "");
		return "";
	}

	@RequestMapping("/update")
	public String update(Accidentinfo_t_Vo accident, Model model) throws Exception {
		service.serviceupdate(accident);
		model.addAttribute("", "");
		return "";
	}

	@RequestMapping("/delete")
	public String delete(String acc_id) throws Exception {
		service.servicedelete(acc_id);
		return "redirect:/accident/findall.action";
	}

	// 查询所有事故（分页效果）
	@RequestMapping("/findall")
	public ModelAndView findall(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Accidentinfo_t_Vo> list = service.servicefindall(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(service.serviceFindCounts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listaccident", pagebean);
		view.setViewName("WEB-INF/jsp/accident/accidentlist");
		return view;
	}

}
