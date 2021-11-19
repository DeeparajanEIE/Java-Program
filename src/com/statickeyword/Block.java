package com.statickeyword;

public class Block {
// Static block is executed without main method	or object creation
	static {
		System.out.println("Static Block");
	}
// Multiple static block are used in a singe class but it is executed in insertion order	
	static {
		System.out.println("Static Block1");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		
	}

}
// First Block will be executed bcz block have no object creation next main method will be executed