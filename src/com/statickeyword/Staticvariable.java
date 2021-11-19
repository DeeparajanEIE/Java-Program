package com.statickeyword;

public class Staticvariable {
// Static variable	
	static int account_number;
	static int number;
// class variable	
	String name;
	public void a() {
		name="Kutty";
// this account_number is used only in this method only		
		int account_number=12;
		System.out.println(name);
		System.out.println(account_number);
	}
	public static void main(String[] args) {
		Staticvariable object1=new Staticvariable();
		account_number=1234;
		object1.name="Deepak";
		Staticvariable object2=new Staticvariable();
		account_number=123;
		object2.name="Murugan";
// we call the method using object		
		Staticvariable object3=new Staticvariable();
		object3.a();
		System.out.println(account_number);
		System.out.println(object1.name);
		System.out.println(account_number);
		System.out.println(object2.name);
		System.out.println(number);
	}

}
// In a static variable can accept recent values or overrided values
// But normal variable can accept multiple values for creating multiple object
// if any value is not given to the static variable it will assign null 