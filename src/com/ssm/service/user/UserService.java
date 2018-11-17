package com.ssm.service.user;

import java.util.List;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.User_t_Vo;


public interface UserService {
	
	//根据用户名查询用户
	public User_t_Vo serviceFindUserByName(String name) throws Exception;
	
	//根据用户名模糊查找用户
	public List<User_t_Vo> serviceLikeUserByName(PageIndex pageindex) throws Exception;
	
	//查询所有记录数
	public Integer findsCouts() throws Exception;
	
	//根据用户id查询用户
	public User_t_Vo serviceFindUserById(String id) throws Exception;
	
	//增加一名用户
	public void serviceInsert(User_t_Vo user) throws Exception;
	
	//管理员更改用户信息
	public void serviceUpdate(User_t_Vo user)throws Exception;
	
	//用户更改个人信息
	public void serviceUpdateByself(User_t_Vo user) throws Exception;
	
	//删除用户
	public void serviceDelete(String id) throws Exception;
	
	//查询所有用户
	public List<User_t_Vo> serviceFindAllUsers(PageIndex pageindex) throws Exception;
	

}
