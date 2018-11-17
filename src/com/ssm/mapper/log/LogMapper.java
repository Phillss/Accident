package com.ssm.mapper.log;

import com.ssm.pojo.Vo.Log_t_Vo;

public interface LogMapper {

	public Log_t_Vo logFindById(String id) throws Exception;
}
