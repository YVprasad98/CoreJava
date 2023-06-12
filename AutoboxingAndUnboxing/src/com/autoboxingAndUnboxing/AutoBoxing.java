package com.autoboxingAndUnboxing;

public class AutoBoxing {
	public static void main(String[] args) {
		byte b = 120;
		Byte bt = new Byte(b);           // Auto boxing
		System.out.println(bt);
		Byte.valueOf(b);                // Auto boxing
		System.out.println(bt);

		Integer i = Integer.valueOf(200);
		int a = i;                       // Unboxing
		System.out.println(a);

		Integer in = new Integer(250);  
		int x = in;                      //Unboxing
		System.out.println(x);

		Integer y = new Integer(500);    //Unboxing
		if (y <= 600)
			System.out.println(y);
		
	}
}
