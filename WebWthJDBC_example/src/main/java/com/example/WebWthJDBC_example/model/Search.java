package com.example.WebWthJDBC_example.model;

import javax.persistence.*;
// import javax.persistence.Entity;
// import javax.persistence.Id;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import com.example.WebWthJDBC_example.model.Laptop;


//@Entity
@Component
public class Search {
    
	private Long id;
	
	public Search() {
		super();
	}

	public Search(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Search [id=%s]", id);
	}
}

