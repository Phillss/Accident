package com.ssm.pojo;
public class Employeecourse_t {
	String ec_employeeId;// 员工id
	String ec_courseId;// 课程id
	Integer ec_courseAttribute;// 课程的属性 0企业选 1 自选

	public String getEc_employeeId() {
		return ec_employeeId;
	}

	public void setEc_employeeId(String ec_employeeId) {
		this.ec_employeeId = ec_employeeId;
	}

	public String getEc_courseId() {
		return ec_courseId;
	}

	public void setEc_courseId(String ec_courseId) {
		this.ec_courseId = ec_courseId;
	}

	public Integer getEc_courseAttribute() {
		return ec_courseAttribute;
	}

	public void setEc_courseAttribute(Integer ec_courseAttribute) {
		this.ec_courseAttribute = ec_courseAttribute;
	}

}
