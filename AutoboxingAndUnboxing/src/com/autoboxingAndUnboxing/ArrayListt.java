package com.autoboxingAndUnboxing;

import java.util.ArrayList;

public class ArrayListt {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		al.add(10);     //auto boxing
		al.add(30);
		al.add(50);
		System.out.println(al);
	}
}
