package com.personAddress;

public class Address {
	private int id;
	private String city;
	private String state;
	private String zipCode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, String state, String zipCode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

}
