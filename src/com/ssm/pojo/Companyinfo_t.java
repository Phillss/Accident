package com.ssm.pojo;
import java.util.Date;

public class Companyinfo_t {
	String co_id;// 公司的唯一标识符
	String co_name;// 公司名称
	Date co_createTime;// 公司入驻的时间
	String co_introduce;// 公司的简介

	public String getCo_id() {
		return co_id;
	}

	public void setCo_id(String co_id) {
		this.co_id = co_id;
	}

	public String getCo_name() {
		return co_name;
	}

	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}

	public Date getCo_createTime() {
		return co_createTime;
	}

	public void setCo_createTime(Date co_createTime) {
		this.co_createTime = co_createTime;
	}

	public String getCo_introduce() {
		return co_introduce;
	}

	public void setCo_introduce(String co_introduce) {
		this.co_introduce = co_introduce;
	}

}
