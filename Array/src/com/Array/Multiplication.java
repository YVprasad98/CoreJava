package com.Array;

public class Multiplication {
	public void mul() {
		int[] a = { 20, 30, 40 };
		int mul = a[0];
		for (int i = 1; i < a.length; i++) {
			mul *= a[i];
		}
		System.out.println(mul);

	}

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.mul();
	}
}
