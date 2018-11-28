package com.ssm.pojo;

import java.util.Date;

public class Laws_t {
	String la_id;// 行业法规的唯一标识
	String la_name;// 行业法规文件的名称
	String la_save;// 行业法规在服务器的存储位置
	String la_fileName;// 行业法规文件的名称
	String la_number;
	Date la_time;
	Integer la_revise;
	String la_agency;
	public Integer getLa_revise() {
		return la_revise;
	}

	public void setLa_revise(Integer la_revise) {
		this.la_revise = la_revise;
	}

	public String getLa_agency() {
		return la_agency;
	}

	public void setLa_agency(String la_agency) {
		this.la_agency = la_agency;
	}

	public String getLa_class() {
		return la_class;
	}

	public void setLa_class(String la_class) {
		this.la_class = la_class;
	}

	String la_class;
	String la_industryId;// 行业法规的所属行业
	
	public String getLa_id() {
		return la_id;
	}

	public String getLa_number() {
		return la_number;
	}

	public void setLa_number(String la_number) {
		this.la_number = la_number;
	}

	public Date getLa_time() {
		return la_time;
	}

	public void setLa_time(Date la_time) {
		this.la_time = la_time;
	}

	public void setLa_id(String la_id) {
		this.la_id = la_id;
	}

	public String getLa_industryId() {
		return la_industryId;
	}

	public void setLa_industryId(String la_industryId) {
		this.la_industryId = la_industryId;
	}

	public String getLa_name() {
		return la_name;
	}

	public void setLa_name(String la_name) {
		this.la_name = la_name;
	}

	public String getLa_save() {
		return la_save;
	}

	public void setLa_save(String la_save) {
		this.la_save = la_save;
	}

	public String getLa_fileName() {
		return la_fileName;
	}

	public void setLa_fileName(String la_fileName) {
		this.la_fileName = la_fileName;
	}

}
