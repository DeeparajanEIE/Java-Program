package com.Polymorphism;

public class Overloading {   //class & method name are same
	public void display() {
		System.out.println("Name: Deepak.M");	
	}
	// @overloading
	public void display(int age) {  //By differentiating the method using parameter
		System.out.println("Age:"+age);
	}
	// @overloading
	public void display(String Name) {
		System.out.println("Father name:"+Name);
	}

	public static void main(String[] args) {
       Overloading s=new Overloading();
       s.display();
       s.display(10);
       s.display("Murugaiyan");
	}

}
