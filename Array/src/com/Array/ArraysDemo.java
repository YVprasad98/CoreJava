package com.Array;

public class ArraysDemo {
	public static void main(String[] args) {
		// 1.Static array
		int[] a = new int[3];
		a[0] = 50;
		a[1] = 30;
		a[2] = 100;
		int sum = 0;
		int summ = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			// 2.Dynamic array
			int[] b = { 50, 100, 150, 200 };
			for (int j = 0; j < b.length; j++) {

				summ = summ + b[j];

			}
			System.out.println(summ);

		}
		System.out.println(sum);

	}

}
