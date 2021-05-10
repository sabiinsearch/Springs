package com.example.springboot2mySQL_example.model;

import org.springframework.stereotype.Component;

@Component
public class ForDelete {
    
	private String indgName;
	private String contactNo;

	public ForDelete() {
		super();
	}

	public ForDelete(String name, String nu) {
		super();
		this.indgName = name;
		this.contactNo = nu;
	}

	public String getIndgName() {
		return indgName;
	}

	public void setIndgName(String name) {
		this.indgName = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String no) {
		this.contactNo = no;
	}

	@Override
	public String toString() {
		return String.format("ForDelete [indgName=%s, conctactNo=%s]", indgName, contactNo);
	}
}

