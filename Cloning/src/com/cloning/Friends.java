package com.cloning;

public class Friends implements Cloneable {

	String name;
	static final int age = 25;
	static final String villName = "Neeladevipuram";
	String qualification;

	public Friends(String name, String qualification) {
		this.name = name;
		this.qualification = qualification;
	}

	String friend() {
		return "Name:-" + name + "\nAge:-" + age + "\nVillageName:-" + villName + "\nQualification:-" + qualification;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Friends origionalf1 = new Friends("VV", "B-Tech");
		System.out.println("Origional VV:-");
		System.out.println(origionalf1.friend());
		Friends clonedf1 = (Friends) origionalf1.clone();
		System.out.println("Cloned VV:-");
		System.out.println(clonedf1.friend());
		Friends origionalf2 = new Friends("MS", "Degree");
		System.out.println("Origional MS:-");
		System.out.println(origionalf2.friend());
		Friends clonedf2 = (Friends) origionalf2.clone();
		System.out.println("Cloned MS:-");
		System.out.println(clonedf2.friend());
		Friends origionalf3 = new Friends("YV", "B-Tech");
		System.out.println("Origional YV:-");
		System.out.println(origionalf3.friend());
		System.out.println("Cloned YV:-");
		Friends clonedf3 = (Friends) origionalf3.clone();
		System.out.println(clonedf3.friend());
	}
}
