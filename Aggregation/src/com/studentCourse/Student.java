package com.studentCourse;

public class Student {

	private int id;
	private String name;
	private Course course;

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	
	public static void main(String[] args) {
		Course course = new Course("dh", 123456);
		Student sp=new Student(1, "sdrty", course);
		System.out.println(sp);
	}
}
