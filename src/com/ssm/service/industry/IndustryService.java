package com.ssm.service.industry;

import java.util.List;
import java.util.Map;
import com.ssm.pojo.Vo.Industry_t_Vo;

public interface IndustryService {

	//查看所有行业
	List<Map<String,String>> serviceFindAllIndustry() throws Exception;
	//通过ID查看行业
	Industry_t_Vo serviceFindIndustry(String id) throws Exception;
}
