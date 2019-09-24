package com.Apex.RestAPI;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="customers")
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	@XmlElement(name="id")
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement(name="firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement(name="lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	@XmlElement(name="street")
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	@XmlElement(name="city")
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
    public String toString() {
        return "Customer [id=" + id + ", firstname=" + firstName + ", "
        		+ "lastName=" + lastName + "], street=" + street + ", city=" + city + "";
    }
}
