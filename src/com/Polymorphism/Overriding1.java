package com.Polymorphism;

public class Overriding1 extends Overriding { //By using inheritance to access the overriding 
	@ Override                               //program by using "extends" keyword
    public void student() {
    	System.out.println("Name: Suriya.S");
    	super.student(); // "super" is the keyword for override
    } // To access previous program method with same method name using "super" keyword
    @Override
	public void  blood_group() {
		System.out.println("Blood group: B+");	
		super.blood_group();
	}
	public static void main(String[] args) {
        Overriding1 s=new Overriding1();
        s.student();
        s.blood_group();
	}

}
