package com.ssm.mapper.accidentlevel;

import com.ssm.pojo.Vo.Accidentlevel_t_Vo;

public interface AccidentLevelMapper {
	
	public Accidentlevel_t_Vo findAccidentlevelById(String id) throws Exception;
	
	public void insertAccidentlevel(Accidentlevel_t_Vo level) throws Exception;
	
	public void updateAccidentlevel(Accidentlevel_t_Vo level) throws Exception;
	
	public void deleteAccidentlevel(String id) throws Exception;
}
