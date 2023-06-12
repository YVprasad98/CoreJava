package com.shapes;

public abstract class Shape {
	double radius;
	
	public Shape(double radius) {
		this.radius=radius;
	}
	
	
	
	public double getRadius() {
		
		return radius;
	}
	
	public void setRadius(double rad) {
		if(rad==0.0) {
			System.out.println("Please enter valid radius");
		}
			radius = rad;
	}
	

	public abstract double area();
	public abstract double volume();

	
	
	}

