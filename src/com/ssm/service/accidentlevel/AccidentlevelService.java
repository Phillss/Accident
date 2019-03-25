package com.ssm.service.accidentlevel;

import java.util.List;
import java.util.Map;
import com.ssm.pojo.Vo.Accidentlevel_t_Vo;

public interface AccidentlevelService {

	public Accidentlevel_t_Vo serviceFindAccidentlevel(String id) throws Exception;
	//查询所有等级
	public List<Map<String,String>> serviceFindAllAccidentlevel() throws Exception;

}
