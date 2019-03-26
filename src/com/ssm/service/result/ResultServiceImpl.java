package com.ssm.service.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.result.ResultMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Result_t_Vo;

public class ResultServiceImpl{

	@Autowired
	ResultMapper resultmapper;
	

	public Result_t_Vo serviceFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Result_t_Vo result =resultmapper.ResultFindById(id);
		return result;
	}
	
	public List<Result_t_Vo> servicefindall(PageIndex pageindex) throws Exception{
		return resultmapper.findall(pageindex);
	}
	
	public List<Result_t_Vo> serviceReason(PageIndex pageindex) throws Exception{
		return resultmapper.reasonClass(pageindex);
	}
	
	public Integer servicefindcount() throws Exception{
		return resultmapper.findcounts();
	}
	
	public List<Result_t_Vo> servicelikefind(String name) throws Exception{
		return resultmapper.likefind(name);
	}
	
	public void serviceupdate(Result_t_Vo result) throws Exception{
		resultmapper.updateResult(result);
	}
	public void servicedelete(String id) throws Exception{
		resultmapper.deleteResult(id);
	}
	public void serviceinsert(Result_t_Vo result) throws Exception{
		resultmapper.insertResult(result);
	}

}
