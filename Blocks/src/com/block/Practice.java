package com.block;

public class Practice {
	// with out return and with out para
	public void sum() {

	}

	// with out return and with para
	public void sum1(int i, int b) {
		System.out.println(i + b);
	}

	// with return and with para
	public int sum2(int i, int j) {
		return i + j;
	}

//with return and with out para
	public int sum3() {
		int sum = 0;
		return sum;
	}

	public int asdfg(int num, int add) {

		if (num < 50) {
			return num + add;
		} else {
			return num;
		}

	}
	public void asdfg1(int num, int add) {
		
		if (num < 50) {
			System.out.println( num + add);
		} else {
			System.out.println( num );
		}
		
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		p.sum1(12, 34);
		p.asdfg1(100, 10);
		System.out.println(p.asdfg(100, 10));
	}

}
