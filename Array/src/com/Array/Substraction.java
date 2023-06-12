package com.Array;

public class Substraction {
	public double sub() {
		double[] d = new double[3];
		d[0] = 20;
		d[1] = 30;
		d[2] = 100;
		double r  = d[2] - d[1] - d[0];
		System.out.println(r);
		return r;
	}

	public static void main(String[] args) {
		Substraction s = new Substraction();
		s.sub();

	}

}
