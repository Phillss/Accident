package com.ssm.pojo;
import java.util.Date;

public class user_t {
	String us_id;// 用户的唯一id
	Integer us_roles;// 员工0 企业1 分析2 审核3 超管9
	String us_account;// 用户的唯一账号
	String us_passwd;// 用户的密码
	Date us_createTime;// 用户创建的时间
	Integer us_flag;// 0 审核未通过 1 审核通过

	public String getUs_id() {
		return us_id;
	}

	public void setUs_id(String us_id) {
		this.us_id = us_id;
	}

	public Integer getUs_roles() {
		return us_roles;
	}

	public void setUs_roles(Integer us_roles) {
		this.us_roles = us_roles;
	}

	public String getUs_account() {
		return us_account;
	}

	public void setUs_account(String us_account) {
		this.us_account = us_account;
	}

	public String getUs_passwd() {
		return us_passwd;
	}

	public void setUs_passwd(String us_passwd) {
		this.us_passwd = us_passwd;
	}

	public Date getUs_createTime() {
		return us_createTime;
	}

	public void setUs_createTime(Date us_createTime) {
		this.us_createTime = us_createTime;
	}

	public Integer getUs_flag() {
		return us_flag;
	}

	public void setUs_flag(Integer us_flag) {
		this.us_flag = us_flag;
	}

}
