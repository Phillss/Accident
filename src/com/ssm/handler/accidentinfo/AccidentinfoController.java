package com.ssm.handler.accidentinfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;
import com.ssm.service.accidentinfo.AccidentinfoServiceImpl;
import com.ssm.service.industry.IndustryServiceImpl;

@Controller
@RequestMapping("/accident")
public class AccidentinfoController {

	@Autowired
	private AccidentinfoServiceImpl service;
	
	@Autowired
	private IndustryServiceImpl indusservice;

	@RequestMapping("/findid")
	public void findid(@RequestParam(value = "id") String id) throws Exception {
		Accidentinfo_t_Vo acciden = service.serviceAccidentinfoFind(id);
	}

	// 等级统计图页面
	@RequestMapping("/cartogram")
	public ModelAndView cartogram() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/cartogram/rankcart");
		return view;
	}

	// 事故图页面
	@RequestMapping("/accidentrank")
	public ModelAndView accidentrank() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/cartogram/accidentcart");
		return view;
	}

	// 跳转事故图页面
	@RequestMapping("/jumpaccidentrank")
	public String jumpaccidentrank() throws Exception {
		return "redirect:/accident/accidentrank.action";
	}

	// 跳转添加事故页面
	@RequestMapping("/showadd")
	public ModelAndView showadd() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("WEB-INF/jsp/accident/addaccident");
		return view;
	}

	// 增加事故信息
	@RequestMapping(value="/insert",method= RequestMethod.POST)
	public String insert(Accidentinfo_t_Vo accident,MultipartFile acc_file) throws Exception {
		String name=null;
		String path=null;
		if(acc_file!=null) {
			name=acc_file.getOriginalFilename();
			System.out.println(name);
			path="D:\\zpper\\"+name;				//临时存放目录
			File localfile=new File(path);
			acc_file.transferTo(localfile);
		}
		accident.setAcc_uploadTime(new Date());
		accident.setAcc_industryId(indusservice.serviceFindByName(accident.getAcc_industryName()).getIn_id());
		accident.setAcc_fileName(name);
		accident.setAcc_save(path);
		String id=UUID.randomUUID().toString().replaceAll("-", "");
		accident.setAcc_id(id);
		service.serviceinsert(accident);
		return "redirect:/accident/findall.action";
	}
	
	
	//下载文件
	@RequestMapping("/downloadfile")
	public void downLoadFile(@RequestParam(value="id") String id,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ModelAndView view=new ModelAndView();
		Accidentinfo_t_Vo accident=service.serviceAccidentinfoFind(id);
		String filename=accident.getAcc_fileName();
		String path=accident.getAcc_save();
		String mime=request.getServletContext().getMimeType(filename);
		String disposition="attachment;filename="+filename;
		FileInputStream in=new FileInputStream(path);
		response.setHeader("Content-Type", mime);
		response.setHeader("Content-Disposition", disposition);
		OutputStream output=response.getOutputStream();
		IOUtils.copy(in, output);
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
