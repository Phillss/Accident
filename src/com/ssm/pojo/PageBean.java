package com.ssm.pojo;

import java.util.List;

public class PageBean<T> {

	private int total_record;  //总记录数
	private int total_pages;  //总页数
	private int per_record=10;   //每页记录数
	private int current;  //当前页码
	private List<T> beanList;//当前页记录
	
	public int getTotal_record() {
		return total_record;
	}
	public void setTotal_record(int total_record) {
		this.total_record = total_record;
	}
	//计算总页数
	public int getTotal_pages() {
		int count=total_record/per_record;
		if(count==0) {
			return 1;
		}else {
			return total_record%per_record==0?count:count+1;
		}
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
	
	
}
