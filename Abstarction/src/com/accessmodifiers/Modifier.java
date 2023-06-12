package com.accessmodifiers;

public class Modifier extends AccessModifier{
	
	public static void main(String[] args) {
		
	AccessModifier a = new AccessModifier();
//	a.setName("prasad");
	
	 System.out.println(a.getName("Prasad"));
	 System.out.println(a.getName("Mahesh"));
	 System.out.println(a.getName("Ravi"));
	}
}
