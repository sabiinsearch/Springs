package com.example.WebWthJDBC_example.model;


// import javax.persistence.Entity;
// import javax.persistence.Id;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import com.example.WebWthJDBC_example.model.Laptop;


//@Entity
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

