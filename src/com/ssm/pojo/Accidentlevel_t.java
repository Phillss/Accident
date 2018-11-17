package com.ssm.pojo;
import java.util.Date;

public class Accidentlevel_t {
	String al_id;// 事故等级唯一标识符
	String al_name;// 事故等级的名称
	Date al_createTime;// 创建的时间

	public String getAl_id() {
		return al_id;
	}

	public void setAl_id(String al_id) {
		this.al_id = al_id;
	}

	public String getAl_name() {
		return al_name;
	}

	public void setAl_name(String al_name) {
		this.al_name = al_name;
	}

	public Date getAl_createTime() {
		return al_createTime;
	}

	public void setAl_createTime(Date al_createTime) {
		this.al_createTime = al_createTime;
	}

}
