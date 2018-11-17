package com.ssm.service.laws;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.laws.LawsMapper;
import com.ssm.pojo.Vo.Laws_t_Vo;

public class LawsServiceImpl{

	@Autowired
	LawsMapper lawmapper;
	

	public Laws_t_Vo serviceFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Laws_t_Vo laws=lawmapper.lawsFindById(id);
		return laws;
	}

	public List<Laws_t_Vo> servicefindall() throws Exception{
		return lawmapper.findall();
	}
	
	public void serviceinsert(Laws_t_Vo laws) throws Exception{
		lawmapper.insertLaws(laws);
	}
	
	public void serviceupdate(Laws_t_Vo laws) throws Exception{
		lawmapper.updateLaws(laws);
	}
	
	public void servicedelete(String id) throws Exception{
		lawmapper.deleteLaws(id);
	}
}
