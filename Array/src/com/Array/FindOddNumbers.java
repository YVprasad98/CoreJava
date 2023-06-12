package com.Array;

public class FindOddNumbers {
	public static void main(String[] args) {
		int[] n = { 9, 7, 8, 10, 3 };
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 != 0) {
				System.out.println(n[i]);
			}
		}
	}

}
