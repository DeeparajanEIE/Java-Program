package com.constructor;
public class Employee {
	int a;
	Integer b;
	static String address;
	public Employee(){          // No argument constructor(without any parameter)
		address="Chennai";
		System.out.println("Name: Deepak.M"); 
	}
	public Employee(int a) {   //Parameterized constructor(with parameter)
		System.out.println("Employee Id:" +a);
	}
	public Employee(String b) {
		System.out.println("City:" +b);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(123);    //each constructor call the separate object
		Employee e3=new Employee("Cuddalore");
		System.out.println(address);
		System.out.println(e1.a); // default value of data type int is 0
		System.out.println(e2.b); // default value of any class is null
	}

}
// Constructor name is same as the class name
// no return type or explicit return type
// It cannot be static,final,abstract and synchronized
// constructor support overloading and inheritance concept
