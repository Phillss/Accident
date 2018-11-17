package com.ssm.service.accidentlevel;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.accidentlevel.AccidentLevelMapper;
import com.ssm.pojo.Vo.Accidentlevel_t_Vo;

public interface AccidentlevelService {
	
	public Accidentlevel_t_Vo serviceFindAccidentlevel(String id) throws Exception;
}
