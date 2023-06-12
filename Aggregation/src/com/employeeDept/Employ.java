package com.employeeDept;

public class Employ {

	private String name;
	private int id;
	private double salary;
	private String role;
	private String experience;

	public Employ(String name, int id, double salary, String role, String experience) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.experience = experience;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getExperience() {
		return experience;
	}

	public String toString() {
		return "Employ[Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Role=" + role + ", Experience="
				+ experience + "]";

	}
}
