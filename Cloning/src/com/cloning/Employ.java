package com.cloning;

public class Employ implements Cloneable {

	private String name;
	private int id;
	private double salary;

	public Employ(String Name, int Id, double Salary) {
		name = Name;
		id = Id;
		salary = Salary;

	}

	public void setName(String Name) {
		name = Name;
	}

	public String getName() {
		return name;
	}

	public void setId(int Id) {
		id = Id;
	}

	public int getId() {
		return id;
	}

	public void setSalary(double Salary) {
		salary = Salary;
	}

	public double getSalary() {
		return salary;
	}

	public String yv() {
		return "Employ [Name:-" + name + ", ID:-" + id + ", Salary:-" + salary + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employ origionalEmploy = new Employ("Prasad", 01, 40000.00);
		System.out.println(origionalEmploy.yv());
		Employ clonedEmploy = (Employ) origionalEmploy.clone();
		System.out.println(clonedEmploy.yv());
		System.out.println("After update Employ Name");
		origionalEmploy.setName("Varaprasad");
//		clonedEmploy.setName("Varaprasad");
		System.out.println(origionalEmploy.yv());
		System.out.println(clonedEmploy.yv());
	}
}
