package com.hospital;

public class Patient {
	private String name;
	private int age;
	private int weight;
	private String bp;

	public Patient(String name, int age, int weight, String bp) {
		this.name = name;
//		this.opNum = opNum;
		this.age = age;
		this.weight = weight;
		this.bp = bp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public int getOpNum() {
//		return opNum;
//	}
//
//	public void setOpNum(int opNum) {
//		this.opNum = opNum;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBP() {
		return bp;
	}

	public void setBP(String bp) {
		this.bp = bp;
	}

	public String toString() {
		return "Patient[Name="+name+", Age=" + age + ", Weight" + weight + ", BP=" + bp
				+ "]";
	}
}
