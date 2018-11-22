package com.ssm.mapper.employee;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Companyinfo_t_Vo;
import com.ssm.pojo.Vo.Departmentinfo_t_Vo;
import com.ssm.pojo.Vo.Employeecourse_t_Vo;
import com.ssm.pojo.Vo.Employeeinfo_t_Vo;
import com.ssm.pojo.Vo.Position_t_Vo;

public interface EmployeeMapper {
	
	//针对员工基本信息
	public void insertEmployee(Employeeinfo_t_Vo vo) throws Exception;
	
	public Employeecourse_t_Vo employeeFindById(String id) throws Exception;
	
	public List<Employeecourse_t_Vo> findall(PageIndex pageindex) throws Exception;
	
	public Integer findcounts() throws Exception;
	
	public List<Employeeinfo_t_Vo> likefind(PageIndex pageindex) throws Exception;
	
	public void updateemployee(Employeeinfo_t_Vo vo) throws Exception;
	
	public void deleteemployee(String id) throws Exception;
	
	
	//针对职位信息
	public Position_t_Vo selectPositionById(String id) throws Exception;
	
	public Position_t_Vo selectPositionByName(String name) throws Exception;
	
	public void addPosition(Position_t_Vo vo) throws Exception;
	
	public void deletePosition(String id) throws Exception;
	
	
	
	
	//针对部门基本信息
	public Departmentinfo_t_Vo selectDepartById(String id) throws Exception;
	
	public Departmentinfo_t_Vo selectDepartByName(String name) throws Exception;
	
	public void addDepart(Departmentinfo_t_Vo vo) throws Exception;
	
	public void deleteDepart(String id) throws Exception;
	
	
	
	
	//针对公司信息
	public Companyinfo_t_Vo selectCompanyById(String id) throws Exception;
	
	public Companyinfo_t_Vo selectCompanyByName(String name) throws Exception;
	
	public void addCompany(Companyinfo_t_Vo vo) throws Exception;
	
	public void deleteCompany(String id) throws Exception;
	
	
}
