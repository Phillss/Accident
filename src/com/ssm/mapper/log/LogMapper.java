package com.ssm.mapper.log;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Log_t_Vo;

public interface LogMapper {

	public Log_t_Vo logFindById(String id) throws Exception;
	
	public void insertLog(Log_t_Vo log) throws Exception;
	
	public Integer findCounts() throws Exception;
	
	public List<Log_t_Vo> findAlllog(PageIndex pageindex) throws Exception;
}
