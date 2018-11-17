package com.ssm.mapper.laws;

import java.util.List;

import com.ssm.pojo.Vo.Laws_t_Vo;

public interface LawsMapper {

	public Laws_t_Vo lawsFindById(String id) throws Exception;
	
	public List<Laws_t_Vo> findall() throws Exception;
	
	public void insertLaws(Laws_t_Vo laws) throws Exception;
	
	public void updateLaws(Laws_t_Vo law) throws Exception;
	
	public void deleteLaws(String id) throws Exception;
}
