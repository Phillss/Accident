package com.ssm.service.accidentinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.accidentinfo.AccidentinfoMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Accidentinfo_t_Vo;

public class AccidentinfoServiceImpl{

	@Autowired
	public AccidentinfoMapper accidentMapper;
	

	public Accidentinfo_t_Vo serviceAccidentinfoFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Accidentinfo_t_Vo accident =accidentMapper.findAccidentById(id);
		return accident;
	}
	
	public void serviceinsert(Accidentinfo_t_Vo accident) throws Exception{
		accidentMapper.insertAccidentinfo(accident);
	}
	
	public void serviceupdate(Accidentinfo_t_Vo accident) throws Exception{
		accidentMapper.updateAccidentinfo(accident);
	}
	
	public void servicedelete(String id) throws Exception{
		accidentMapper.deleteAccidentinfo(id);
	}
	
	//查询所有(分页)
	public List<Accidentinfo_t_Vo> servicefindall(PageIndex pageindex) throws Exception{
		return accidentMapper.findAll(pageindex);
				
	}
	
	public Integer serviceFindCounts() throws Exception{
		return accidentMapper.findCounts();
	}
	
	public List<Accidentinfo_t_Vo> servicelikefinds(String name) throws Exception{
		return accidentMapper.likefinds(name);
	}
	

}
