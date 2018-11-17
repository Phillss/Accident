package com.ssm.service.log;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.log.LogMapper;
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

}
