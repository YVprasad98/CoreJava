package com.Array;

public class FindMinimumNumber {
	public static void main(String[] args) {
		int[] array = { 30, 50, 100, 10, 5, 20, 40 };
		int min = array[2];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print(min + " ");
	}

}
