package dev.nord.springdemo.domain.test;

import java.io.Serializable;

// Incapsulate data related to a visitor
public class Visitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4516483862322486349L;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
	public Visitor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", email=" + email + "]";
	}

}
