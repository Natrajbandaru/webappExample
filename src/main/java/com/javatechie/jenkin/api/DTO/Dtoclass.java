package com.javatechie.jenkin.api.DTO;

public class Dtoclass {
	
	public String name;
	public String lastname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Dtoclass(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	public Dtoclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dtoclass [name=" + name + ", lastname=" + lastname + "]";
	}
	
}
