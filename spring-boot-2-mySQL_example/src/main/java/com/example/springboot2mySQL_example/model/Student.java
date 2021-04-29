package com.example.springboot2mySQL_example.model;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot2mySQL_example.model.Laptop;


@Entity
@Table(name="students")
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String contactNo;
	private String stream;
	private String indgName;
	

    @OneToOne(mappedBy="student", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Laptop lapi;

	public Student() {
		super();
	}

	public Student(String indgName, String stm, String number) {
		super();		
		this.indgName = indgName;
		this.stream = stm;
		this.contactNo = number;
	}

	public Student(String indgName, String stm) {
		super();
		this.indgName = indgName;
		this.stream = stm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndgName() {
		return indgName;
	}

	public void setIndgName(String indgName) {
		this.indgName = indgName; 
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stm) {
		this.stream = stm;
	}

	public String getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Laptop getLapi() {
		return lapi;
	}

	public void setLapi(Laptop lapi) {
		this.lapi = lapi;
	}

	@Override
	public String toString() {
		return String.format("Student [indgName=%s, contactNo=%s, ]", indgName, contactNo);
	}
}

