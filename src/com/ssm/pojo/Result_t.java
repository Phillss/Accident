package com.ssm.pojo;
import java.util.Date;

public class Result_t {
	String re_id;// 分析结果的唯一id
	String re_analyzeId;// 分析结果所属的分析人员
	String re_reasion;// 引发事故的原因
	String re_measure;// 对应的措施
	String re_causeClass;// 对应原因的类别

	String re_law;// 对应的法规
	Integer re_flag;// 分析结果状态 0 草稿状态 1 待审核 2 审核驳回 3 审核通过
	Date re_uploadTime;// 分析结果提交的时间
	String re_accidentInfo;
	String re_checkId;
	public String getRe_accidentInfo() {
		return re_accidentInfo;
	}

	public void setRe_accidentInfo(String re_accidentInfo) {
		this.re_accidentInfo = re_accidentInfo;
	}

	public String getRe_checkId() {
		return re_checkId;
	}

	public void setRe_checkId(String re_checkId) {
		this.re_checkId = re_checkId;
	}

	public String getRe_accidentName() {
		return re_accidentName;
	}

	public void setRe_accidentName(String re_accidentName) {
		this.re_accidentName = re_accidentName;
	}

	String re_accidentName;
	public String getRe_id() {
		return re_id;
	}

	public void setRe_id(String re_id) {
		this.re_id = re_id;
	}

	public String getRe_analyzeId() {
		return re_analyzeId;
	}

	public void setRe_analyzeId(String re_analyzeId) {
		this.re_analyzeId = re_analyzeId;
	}

	public String getRe_reasion() {
		return re_reasion;
	}

	public void setRe_reasion(String re_reasion) {
		this.re_reasion = re_reasion;
	}

	public String getRe_measure() {
		return re_measure;
	}

	public void setRe_measure(String re_measure) {
		this.re_measure = re_measure;
	}

	public String getRe_causeClass() {
		return re_causeClass;
	}

	public void setRe_causeClass(String re_causeClass) {
		this.re_causeClass = re_causeClass;
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

	public Date getRe_uploadTime() {
		return re_uploadTime;
	}

	public void setRe_uploadTime(Date re_uploadTime) {
		this.re_uploadTime = re_uploadTime;
	}

}
