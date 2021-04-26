package com.example.WebWthJDBC_example.model;

import javax.persistence.*;
// import javax.persistence.Entity;
// import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import com.example.WebWthJDBC_example.model.Laptop;


@Entity
@Table(name="students")
public class Student {
    
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long contactNo;
	private String stream;
	private String indgName;
	

    @OneToOne(mappedBy="student", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Laptop lapi;

	public Student() {
		super();
	}

	public Student(Long id, String indgName, String stm, Long number) {
		super();
		this.id = id;
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

	public Long getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(Long contactNo) {
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
		return String.format("Student [id=%s, indgName=%s]", id, indgName);
	}
}

