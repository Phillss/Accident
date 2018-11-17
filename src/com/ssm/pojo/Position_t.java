package com.ssm.pojo;
public class Position_t {
	String po_id;// 岗位的唯一id
	String po_name;// 岗位的唯一名称
	String po_departmentId;// 岗位所属的部门id
	String po_departmentName;
	String po_companyName;
	
	public String getPo_id() {
		return po_id;
	}

	public void setPo_id(String po_id) {
		this.po_id = po_id;
	}

	public String getPo_name() {
		return po_name;
	}

	public void setPo_name(String po_name) {
		this.po_name = po_name;
	}

	public String getPo_departmentId() {
		return po_departmentId;
	}

	public void setPo_departmentId(String po_departmentId) {
		this.po_departmentId = po_departmentId;
	}

}
