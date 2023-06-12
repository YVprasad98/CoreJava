package com.hospital;

public class Doctor {
	private String name;
	private int opNum;
	private Patient patient;

	public Doctor(String name, int opNum, Patient patient) {
		super();
		
		this.name = name;
		this.opNum = opNum;
		this.patient=patient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOpNum() {
		return opNum;
	}

	public void setOpNum(int opNum) {
		this.opNum = opNum;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String toString() {
		return "Doctor[Name="+name+", OP Number="+opNum+"  Patient="+patient+"]";
	}
	public static void main(String[] args) {
		Patient p = new Patient("Mahesh",25, 65, "Low BP");
		Doctor d = new Doctor("Prasad", 10, p);
		System.out.println(d);
	}
}
