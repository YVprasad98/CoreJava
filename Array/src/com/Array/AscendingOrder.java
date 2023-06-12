package com.Array;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] a = { 20, 30, 15, 5, 50, 35, 40, 60 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}

			}
			System.out.print(a[i] + " ");

		}

	}

}
