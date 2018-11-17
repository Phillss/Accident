package com.ssm.mapper.user;

import java.util.List;

import com.ssm.pojo.PageBean;
import com.ssm.pojo.PageIndex;
import com.ssm.pojo.Vo.User_t_Vo;

public interface UserMapper {
	
	/*根据id查找用户
	 * */
	public User_t_Vo findUserById(String id) throws Exception;
	
	/*根据用户名查找用户
	 * */
	public User_t_Vo findUserByName(String name) throws Exception;
	
	/***
	 * 查询所有记录数
	 */
	public Integer findCounts() throws Exception;
	
	/*查询所有用户
	 * */
	public List<User_t_Vo> findAllUsers(PageIndex pageindex) throws Exception;
	
	/*根据用户名模糊查找用户
	 * */
	public List<User_t_Vo> findLikeUserByName(PageIndex pageindex) throws Exception;
	
	/*增加单个用户
	 * */
	public void insertintoUser(User_t_Vo user) throws Exception;
	
	/*管理员更改用户信息
	 * */
	public void updateUser(User_t_Vo user) throws Exception;

	/*用户更改用户信息
	 * */
	public void updateUserByself(User_t_Vo user) throws Exception;
	
	/*删除用户
	 * */
	public void deleteUser(String id) throws Exception;
	
	

}
