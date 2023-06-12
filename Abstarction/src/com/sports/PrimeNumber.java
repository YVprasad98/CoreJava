package com.sports;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 103;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
//				System.out.println();
				count++;
			}
			if (count == 2) {
				System.out.println("Given number is prime number");
				
			}
			
		}
	}

}
