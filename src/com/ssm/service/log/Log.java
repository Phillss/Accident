package com.ssm.service.log;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Log_t_Vo;

public interface Log {

	public Log_t_Vo serviceFind(String id) throws Exception;
	
	public List<Log_t_Vo> servicefindalllog(PageIndex pageindex) throws Exception;
	
	public Integer servicefindcounts() throws Exception;
	
	public void serviceinsertlog(Log_t_Vo log) throws Exception;
}
