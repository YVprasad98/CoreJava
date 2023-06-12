package com.accessmodifiers;

public class AccessModifier {
	
	private String name;
	
	void setName(String Name) {
		name=Name;
	}
	public String getName(String name ) {
		return name;
	}
	
	
     private void AccessModifier() {
		System.out.println("Access Modifier constructor");
	}
     
     private void am() {
		System.out.println("Access Modifier method");
	}

//	public void setName(String name) {
//		this.name = name;
	}


