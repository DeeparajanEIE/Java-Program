package com.Polymorphism;

public class Overriding {
	public void student() {
		System.out.println("Name: Deepak.M");
	}
	public void  blood_group() {
		System.out.println("Blood group: A+");	
	}

	public static void main(String[] args) {
		Overriding a=new Overriding();
		a.student();
		a.blood_group();

	}

}
