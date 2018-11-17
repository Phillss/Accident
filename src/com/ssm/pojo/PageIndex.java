package com.ssm.pojo;

public class PageIndex {
	
	private String id;
	private String name;
	private int current;
	private int per_record=10;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getPer_record() {
		return per_record;
	}
	public void setPer_record(int per_record) {
		this.per_record = per_record;
	}
	
	
}
