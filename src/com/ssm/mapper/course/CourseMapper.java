package com.ssm.mapper.course;

import java.util.List;

import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Course_t_Vo;

public interface CourseMapper {

	//通过用户名查询
	public Course_t_Vo CourseFindById(String id) throws Exception;
	
	//查询所有记录数
	public Integer findCounts() throws Exception;
	
	//模糊查询
	public List<Course_t_Vo> likeFind(String name) throws Exception;
	
	public void insertCourse(Course_t_Vo course) throws Exception;
	
	public void updateCourse(Course_t_Vo course) throws Exception;
	
	public void deleteCourse(String id) throws Exception;
	
	//查询所有
	public List<Course_t_Vo> findAll(PageIndex index) throws Exception;
}
