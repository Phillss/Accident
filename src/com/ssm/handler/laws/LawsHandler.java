package com.ssm.handler.laws;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
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
	
	@RequestMapping("/downloadlaws")
	public void lawsdownload(@RequestParam(value="id") String id,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String file=this.service.serviceFind(id).getLa_save();
		String filename=this.service.serviceFind(id).getLa_name();
		String mime=request.getServletContext().getMimeType(file);
		String disposition="attachment;filename="+new Date().toString()+".pdf";
		System.out.println(disposition);
		FileInputStream input=new FileInputStream(file);
		response.setHeader("Content-Type", mime);
		response.setHeader("Content-Disposition", disposition);
		OutputStream output=response.getOutputStream();
		IOUtils.copy(input, output);
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
	public ModelAndView insert() throws Exception{
		ModelAndView view=new ModelAndView();
		view.setViewName("WEB-INF/jsp/regulations/lawsadd");
		return view;
	}
	
	@RequestMapping(value="/subinsert",method=RequestMethod.POST)
	public String subinsert(Laws_t_Vo laws) throws Exception{
		laws.setLa_id(UUID.randomUUID().toString().replaceAll("-", ""));
		laws.setLa_fileName("123");  //暂时保留
		laws.setLa_save("http://");
		service.serviceinsert(laws);
		return "redirect:/laws/findall.action";
	}
	
	@RequestMapping("/update")
	public String update(Laws_t_Vo laws,Model mdoel) throws Exception{
		service.serviceupdate(laws);
		mdoel.addAttribute("", "");
		return "";
	}
	
	@RequestMapping("/delete")
	public String delete(String la_id) throws Exception{
		service.servicedelete(la_id);
		return "redirect:/laws/findall.action";
	}
	
}
