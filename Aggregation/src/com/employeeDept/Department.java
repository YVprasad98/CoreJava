package com.employeeDept;

public class Department {

	private String deptName;
	private Employ employ;

	Department(String deptName, Employ employ) {
		super();
		this.deptName = deptName;
		this.employ = employ;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setEmploy(Employ employ) {
		this.employ = employ;
	}

	public Employ getEmploy() {
		return employ;

	}

	public String prasad() { // toString method
		return "Department[Department=" + deptName + " " + employ + "]";

	}

	public static void main(String[] args) {
		Employ emp = new Employ("Prasad", 171515210, 40000.00, "Developer", "2 years");

		Department dept = new Department("Production", emp);

		System.out.println(dept.prasad());
	}
}
