package com.ssm.service.course;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Course_t_Vo;

public interface Course {
	
	public Course_t_Vo serviceFind(String id) throws Exception;
	
	public void serviceinsert(Course_t_Vo course) throws Exception;
	
	public void serviceupdate(Course_t_Vo course) throws Exception;
	
	public  void servicedelete(String id) throws Exception;
	
	public List<Course_t_Vo> servicefindall(PageIndex index) throws Exception;
	
	public List<Course_t_Vo> servicelikefind(String name) throws Exception;
	
	public Integer servicefindcouts() throws Exception;
}
