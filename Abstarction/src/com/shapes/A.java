package com.shapes;

public class A {
	
	double value;

	
	
	public A() {
	}

	public A(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		if(value==20.00) {
			System.out.println("please enter a valid no");
		}else {
		this.value = value;
		}
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.setValue(21.00);
		System.out.println(a.getValue());
		
	}
	

}
