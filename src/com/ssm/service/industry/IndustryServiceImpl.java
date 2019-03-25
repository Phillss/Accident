package com.ssm.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.ssm.mapper.industry.IndustryMapper;
import com.ssm.pojo.Vo.Industry_t_Vo;

public class IndustryServiceImpl{

	@Autowired
	public IndustryMapper industrymapper;

	public List<Industry_t_Vo> findAllIndustry() throws Exception {
		return this.industrymapper.findAllIndustry();
	};

	public Industry_t_Vo serviceFindIndustry(String id) throws Exception {
		// TODO Auto-generated method stub
		Industry_t_Vo industry=this.industrymapper.findIndustryById(id);
		return industry;
	}

	public void serviceinsert(Industry_t_Vo industry) throws Exception{
		this.industrymapper.insertIndustry(industry);
	}

	public void serviceupdate(Industry_t_Vo industry) throws Exception{
		this.industrymapper.updateIndustry(industry);
	}

	public void servicedelete(String id) throws Exception{
		this.industrymapper.deleteIndustry(id);
	}

}
