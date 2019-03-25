package com.ssm.mapper.industry;

import java.util.List;
import com.ssm.pojo.Vo.Industry_t_Vo;

public interface IndustryMapper {

	//查看所有行业
	public List<Industry_t_Vo> findAllIndustry() throws Exception;

	public Industry_t_Vo findIndustryById(String id) throws Exception;

	public void insertIndustry(Industry_t_Vo industry) throws Exception;

	public void updateIndustry(Industry_t_Vo industry) throws Exception;

	public void deleteIndustry(String id) throws Exception;
}
