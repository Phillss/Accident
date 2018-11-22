package com.ssm.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.user.UserMapper;
import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.User_t_Vo;


public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;


	//根据用户名查询用户信息
	@Override
	public List<User_t_Vo> serviceFindUserByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return usermapper.findUserByName(name);
	}
	
	//模糊查询用户
	@Override
	public List<User_t_Vo> serviceLikeUserByName(PageIndex pageindex) throws Exception {
		// TODO Auto-generated method stub
		List<User_t_Vo> list=usermapper.findLikeUserByName(pageindex);
		return list;
	}
	
	//根据用户id查询用户
	@Override
	public User_t_Vo serviceFindUserById(String id) throws Exception {
		// TODO Auto-generated method stub
		return usermapper.findUserById(id);
	}
	
	//增加一名用户
	@Override
	public void serviceInsert(User_t_Vo user) throws Exception {
		// TODO Auto-generated method stub
		usermapper.insertintoUser(user);
	}

	//管理员更新用户信息
	@Override
	public void serviceUpdate(User_t_Vo user) throws Exception {
		// TODO Auto-generated method stub
		usermapper.updateUser(user);
	}

	//用户更改个人信息
	@Override
	public void serviceUpdateByself(User_t_Vo user) throws Exception {
		// TODO Auto-generated method stub
		usermapper.updateUserByself(user);
	}
	
	//删除用户
	@Override
	public void serviceDelete(String id) throws Exception {
		// TODO Auto-generated method stub
		usermapper.deleteUser(id);
	}

	//查询所有用户
	@Override
	public List<User_t_Vo> serviceFindAllUsers(PageIndex pageindex) throws Exception {
		// TODO Auto-generated method stub
		List<User_t_Vo> list=usermapper.findAllUsers(pageindex);
		return list;
	}

	//查询所有记录
	@Override
	public Integer findsCouts() throws Exception {
		// TODO Auto-generated method stub
		return usermapper.findCounts();
	}

	

}
