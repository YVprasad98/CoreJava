package com.Array;

public class MaxNumber {
	public static void main(String[] args) {
		int[] a = { 30, 50, 25, 80, 90, 75 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max=a[i];
				
			}
		}System.out.println(max);
	}

}
