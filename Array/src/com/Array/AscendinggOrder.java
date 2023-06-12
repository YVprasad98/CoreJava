package com.Array;

public class AscendinggOrder {
	public static void main(String[] args) {
		int[] a = { 30, 10, 50, 100, 20, 40, 25 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}System.out.print(a[i]+" ");
		}
	}

}
