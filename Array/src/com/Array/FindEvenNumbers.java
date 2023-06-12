package com.Array;

public class FindEvenNumbers {
	public static void main(String[] args) {
		int[] t = { 20, 33, 54, 10, 2, 1 };
		for (int i = 0; i < t.length; i++) {
			if (t[i] % 2 == 0) {
				System.out.println(t[i]);
			}
		}
	}

}
