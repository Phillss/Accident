package com.ssm.service.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.course.CourseMapper;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.Course_t_Vo;

public class CourseServiceImpl implements Course {

	@Autowired
	CourseMapper coursemapper;
	
	@Override
	public Course_t_Vo serviceFind(String id) throws Exception {
		// TODO Auto-generated method stub
		Course_t_Vo course=coursemapper.CourseFindById(id);
		return course;
	}

	@Override
	public void serviceinsert(Course_t_Vo course) throws Exception {
		// TODO Auto-generated method stub
		coursemapper.insertCourse(course);
	}

	@Override
	public void serviceupdate(Course_t_Vo course) throws Exception {
		// TODO Auto-generated method stub
		coursemapper.updateCourse(course);
	}

	@Override
	public void servicedelete(String id) throws Exception {
		// TODO Auto-generated method stub
		coursemapper.deleteCourse(id);
	}

	@Override
	public List<Course_t_Vo> servicefindall(PageIndex index) throws Exception {
		// TODO Auto-generated method stub
		return coursemapper.findAll(index);
	}

	@Override
	public List<Course_t_Vo> servicelikefind(String name) throws Exception {
		// TODO Auto-generated method stub
		return coursemapper.likeFind(name);
	}

	@Override
	public Integer servicefindcouts() throws Exception {
		// TODO Auto-generated method stub
		return coursemapper.findCounts();
	}

}
