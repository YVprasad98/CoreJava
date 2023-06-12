package com.Array;

public class MinNum {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0]=50;
		a[1]=15;
		a[2]=25;
		int min=a[2];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println(min);
	}

}
