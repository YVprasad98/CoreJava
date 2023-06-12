package com.Array;

public class RemoveElement {
	public static void main(String[] args) {
		int[] a = { 15, 30, 12, 20, 25, 40 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 12)
				System.out.print(a[i] + " ");
		}
	}

}
