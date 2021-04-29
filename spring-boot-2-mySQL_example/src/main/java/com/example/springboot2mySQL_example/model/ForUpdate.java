package com.example.springboot2mySQL_example.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
public class ForUpdate {
    
	private String indgName;
	private String contactNo;
	private String stream;
	
	public ForUpdate() {
		super();
	}

	public ForUpdate(String name, String nu, String stm) {
		super();
		this.indgName = name;
		this.contactNo = nu;
		this.stream = stm;
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

	public String getStream() {
		return stream;
	}

	public void setStream(String stm) {
		this.stream = stm;
	}

	@Override
	public String toString() {
		return String.format("ForUpdate [indgName=%s, conctactNo=%s, stream=%s]", indgName, contactNo, stream);
	}
}

