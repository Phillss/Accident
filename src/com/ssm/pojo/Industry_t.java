package com.ssm.pojo;
import java.util.Date;

public class Industry_t {
	String in_id;// 行业的唯一表示符
	String in_name;// 行业的唯一名称
	Date in_createTime;// 添加行业的时间
	String in_info;
	
	public String getIn_id() {
		return in_id;
	}

	public String getIn_info() {
		return in_info;
	}

	public void setIn_info(String in_info) {
		this.in_info = in_info;
	}

	public void setIn_id(String in_id) {
		this.in_id = in_id;
	}

	public String getIn_name() {
		return in_name;
	}

	public void setIn_name(String in_name) {
		this.in_name = in_name;
	}

	public Date getIn_createTime() {
		return in_createTime;
	}

	public void setIn_createTime(Date in_createTime) {
		this.in_createTime = in_createTime;
	}

}
