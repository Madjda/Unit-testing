package com.example.model;

public class Product {
	
	private int ref;
	private String name;
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Product(int ref, String name) {
		super();
		this.ref = ref;
		this.name = name;
	}
	
	

}
