package com.ssm.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.industry.IndustryMapper;
import com.ssm.pojo.Vo.Industry_t_Vo;

public class IndustryServiceImpl{

	@Autowired
	IndustryMapper industrymapper;

	
	public Industry_t_Vo serviceFindIndustry(String id) throws Exception {
		// TODO Auto-generated method stub
		Industry_t_Vo industry=industrymapper.findIndustryById(id);
		return industry;
	}
	
	public void serviceinsert(Industry_t_Vo industry) throws Exception{
		industrymapper.insertIndustry(industry);
	}
	
	public void serviceupdate(Industry_t_Vo industry) throws Exception{
		industrymapper.updateIndustry(industry);
	}
	
	public void servicedelete(String id) throws Exception{
		industrymapper.deleteIndustry(id);
	}
	
	public List<Industry_t_Vo> serviceFindAll() throws Exception{
		return industrymapper.findAll();
	}
	
	public Industry_t_Vo serviceFindByName(String name) throws Exception{
		return industrymapper.findByName(name);
	}

}
