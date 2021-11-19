package com.Interviewbased;

public class Constructor2 extends Constructor1{
	private Constructor2() {
		System.out.println("Non Parameterized constructor2");
	}
	public void method1() {
		
		System.out.println("Method2");
		super.method1();
	}

	public static void main(String[] args) {
		Constructor2 a=new Constructor2();
		a.method1();

	}

}
