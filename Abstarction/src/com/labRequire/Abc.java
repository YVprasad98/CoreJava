package com.labRequire;

public class Abc {
	int a;
	String b;

	public Abc(int a1, String b1) {
		a = a1;
		b = b1;
	}

	public Abc() {
		// TODO Auto-generated constructor stub
	}

	public void getA() {
		System.out.println(a);
	}

	public void setA(int a2) {
		if (a2 == 0) {
			System.err.println("arrey chusukora Babu");
		} else {
			a = a2;
		}
	}

	public void getB() {
		System.out.println(b);
	}

	public void setB(String b1) {
		if (b1 == null) {
			System.err.println("arrey chusukora Babu");
		} else {
			b = b1;
		}
	}

	public static void main(String[] args) {
		Abc a=new Abc();
		a.setA(0);
		a.getA();
		a.getB();
	}
	public String add(String a) {
		return a;
	}
	public int add(int a) {
		return a;
	}

}
