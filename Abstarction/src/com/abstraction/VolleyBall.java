package com.abstraction;

public class VolleyBall extends Cricket {
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
	void height(String h) {
		System.out.println("Player Height:- "+h);
	}

	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.pname("K.L.Rahul");
		c.pid(01);
		c.pgame("Cricket");
		c.page(30);
		c.pcountry();
		System.out.println("------------");
		VolleyBall v = new VolleyBall();
		v.pname("Prasad");
		v.pid(101);
		v.pgame("Volleyball");
		v.page(24);
		v.pcountry();
		v.height("167 cm");
	}

}
