package com.ssm.service.employeeinfo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.employee.EmployeeMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Companyinfo_t_Vo;
import com.ssm.pojo.Vo.Departmentinfo_t_Vo;
import com.ssm.pojo.Vo.Employeecourse_t_Vo;
import com.ssm.pojo.Vo.Employeeinfo_t_Vo;
import com.ssm.pojo.Vo.Position_t_Vo;

public class ServiceEmployeeinfo {
	
	@Autowired
	private EmployeeMapper mapper;
	
	//针对员工的信息
	public void serviceinsertEmployee(Employeeinfo_t_Vo vo) throws Exception{
		String posiname=vo.getEm_positionName();  //获取职位名称
		String companyName=vo.getEm_companyName();//获取公司名称
		//如果没有公司就添加一个
		
		if(mapper.selectCompanyByName(companyName)==null) {
			
		}
		//如果没有职位就添加一个职位
		if(mapper.selectPositionByName(posiname)==null) {
			Position_t_Vo posi=new Position_t_Vo();
			posi.setPo_name(posiname);
			posi.setPo_id(UUID.randomUUID().toString().replaceAll("-", ""));
			//添加一个部门信息（部门名称暂时与职位名称相同）
			Departmentinfo_t_Vo depart=new Departmentinfo_t_Vo();
			mapper.addPosition(posi);
		}
		mapper.insertEmployee(vo);
	}
	public Employeecourse_t_Vo serviceemployeeFindById(String id) throws Exception{
		return mapper.employeeFindById(id);
	}
	public List<Employeecourse_t_Vo> servicefindall(PageIndex pageindex) throws Exception{
		return mapper.findall(pageindex);
	}
	public Integer servicefindcounts() throws Exception{
		return mapper.findcounts();
	}
	public List<Employeeinfo_t_Vo> servicelikefind(PageIndex pageindex) throws Exception{
		return mapper.likefind(pageindex);
	}
	public void serviceupdateemployee(Employeeinfo_t_Vo vo) throws Exception{
		mapper.updateemployee(vo);
	}
	public void servicedeleteemployee(String id) throws Exception{
		mapper.deleteemployee(id);
	}
	
	
	//针对职位
	public Position_t_Vo serviceselectPositionById(String id) throws Exception{
		return mapper.selectPositionById(id);
	}
	public Position_t_Vo servicselectPositionByName(String name) throws Exception{
		return mapper.selectPositionByName(name);
	}
	public void servicaddPosition(Position_t_Vo vo) throws Exception{
		mapper.addPosition(vo);
	}
	public void servicdeletePosition(String id) throws Exception{
		mapper.deletePosition(id);
	}
	
	
	//针对部门
	public Departmentinfo_t_Vo serviceselectDepartById(String id) throws Exception{
		return mapper.selectDepartById(id);
	}
	public Departmentinfo_t_Vo serviceselectDepartByName(String name) throws Exception{
		return mapper.selectDepartByName(name);
	}
	public void serviceaddDepart(Departmentinfo_t_Vo vo) throws Exception{
		mapper.addDepart(vo);
	}
	public void servicedeleteDepart(String id) throws Exception{
		mapper.deleteDepart(id);
	}
	
	
	
	
	//针对公司
	public Companyinfo_t_Vo serviceselectCompanyById(String id) throws Exception{
		return mapper.selectCompanyById(id);
	}
	public Companyinfo_t_Vo serviceselectCompanyByName(String name) throws Exception{
		return mapper.selectCompanyByName(name);
	}
	public void serviceaddCompany(Companyinfo_t_Vo vo) throws Exception{
		mapper.addCompany(vo);
	}
	public void servicedeleteCompany(String id) throws Exception{
		mapper.deleteCompany(id);
	}
	
	
	
	
	
	
}
