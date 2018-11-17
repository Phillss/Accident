package com.ssm.pojo;
public class Companycourse_t {
	String cc_companyId;// 企业的id
	String cc_courseId;// 企业所选择课程的id
	String cc_courseName;
	
	public String getCc_companyId() {
		return cc_companyId;
	}

	public String getCc_courseName() {
		return cc_courseName;
	}

	public void setCc_courseName(String cc_courseName) {
		this.cc_courseName = cc_courseName;
	}

	public void setCc_companyId(String cc_companyId) {
		this.cc_companyId = cc_companyId;
	}

	public String getCc_courseId() {
		return cc_courseId;
	}

	public void setCc_courseId(String cc_courseId) {
		this.cc_courseId = cc_courseId;
	}

}
