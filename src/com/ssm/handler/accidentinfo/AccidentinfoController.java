package com.ssm.handler.accidentinfo;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;
import com.ssm.service.accidentinfo.AccidentinfoServiceImpl;
import com.ssm.service.accidentlevel.AccidentlevelServiceImpl;
import com.ssm.service.industry.IndustryServiceImpl;

@Controller
@RequestMapping("/accident")
public class AccidentinfoController {

	@Autowired
	private AccidentinfoServiceImpl service;
	@Autowired
	private IndustryServiceImpl industryService;
	@Autowired
	private AccidentlevelServiceImpl levelService;

	@RequestMapping("/findid")
	public void findid(@RequestParam(value = "id") String id) throws Exception {
		Accidentinfo_t_Vo acciden = this.service.serviceAccidentinfoFind(id);
		System.out.println(acciden.getAcc_name());
	}
	
	
	@RequestMapping("/ClassFinds")
	public ModelAndView ClassFind(@RequestParam(value = "current", defaultValue = "0") int current, @RequestParam(value="clazz") String clazz) throws Exception{
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		pageindex.setName(clazz);
		List<Accidentinfo_t_Vo> list = this.service.serviceClassFinds(pageindex);
		System.out.println(list.size()+clazz);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(this.service.serviceFindCounts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listaccident", pagebean);
		view.setViewName("WEB-INF/jsp/accident/accidentlist");
		return view;
	}
	
	@RequestMapping("/likefind")
	public ModelAndView likefind(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		String accidentid=request.getParameter("id");
		List<Accidentinfo_t_Vo> list=this.service.servicelikefinds(accidentid);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(0);
		pagebean.setTotal_record(list.size());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listaccident", pagebean);
		view.setViewName("WEB-INF/jsp/accident/accidentlist");
		return view;
	}

	// 行业事故统计图页面
	@RequestMapping("/cartogram")
	public ModelAndView cartogram(String industryId) throws Exception {
		//按等级分类事故数量
		List<Map<String,String>> count = this.service.findCountByLevel(industryId);
		//转换格式
		ObjectMapper mapper =new ObjectMapper();
		String lvcount = mapper.writeValueAsString(count);
		lvcount = lvcount.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
		System.out.println(lvcount);
		//死亡人数
		List<Integer> deathnum = new ArrayList<Integer>() ;
		//伤亡人数
		List<Integer> injernum =new ArrayList<Integer>();
		//损失财产
		List<Long> finanal =new ArrayList<Long>();
		//按月查询伤亡，财产损失的人数，
		List<Accidentinfo_t_Vo> injer = this.service.findSumByTime(industryId);
		for(int i=1;i<=12;i++){
			//控制deathnum是否加0的变量
			int j=0;
			//控制injernum是否加0的变量
			int k=0;
			//控制finanal是否加0的变量
			int l=0;
			for(Accidentinfo_t_Vo a : injer){
				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					deathnum.add(a.getAcc_deathSum());
					j=1;
					break;
				}
			}
			for(Accidentinfo_t_Vo a : injer){
				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					injernum.add(a.getAcc_injuredSum());
					k=1;
					break;
				}
			}
			for(Accidentinfo_t_Vo a : injer){

				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					finanal.add(a.getAcc_financial());
					l=1;
					break;
				}
			}
			if(j==0){
				deathnum.add(0);
			}
			if(k==0){
				injernum.add(0);
			}
			if(l==0){
				finanal.add(0l);
			}
		}
		System.out.println(injernum);
		System.out.println(finanal);
		System.out.println(deathnum);
		ModelAndView view = new ModelAndView();
		//行业列表
		view.addObject("industry", this.industryService.findAllIndustry());
		//事故等级列表
		view.addObject("level",  this.levelService.findAllAccidentlevel());
		view.addObject("lvcount", lvcount);
		view.addObject("injernum", injernum);
		view.addObject("finanal", finanal);
		view.addObject("deathnum", deathnum);
		view.setViewName("WEB-INF/jsp/cartogram/rankcart");
		return view;
	}


	@RequestMapping("/getcartogram")
	public ModelAndView getcartogram(@RequestParam(value = "industryId")String industryId) throws Exception {
		//根据部门id按等级分类事故数量
		List<Map<String,String>> count = this.service.findCountByLevel(industryId);
		//转换格式
		ObjectMapper mapper =new ObjectMapper();
		String lvcount = mapper.writeValueAsString(count);
		lvcount = lvcount.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
		System.out.println(lvcount);
		//死亡人数
		List<Integer> deathnum = new ArrayList<Integer>() ;
		//伤亡人数
		List<Integer> injernum =new ArrayList<Integer>();
		//死亡人数
		List<Long> finanal =new ArrayList<Long>();
		//按月查询伤亡，财产损失的人数，
		List<Accidentinfo_t_Vo> injer = this.service.findSumByTime(industryId);
		for(int i=1;i<=12;i++){
			//控制deathnum是否加0的变量
			int j=0;
			//控制injernum是否加0的变量
			int k=0;
			//控制finanal是否加0的变量
			int l=0;
			for(Accidentinfo_t_Vo a : injer){
				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					deathnum.add(a.getAcc_deathSum());
					j=1;
					break;
				}
			}
			for(Accidentinfo_t_Vo a : injer){
				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					injernum.add(a.getAcc_injuredSum());
					k=1;
					break;
				}
			}
			for(Accidentinfo_t_Vo a : injer){

				if(String.valueOf(i).equals(String.valueOf(a.getAcc_time().getMonth()))){
					finanal.add(a.getAcc_financial());
					l=1;
					break;
				}
			}
			if(j==0){
				deathnum.add(0);
			}
			if(k==0){
				injernum.add(0);
			}
			if(l==0){
				finanal.add(0l);
			}
		}
		System.out.println(injernum);
		System.out.println(finanal);
		System.out.println(deathnum);
		ModelAndView view = new ModelAndView();
		//行业列表
		view.addObject("industry", this.industryService.findAllIndustry());
		//事故等级列表
		view.addObject("level",  this.levelService.findAllAccidentlevel());
		view.addObject("lvcount", lvcount);
		view.addObject("injernum", injernum);
		view.addObject("finanal", finanal);
		view.addObject("deathnum", deathnum);
		view.setViewName("WEB-INF/jsp/cartogram/rankcart");
		return view;
	}

	// 等级事故图页面
	@RequestMapping("/accidentrank")
	public ModelAndView accidentrank(@RequestParam(value="rank") String rank,HttpServletRequest request,HttpServletResponse response) throws Exception {
		ModelAndView view = new ModelAndView();
		//根据等级id按部门分类数量
		List<Accidentinfo_t_Vo> accidentinfo = this.service.selAccidentById(rank);
		System.out.println(accidentinfo);
		//死亡人数集合
		List<Map<String, String>> deathnum = new ArrayList<Map<String, String>>();
		//受伤人数集合
		List<Map<String, String>> injernum = new ArrayList<Map<String, String>>();
		//财产损失
		List<Map<String, String>> losenum = new ArrayList<Map<String, String>>();
		//获取类型名称及id
		//List<Map<String, String>> allaccid =this.service.accidentMapper.findAllAccidentID();
		//获取accident的部门
		List<Map<String, String>> industry =this.service.accidentMapper.selCountIndustry();
		for(Accidentinfo_t_Vo a:accidentinfo){
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", a.getAcc_industryName());
			map.put("value",a.getAcc_deathSum().toString());
			deathnum.add(map);
			map.put("name", a.getAcc_industryName());
			map.put("value", a.getAcc_injuredSum().toString());
			injernum.add(map);
			map.put("name", a.getAcc_industryName());
			map.put("value", a.getAcc_financial().toString());
			losenum.add(map);
		}
		ObjectMapper mapper =new ObjectMapper();
		String death = mapper.writeValueAsString(deathnum);
		death = death.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
		String injer = mapper.writeValueAsString(injernum);
		injer = injer.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
		String lose = mapper.writeValueAsString(losenum);
		death = lose.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
		//行业列表
		view.addObject("industry", this.industryService.findAllIndustry());
		//事故等级列表
		view.addObject("level",  this.levelService.findAllAccidentlevel());
		//view.addObject("industry", industry);
		//view.addObject("allaccid", allaccid);
		view.addObject("death", death);
		view.addObject("injer", injer);
		view.addObject("lose", lose);
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
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(Accidentinfo_t_Vo accident, Model model) throws Exception {
		accident.setAcc_uploadTime(new Date());
		accident.setAcc_injuredSum(0);
		accident.setAcc_boss("hello");
		accident.setAcc_save("123");
		accident.setAcc_fileName("123");
		accident.setAcc_org("123");
		this.service.serviceinsert(accident);
		return "redirect:/accident/findall.action";
	}

	@RequestMapping("/update")
	public String update(Accidentinfo_t_Vo accident, Model model) throws Exception {
		this.service.serviceupdate(accident);
		model.addAttribute("", "");
		return "";
	}

	@RequestMapping("/delete")
	public String delete(String acc_id) throws Exception {
		this.service.servicedelete(acc_id);
		return "redirect:/accident/findall.action";
	}

	// 查询所有事故（分页效果）
	@RequestMapping("/findall")
	public ModelAndView findall(@RequestParam(value = "current", defaultValue = "0") int current) throws Exception {
		PageIndex pageindex = new PageIndex();
		pageindex.setCurrent(current * 10);
		List<Accidentinfo_t_Vo> list = this.service.servicefindall(pageindex);
		PageBean pagebean = new PageBean();
		pagebean.setCurrent(current);
		pagebean.setTotal_record(this.service.serviceFindCounts());
		pagebean.setBeanList(list);
		ModelAndView view = new ModelAndView();
		view.addObject("listaccident", pagebean);
		view.setViewName("WEB-INF/jsp/accident/accidentlist");
		return view;
	}
	
	@RequestMapping("/downloadfile")
	public void download(@RequestParam(value="id") String id,HttpServletResponse response,HttpServletRequest request) throws Exception {
		String file=this.service.serviceAccidentinfoFind(id).getAcc_save();
		System.out.println(file);
		/*String filename=this.service.serviceAccidentinfoFind(id).getAcc_fileName();*/
		String mime=request.getServletContext().getMimeType(file);
		String disposition="attachment;filename="+new Date().toString()+".pdf";
		FileInputStream input=new FileInputStream(file);
		response.setHeader("Content-Type", mime);
		response.setHeader("Content-Disposition", disposition);
		OutputStream output=response.getOutputStream();
		IOUtils.copy(input, output);
	}

}
