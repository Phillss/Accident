package com.ssm.mapper.accidentinfo;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;

public interface AccidentinfoMapper {
	
	public Accidentinfo_t_Vo findAccidentById(String id) throws Exception;
	
	public void insertAccidentinfo(Accidentinfo_t_Vo accident) throws Exception;
	
	public void updateAccidentinfo(Accidentinfo_t_Vo accident) throws Exception;
	
	public void deleteAccidentinfo(String id) throws Exception;
	
	public List<Accidentinfo_t_Vo> findAll(PageIndex pageindex) throws Exception;
	
	public Integer findCounts() throws Exception;
	
	public List<Accidentinfo_t_Vo> likefinds(String name) throws Exception;
}
