package com.ssm.pojo;
import java.util.Date;

public class Theory_t {
	String th_id;// 事故致因理论唯一id
	String th_name;// 事故致因理论文件名称
	String th_save;// 文件存储的路径
	Date th_uploadTime;// 上传的时间
	String th_fileName;// 文件的名称

	public String getTh_id() {
		return th_id;
	}

	public void setTh_id(String th_id) {
		this.th_id = th_id;
	}

	public String getTh_name() {
		return th_name;
	}

	public void setTh_name(String th_name) {
		this.th_name = th_name;
	}

	public String getTh_save() {
		return th_save;
	}

	public void setTh_save(String th_save) {
		this.th_save = th_save;
	}

	public Date getTh_uploadTime() {
		return th_uploadTime;
	}

	public void setTh_uploadTime(Date th_uploadTime) {
		this.th_uploadTime = th_uploadTime;
	}

	public String getTh_fileName() {
		return th_fileName;
	}

	public void setTh_fileName(String th_fileName) {
		this.th_fileName = th_fileName;
	}

}
