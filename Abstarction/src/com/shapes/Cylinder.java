package com.shapes;

public class Cylinder extends Shape {
	double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
  
	@Override
	public double area() {
		return  2 * Math.PI * super.getRadius() * this.height + 2 * Math.PI * Math.pow(super.getRadius(), 2);
	}

	@Override
	public double volume() {
		return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
	}

	// reader
	public double getHeight() {
		return height;
	}

	// writer
	public void setHeight(double height) {
		this.height = height;
	}	
}
