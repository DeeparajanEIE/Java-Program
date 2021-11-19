package com.abstraction;

public class Abstract2 extends Abstract1 {
	public void student() {
		System.out.println("Name is Kutty");
		super.student();
	}
	public void work() {
		System.out.println("Engineer");
	}
	public static void main(String[] args) {
     Abstract2 a=new Abstract2();
        a.student();
        a.work();
	}

		
	}



