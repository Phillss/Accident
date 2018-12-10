package com.ssm.pojo;
import java.util.Date;

public class Log_t {
	String lo_id;// 日志的唯一标识符
	String lo_text;// 日志的信息
	String lo_createId;// 生成日志的人员id
	Date lo_createTime;// 产生日志的时间
	Integer lo_class;// 日志的类型
	String lo_name;

	public String getLo_name() {
		return lo_name;
	}

	public void setLo_name(String lo_name) {
		this.lo_name = lo_name;
	}

	/**
	 * 企业管理员部分 00 员工管理记录 01 课程更改记录 02 岗位管理记录
	 * 
	 * 分析人员记录 03 分析人员的提交记录 04 分析人员的未通过记录 05 分析人员的通过的记录
	 * 
	 * 审核人员部分 06 审核人员的审核未通过的记录 07 审核人员的审核通过的记录
	 * 
	 * 管理员部分 08 账户管理记录 09 课程管理记录 10 事故管理记录 11 分类管理记录
	 **/
	public String getLo_id() {
		return lo_id;
	}

	public void setLo_id(String lo_id) {
		this.lo_id = lo_id;
	}

	public String getLo_text() {
		return lo_text;
	}

	public void setLo_text(String lo_text) {
		this.lo_text = lo_text;
	}

	public String getLo_createId() {
		return lo_createId;
	}

	public void setLo_createId(String lo_createId) {
		this.lo_createId = lo_createId;
	}

	public Date getLo_createTime() {
		return lo_createTime;
	}

	public void setLo_createTime(Date lo_createTime) {
		this.lo_createTime = lo_createTime;
	}

	public Integer getLo_class() {
		return lo_class;
	}

	public void setLo_class(Integer lo_class) {
		this.lo_class = lo_class;
	}

}
