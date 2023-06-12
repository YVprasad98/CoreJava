package com.abstraction;

public class Cricket extends Player {
	@Override
	void pname(String name) {
		System.out.println("Player Name:- " + name);
	}
	@Override
	void pid(int id) {
		System.out.println("Player ID:- " + id);
	}
	@Override
	void pgame(String game) {
		System.out.println("Player Game:- " + game);
	}
	@Override
	void page(int age) {
		System.out.println("Player Age:- " + age);
	}

//	public static void main(String[] args) {
//		

//		c.pname("K.L.Rahul");
//		c.pid(01);
//		c.pgame("Cricket");
//		c.page(30);
//		c.pcountry();

}
