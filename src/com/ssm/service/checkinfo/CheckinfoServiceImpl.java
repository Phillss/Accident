package com.ssm.service.checkinfo;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.checkinfo.CheckinfoMapper;
import com.ssm.pojo.Vo.Checkinfo_t_Vo;

public class CheckinfoServiceImpl{

	@Autowired
	CheckinfoMapper checkmapper;
	
	
	public Checkinfo_t_Vo servicefind(String id) throws Exception {
		// TODO Auto-generated method stub
		Checkinfo_t_Vo check=checkmapper.checkinfoFindById(id);
		return check;
	}
	
	public void serviceinsert(Checkinfo_t_Vo check) throws Exception{
		checkmapper.insertCheckinfo(check);
	}
	
	public void serviceupdate(Checkinfo_t_Vo check) throws Exception{
		checkmapper.updateCheckinfo(check);
	}
	
	public void servicedelete(String id) throws Exception{
		checkmapper.deleteCheckinfo(id);
	}

}
