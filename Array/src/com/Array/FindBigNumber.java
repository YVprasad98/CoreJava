package com.Array;

public class FindBigNumber {
	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 100;
		x[1] = 150;
		x[2] = 50;
		x[3] = 500;
		x[4] = 1000;
		int big = x[3];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > big ) {
				big = x[i];
			}
			
		}System.out.println(big);
	}

}
