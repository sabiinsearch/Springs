package com.example.WebWthJDBC_example.model;

import javax.persistence.*;
// import javax.persistence.Entity;
// import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import com.example.WebWthJDBC_example.model.Laptop;


@Entity
@Table(name="Students")
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long contactNo;

    @OneToOne(mappedBy="student", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Laptop lapi;

	public Student() {
		super();
	}

	public Student(Long id, String name, Long number) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = number;
	}

	public Student(String name, Long number) {
		super();
		this.name = name;
		this.contactNo = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return String.format("Student [id=%s, name=%s]", id, name);
	}
}

