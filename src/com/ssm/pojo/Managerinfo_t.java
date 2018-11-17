package com.ssm.pojo;
import java.util.Date;

public class Managerinfo_t {
	String ma_id;// 企业管理员的唯一id
	String ma_companyId;// 管理员所属企业的id
	Date ma_createTime;// 添加管理员的时间
	String ma_companyName;
	
	public String getMa_id() {
		return ma_id;
	}

	public void setMa_id(String ma_id) {
		this.ma_id = ma_id;
	}

	public String getMa_companyId() {
		return ma_companyId;
	}

	public void setMa_companyId(String ma_companyId) {
		this.ma_companyId = ma_companyId;
	}

	public Date getMa_createTime() {
		return ma_createTime;
	}

	public void setMa_createTime(Date ma_createTime) {
		this.ma_createTime = ma_createTime;
	}

}
