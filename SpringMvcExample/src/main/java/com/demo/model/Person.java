package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name = "tom larsen";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
