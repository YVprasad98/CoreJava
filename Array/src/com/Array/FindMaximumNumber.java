package com.Array;

public class FindMaximumNumber {
	public static void main(String[] args) {
		int[] a = { 25, 50, 100, 150, 30, 500, 200, 600 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
