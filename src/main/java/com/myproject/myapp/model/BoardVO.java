package com.myproject.myapp.model;

import java.io.Serializable;

public class BoardVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String fName;
	private String lName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
