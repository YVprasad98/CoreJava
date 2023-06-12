package com.customerCloning;

public class Customer implements Cloneable{
	
	private int id;
	private String name;
	private Address address;
	private Order orderStatus;
	
	public Customer(int id,String name,Address address,Order orderStatus) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.orderStatus=orderStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Order orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", orderstatus=" + orderStatus + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer cloned = (Customer) super.clone();
		cloned.setAddress((Address) cloned.getAddress().clone());
		cloned.setOrderStatus((Order)cloned.getOrderStatus().clone());
		return super.clone();
	}
//	public static void main(String [] args) throws CloneNotSupportedException {
//		Customer co = new Customer(01,"Rahul");
//		System.out.println(co);
//		Customer cd = (Customer) co.clone();
//		System.out.println(cd);
//		co.name="KL Rahul";
//		System.out.println(co);
//		System.out.println(cd);
//	}

}
