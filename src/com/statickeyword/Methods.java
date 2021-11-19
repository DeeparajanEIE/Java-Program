package com.statickeyword;

public class Methods {
	
// static	method
	public static void fname() {
		System.out.println("Murugan");
	}
// Non static method	
		public void name() {
			fname();
			System.out.println("Deepak");
		}
// object creation
	public static void main(String[] args) {
		System.out.println("main");
		Methods method=new Methods();
		method.name();
		System.out.println("main end");
	}

}
// we can call static method from nonstatic method but nonstatic method is not call from static method