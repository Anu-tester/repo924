package com.Apex.RestAPI;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerMKY {

	private int id;
	private int age;
	private String name;
	public CustomerMKY()
	{
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
