package com.ssm.service.log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.log.LogMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Log_t_Vo;

public class LogServiceImpl implements Log {

	@Autowired
	LogMapper logmapper;
	
	@Override
	public Log_t_Vo serviceFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Log_t_Vo log=logmapper.logFindById(id);
		return log;
	}

	@Override
	public List<Log_t_Vo> servicefindalllog(PageIndex pageindex) throws Exception {
		// TODO Auto-generated method stub
		return logmapper.findAlllog(pageindex);
	}

	@Override
	public Integer servicefindcounts() throws Exception {
		// TODO Auto-generated method stub
		return logmapper.findCounts();
	}

	@Override
	public void serviceinsertlog(Log_t_Vo log) throws Exception {
		// TODO Auto-generated method stub
		logmapper.insertLog(log);
	}
	
	

}
