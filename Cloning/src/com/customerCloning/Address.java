package com.customerCloning;

public class Address implements Cloneable {
	private String city;
	private String state;
	private int pincode;

	public Address(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String setCity(String city) {
		return city;
	}

	public void getCity() {
		this.city = city;
	}

	public String setState(String state) {
		return state;
	}

	public void getState() {
		this.state = state;
	}

	public int setPincode(int pincode) {
		return pincode;
	}

	public void getPincode() {
		this.pincode = pincode;
	}

	public String toString() {
		return "Address[City:-" + city + " State:-" + state + " Pincode:-" + pincode + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
