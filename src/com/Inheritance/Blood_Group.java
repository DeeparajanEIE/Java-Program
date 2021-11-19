package com.Inheritance;

public class Blood_Group extends Student { // "extends" is the keyword for inheritance
	public void Jeeva() {
		System.out.println("Blood group is b+");
	}
	public void Nishanth() {
		System.out.println("Blood group is A+");
	}

	public static void main(String[] args) {
		Blood_Group S=new Blood_Group();
		S.Deepak();
		S.Balaji();
        S.Jeeva();
        S.Nishanth();
	}

}
