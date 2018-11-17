package com.ssm.pojo;
import java.util.Date;

public class Course_t {
	String cu_id;// 课程的唯一id
	String cu_industry;// 课程所属行业
	String cu_name;// 课程的名称
	String cu_introduce;// 课程简介
	String cu_save;// 课程保存的路径

	Date cu_uploadTime;// 课程上传的时间
	String cu_fileName;// 文件的名称
	String cu_industryName;
	
	public String getCu_industryName() {
		return cu_industryName;
	}

	public void setCu_industryName(String cu_industryName) {
		this.cu_industryName = cu_industryName;
	}

	public String getCu_id() {
		return cu_id;
	}

	public void setCu_id(String cu_id) {
		this.cu_id = cu_id;
	}

	public String getCu_industry() {
		return cu_industry;
	}

	public void setCu_industry(String cu_industry) {
		this.cu_industry = cu_industry;
	}

	public String getCu_name() {
		return cu_name;
	}

	public void setCu_name(String cu_name) {
		this.cu_name = cu_name;
	}

	public String getCu_introduce() {
		return cu_introduce;
	}

	public void setCu_introduce(String cu_introduce) {
		this.cu_introduce = cu_introduce;
	}

	public String getCu_save() {
		return cu_save;
	}

	public void setCu_save(String cu_save) {
		this.cu_save = cu_save;
	}

	public Date getCu_uploadTime() {
		return cu_uploadTime;
	}

	public void setCu_uploadTime(Date cu_uploadTime) {
		this.cu_uploadTime = cu_uploadTime;
	}

	public String getCu_fileName() {
		return cu_fileName;
	}

	public void setCu_fileName(String cu_fileName) {
		this.cu_fileName = cu_fileName;
	}

}
