package com.Array;

public class Sub {
	public static void main(String[] args) {
		int[] a = { 100, 200, 50, 30, 500 };
		int sub = a[4];
		for (int i = 0; i < a.length-1; i++) {
			sub = sub - a[i];
		}
		System.out.println(sub);
	}

}
