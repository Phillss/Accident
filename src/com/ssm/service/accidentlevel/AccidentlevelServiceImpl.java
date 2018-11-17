package com.ssm.service.accidentlevel;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.accidentlevel.AccidentLevelMapper;
import com.ssm.pojo.Vo.Accidentlevel_t_Vo;

public class AccidentlevelServiceImpl{

	@Autowired
	private AccidentLevelMapper mapper;
	
	public Accidentlevel_t_Vo serviceFindAccidentlevel(String id) throws Exception {
		// TODO Auto-generated method stub
		Accidentlevel_t_Vo accident=mapper.findAccidentlevelById(id);
		return accident;
	}

	public void serviceinsert(Accidentlevel_t_Vo level) throws Exception{
		mapper.insertAccidentlevel(level);
	}
	
	public void serviceupdate(Accidentlevel_t_Vo level) throws Exception{
		mapper.updateAccidentlevel(level);
	}
	
	public void servicedelete(String id) throws Exception{
		mapper.deleteAccidentlevel(id);
	}
}
