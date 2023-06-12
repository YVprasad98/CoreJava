package com.Array;

public class Sorting {
	public static void main(String[] args) {
		int[] a = { 30, 20, 50, 15, 100, 10 };
		int sort = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					sort = a[i];
					a[i] = a[j];
					a[j] = sort;
				}
			}
			System.out.println(a[i]);

		}

	}
}