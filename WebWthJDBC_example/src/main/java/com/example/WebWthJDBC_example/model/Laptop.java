package com.example.WebWthJDBC_example.model;

import org.springframework.stereotype.Component;
import com.example.WebWthJDBC_example.model.Laptop;

// import javax.persistence.Entity;
// import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="laptops")
public class Laptop {
    
	private String modelName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long serialNo;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
	private Student student;

	
	
	public Laptop() {
		super();
	}

	public Laptop(String name, Long id) {
		super();
		this.serialNo = id;
		this.modelName = name;
	}

	public Long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Long id) {
		this.serialNo = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String name) {
		this.modelName = name;
	}
	@Override
	public String toString() {
		return String.format("Laptop [name=%s, serialNo=%s]", modelName, serialNo);
	}

}
