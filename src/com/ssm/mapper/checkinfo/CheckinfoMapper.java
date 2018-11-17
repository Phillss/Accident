package com.ssm.mapper.checkinfo;

import com.ssm.pojo.Vo.Checkinfo_t_Vo;

public interface CheckinfoMapper {
	
	public Checkinfo_t_Vo checkinfoFindById(String id) throws Exception;
	
	public void insertCheckinfo(Checkinfo_t_Vo check) throws Exception;
	
	public void updateCheckinfo(Checkinfo_t_Vo check) throws Exception;
	
	public void deleteCheckinfo(String id) throws Exception;
}
