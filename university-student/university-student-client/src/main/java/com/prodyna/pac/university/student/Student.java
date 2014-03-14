package com.prodyna.pac.university.student;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 4083458454159651540L;

	private Long id;
	
	private String name;

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
	
	
}
