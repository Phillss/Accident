package com.ssm.mapper.result;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Result_t_Vo;

public interface ResultMapper {

	
	public Result_t_Vo ResultFindById(String id) throws Exception;
	
	public List<Result_t_Vo> findall(PageIndex pageindex) throws Exception;
	
	public Integer findcounts() throws Exception;
	
	public List<Result_t_Vo> likefind(String name) throws Exception;
	
	public void updateResult(Result_t_Vo result) throws Exception;
	
	public void deleteResult(String id) throws Exception;
	
	public void insertResult(Result_t_Vo result) throws Exception;
}
