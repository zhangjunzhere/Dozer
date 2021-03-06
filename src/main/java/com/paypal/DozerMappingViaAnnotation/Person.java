package com.paypal.DozerMappingViaAnnotation;

import org.dozer.Mapping;

public class Person {
	String name;
	int age;
	
	@Mapping("employeeName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Mapping("employeeAge")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	
