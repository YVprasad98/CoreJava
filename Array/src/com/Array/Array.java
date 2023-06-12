package com.Array;

public class Array {
	public static void main(String[] args) {
		String[] name = new String[5];
		name[0] = "Mahesh";
		name[1] = "is";
		name[2] = "a";
		name[3] = "bad";
		name[4] = "boy";
//		name[0] = "Prasad";
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
	}
}
