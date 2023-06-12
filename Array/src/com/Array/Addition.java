package com.Array;

public class Addition {
	public static void main(String[] args) {
		int[] i = { 10, 20, 30, 40, 50 };
		for (int x = 0; x < i.length; x++) {
			for (int j = 0; j < x; j++) {
				if (i[x] + i[j] == 80) {
					System.out.println(i[x] + "+" + i[j] + "=" + (i[x] + i[j]));
				}
			}
			
		}
	}
}
