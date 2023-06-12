package com.block;

public class Block {
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	static {
		System.out.println("static block-1");
	}
	static {
		System.out.println("static block-2");
	}
	static {
		System.out.println("static block-3");
	}
	static {
		Block b = new Block();
		Block c = new Block();
		Block d = new Block();
		Block e = new Block();
	}
	public static void main(String[] args) {
		System.out.println("main method");
		int a = 10;
		int b = 20;
		boolean c = false;
		System.out.println(a == b || c || a != b);
	}
}
