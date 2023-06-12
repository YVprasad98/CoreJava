package com.abstraction;

public abstract class Player {
	
	abstract void pname(String name);
	abstract void pid(int id);
	abstract void pgame(String game);
	abstract void page(int age);
	static void pcountry() {
		System.out.println("Country :- "+"India");
	}
	
	}
