package com.Array;

public class SumOfAllElements {
	public static void main(String[] args) {
		int[] x = { 30, 50, 40, 10 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
	}

}
