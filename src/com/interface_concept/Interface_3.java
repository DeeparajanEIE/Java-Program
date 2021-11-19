package com.interface_concept;

public class Interface_3 implements Interface_1,Interface_2  {

	public static void main(String[] args) {
		Interface_2.shift();
		Interface_3 i=new Interface_3();
		i.dressCode();
		i.timming();
		i.friends();
		i.family();
		System.out.println("SALARY:"+SALARY);
		System.out.println("lEAVES:"+LEAVES);
	}

	public void dressCode() {
	System.out.println("Dress code:Formal");	
	}

	public void timming() {
	System.out.println("Shift:Day");	
	}

	public void family() {
	System.out.println("Family:Middle class");	
	}

	public void friends() {
	System.out.println("Friends:2");	
	}

}
