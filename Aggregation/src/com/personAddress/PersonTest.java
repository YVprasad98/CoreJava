package com.personAddress;

public class PersonTest {
	public static void main(String[] args) {
		Address dhoniAddress = new Address(1, "Hyd", "TS", "500038");
		Address sakshiAddress = new Address(1, "ranchi", "Jarqand", "300038");
		Person sakshi = new Person(100, "sakshi", sakshiAddress);
		Person person = new Person(1, "dhoni", dhoniAddress, sakshi);
		System.out.println(person);
	}

}