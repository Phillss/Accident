package com.ssm.mapper.causeclass;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Causeclass_t_Vo;

public interface CauseMapper {

	public void insertCause(Causeclass_t_Vo cause)throws Exception;
	
	public void deleteCause(String id) throws Exception;
	
	public Causeclass_t_Vo findCauseById(String id) throws Exception;
	
	public List<Causeclass_t_Vo> findAllCause(PageIndex pageindex) throws Exception;
	
	public Integer findcount() throws Exception;
	
	public void updateCause(Causeclass_t_Vo cause) throws Exception;
}
