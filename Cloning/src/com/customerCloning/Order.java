package com.customerCloning;

public class Order implements Cloneable{

	private int orderId;
	private String orderStatus;
	
	public Order(int orderId,String orderStatus) {
		this.orderId=orderId;
		this.orderStatus=orderStatus;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	@Override
	public String toString() {
		return "Oreder [orderId=" + orderId + ", orderStatus=" + orderStatus + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
