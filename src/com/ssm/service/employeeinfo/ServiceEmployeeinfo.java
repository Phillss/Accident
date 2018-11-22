package com.ssm.service.employeeinfo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		String em_position=mapper.selectPositionByName(vo.getEm_positionName()).get(0).getPo_id();
		vo.setEm_position(em_position);
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
	public List<Position_t_Vo> servicselectPositionByName(String name) throws Exception{
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
	public List<Departmentinfo_t_Vo> serviceselectDepartByName(String name) throws Exception{
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
	public List<Companyinfo_t_Vo> serviceselectCompanyByName(String name) throws Exception{
		return mapper.selectCompanyByName(name);
	}
	public void serviceaddCompany(Companyinfo_t_Vo vo) throws Exception{
		mapper.addCompany(vo);
	}
	public void servicedeleteCompany(String id) throws Exception{
		mapper.deleteCompany(id);
	}
	
	
	
	
	
	
}
