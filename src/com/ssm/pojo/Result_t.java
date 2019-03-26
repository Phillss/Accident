package com.ssm.pojo;
import java.util.Date;

public class Result_t {
	String re_id;// 事故编号
	String re_reasonAn;// 原因分析
	String re_reasonClass;// 原因分类
	String re_Tiaokuan;// 违反条款
	String re_measure;// 对应的措施
	String re_law;// 对应的法规
	Integer re_flag;// 分析结果状态 0 草稿状态 1 待审核 2 审核驳回 3 审核通过
	public String getRe_id() {
		return re_id;
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
	public String getRe_law() {
		return re_law;
	}
	public void setRe_law(String re_law) {
		this.re_law = re_law;
	}
	public Integer getRe_flag() {
		return re_flag;
	}
	public void setRe_flag(Integer re_flag) {
		this.re_flag = re_flag;
	}
	
	

}
