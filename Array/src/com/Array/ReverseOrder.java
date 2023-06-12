package com.Array;

public class ReverseOrder {
	public static void main(String[] args) {
		byte[] b = { 20, 120, 30, 45, 90, 34 };
		for (int i = b.length-1; i >= 0; i--) {
			System.out.print(b[i]+" ");
		}
	}

}
