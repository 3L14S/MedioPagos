package com.example.demo.entities;



public class Payer {
	  
	
	  private String name;
	  private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Payer [name=" + name + ", email=" + email + "]";
	}

	

	  
	 

	
	  
	  
	  
	}