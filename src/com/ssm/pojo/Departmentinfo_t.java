package com.ssm.pojo;
public class Departmentinfo_t {
	String de_id;// 岗位唯一id
	String de_name;// 岗位名称
	String de_companyId;// 依赖的公司id
	String de_companyName;
	
	public String getDe_id() {
		return de_id;
	}

	public String getDe_companyName() {
		return de_companyName;
	}

	public void setDe_companyName(String de_companyName) {
		this.de_companyName = de_companyName;
	}

	public void setDe_id(String de_id) {
		this.de_id = de_id;
	}

	public String getDe_name() {
		return de_name;
	}

	public void setDe_name(String de_name) {
		this.de_name = de_name;
	}

	public String getDe_companyId() {
		return de_companyId;
	}

	public void setDe_companyId(String de_companyId) {
		this.de_companyId = de_companyId;
	}

}
