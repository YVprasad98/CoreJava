package com.Array;

public class MinNumber {
	public static void main(String[] args) {
		int[] x = {  432, 324, 4869, 3940, 4869 };
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i]<min) {
				min = x[i];
			}
			
		}System.out.println(min);
	}

}
