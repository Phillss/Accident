package com.ssm.pojo;
import java.util.Date;

public class Causeclass_t {
	String ca_id;// 原因类别的唯一标识符
	String ca_name;// 原因类别的唯一名称
	Date ca_createTime;// 创建的时间
	Integer ca_falg;
	
	public String getCa_id() {
		return ca_id;
	}

	public Integer getCa_falg() {
		return ca_falg;
	}

	public void setCa_falg(Integer ca_falg) {
		this.ca_falg = ca_falg;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	public Date getCa_createTime() {
		return ca_createTime;
	}

	public void setCa_createTime(Date ca_createTime) {
		this.ca_createTime = ca_createTime;
	}

}
