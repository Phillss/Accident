package com.ssm.service.cause;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.causeclass.CauseMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Causeclass_t_Vo;

public class CauseService {

	@Autowired
	private CauseMapper mapper;
	
	public void servicedelete(String id) throws Exception{
		mapper.deleteCause(id);
	}
	
	public void servicceInsert(Causeclass_t_Vo cause) throws Exception{
		mapper.insertCause(cause);
	}
	
	public Causeclass_t_Vo serviceFindById(String id) throws Exception{
		return mapper.findCauseById(id);
	}
	
	public List<Causeclass_t_Vo> serviceFindAll(PageIndex pageindex) throws Exception{
		return mapper.findAllCause(pageindex);
	}
	
	public Integer servicefindcount() throws Exception{
		return mapper.findcount();
	}
	
	public void serviceupdatecause(Causeclass_t_Vo cause) throws Exception{
		mapper.updateCause(cause);
	}
}
