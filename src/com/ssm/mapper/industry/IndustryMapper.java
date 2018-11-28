package com.ssm.mapper.industry;

import java.util.List;

import com.ssm.pojo.Vo.Industry_t_Vo;

public interface IndustryMapper {

	public Industry_t_Vo findIndustryById(String id) throws Exception;
	
	public void insertIndustry(Industry_t_Vo industry) throws Exception;
	
	public void updateIndustry(Industry_t_Vo industry) throws Exception;
	
	public void deleteIndustry(String id) throws Exception;
	
	public List<Industry_t_Vo> findAll() throws Exception;
	
	public  Industry_t_Vo  findByName(String name) throws Exception;
}
