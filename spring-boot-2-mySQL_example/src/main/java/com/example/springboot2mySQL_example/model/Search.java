package com.example.springboot2mySQL_example.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
public class Search {
    
	private String indgName;
	private String contactNo;
	
	public Search() {
		super();
	}

	public Search(String name) {
		super();
		this.indgName = name;
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
		return String.format("Search [indgName=%s, conctactNo]", indgName, contactNo);
	}
}

