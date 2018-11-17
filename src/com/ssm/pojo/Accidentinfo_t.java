package com.ssm.pojo;
import java.util.Date;

public class Accidentinfo_t {
	String acc_id; // 事故信息的唯一Id
	String acc_industryId;// 事故信息所属行业的唯一Id
	String acc_level;// 事故等级
	String acc_name;// 事故信息的名称
	Date acc_time;// 事故发生的时间

	String acc_site;// 事故发生的地点
	public String getAcc_industryName() {
		return acc_industryName;
	}

	public void setAcc_industryName(String acc_industryName) {
		this.acc_industryName = acc_industryName;
	}

	public String getAcc_levelName() {
		return acc_levelName;
	}

	public void setAcc_levelName(String acc_levelName) {
		this.acc_levelName = acc_levelName;
	}

	Integer acc_deathSum;// 事故的死亡人数，默认为0
	Integer acc_injuredSum;// 事故的受伤人数，默认为0
	Long acc_financial;// 事故的经济损失，默认为0
	String acc_boss;// 事故负责人

	String acc_org;// 施工单位
	String acc_fileName;// 事故调查报告文件名称（文件存储之后需要被id重命名）
	String acc_save;// 事故调查报告文件存储路径
	Date acc_uploadTime;// 事故调查报告上传的时间
	String acc_industryName;
	String acc_levelName;
	public String getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}

	public String getAcc_industryId() {
		return acc_industryId;
	}

	public void setAcc_industryId(String acc_industryId) {
		this.acc_industryId = acc_industryId;
	}

	public String getAcc_level() {
		return acc_level;
	}

	public void setAcc_level(String acc_level) {
		this.acc_level = acc_level;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public Date getAcc_time() {
		return acc_time;
	}

	public void setAcc_time(Date acc_time) {
		this.acc_time = acc_time;
	}

	public String getAcc_site() {
		return acc_site;
	}

	public void setAcc_site(String acc_site) {
		this.acc_site = acc_site;
	}

	public Integer getAcc_deathSum() {
		return acc_deathSum;
	}

	public void setAcc_deathSum(Integer acc_deathSum) {
		this.acc_deathSum = acc_deathSum;
	}

	public Integer getAcc_injuredSum() {
		return acc_injuredSum;
	}

	public void setAcc_injuredSum(Integer acc_injuredSum) {
		this.acc_injuredSum = acc_injuredSum;
	}

	public Long getAcc_financial() {
		return acc_financial;
	}

	public void setAcc_financial(Long acc_financial) {
		this.acc_financial = acc_financial;
	}

	public String getAcc_boss() {
		return acc_boss;
	}

	public void setAcc_boss(String acc_boss) {
		this.acc_boss = acc_boss;
	}

	public String getAcc_org() {
		return acc_org;
	}

	public void setAcc_org(String acc_org) {
		this.acc_org = acc_org;
	}

	public String getAcc_fileName() {
		return acc_fileName;
	}

	public void setAcc_fileName(String acc_fileName) {
		this.acc_fileName = acc_fileName;
	}

	public String getAcc_save() {
		return acc_save;
	}

	public void setAcc_save(String acc_save) {
		this.acc_save = acc_save;
	}

	public Date getAcc_uploadTime() {
		return acc_uploadTime;
	}

	public void setAcc_uploadTime(Date acc_uploadTime) {
		this.acc_uploadTime = acc_uploadTime;
	}
}
