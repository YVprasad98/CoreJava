package com.customerCloning;

public class TestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Order order = new Order(95535, "Delivered With in one day");
		Address address = new Address("Kollivalasa", "AP", 532445);
		Customer oc = new Customer(10, "Prasad", address, order);
		System.out.println(oc);
		Customer dc = (Customer) oc.clone();
		System.out.println(dc);
		oc.setId(11);
		oc.setName("Varaprasad");
		oc.getAddress().setCity("Hyderabad");
		oc.getAddress().setState("TS");
		oc.getAddress().setPincode(40008);
		oc.getOrderStatus().setOrderStatus("Delivered");
		System.out.println(oc);
		System.out.println(dc);
	}
}
