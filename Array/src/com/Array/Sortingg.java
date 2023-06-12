package com.Array;

public class Sortingg {
	public static void main(String[] args) {
		int[] arr = { 30, 40, 10, 20, 60, 50 };
		int sort = 0;
		for (int i = 1; i <arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
					
				}
			}System.out.println(arr[i]);
		}
	}

}
