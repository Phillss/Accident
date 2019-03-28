package com.ssm.pojo;
import java.util.Date;

public class Result_t {
	String re_id;// 事故编号
	String re_number;//原因编号
	String re_acc_number;//事故编号
	String re_reasonAn;// 原因分析
	String re_reasonClass;// 原因分类
	String re_Tiaokuan;// 违反条款
	String re_measure;// 对应的措施
	String re_industry;// 所属行业
	Integer re_flag;// 
	public String getRe_id() {
		return re_id;
	}
	public String getRe_number() {
		return re_number;
	}
	public void setRe_number(String re_number) {
		this.re_number = re_number;
	}
	public String getRe_acc_number() {
		return re_acc_number;
	}
	public void setRe_acc_number(String re_acc_number) {
		this.re_acc_number = re_acc_number;
	}
	public String getRe_industry() {
		return re_industry;
	}
	public void setRe_industry(String re_industry) {
		this.re_industry = re_industry;
	}
	public void setRe_id(String re_id) {
		this.re_id = re_id;
	}
	public String getRe_reasonAn() {
		return re_reasonAn;
	}
	public void setRe_reasonAn(String re_reasonAn) {
		this.re_reasonAn = re_reasonAn;
	}
	public String getRe_reasonClass() {
		return re_reasonClass;
	}
	public void setRe_reasonClass(String re_reasonClass) {
		this.re_reasonClass = re_reasonClass;
	}
	public String getRe_Tiaokuan() {
		return re_Tiaokuan;
	}
	public void setRe_Tiaokuan(String re_Tiaokuan) {
		this.re_Tiaokuan = re_Tiaokuan;
	}
	public String getRe_measure() {
		return re_measure;
	}
	public void setRe_measure(String re_measure) {
		this.re_measure = re_measure;
	}
	public Integer getRe_flag() {
		return re_flag;
	}
	public void setRe_flag(Integer re_flag) {
		this.re_flag = re_flag;
	}
	
	

}
