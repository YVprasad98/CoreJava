package com.personAddress;

public class Person {

	private int id;
	private String name;
	private Address address;
	private Person spouse;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, Address address, Person spouse) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.spouse = spouse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person getSpouse() {
		return spouse;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", spouse=" + spouse + "]";
	}
}