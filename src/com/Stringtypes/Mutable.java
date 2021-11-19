package com.Stringtypes;

public class Mutable {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("kutty");
		StringBuffer s2 = new StringBuffer("kutty");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		s1.append(s2);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

	}

}
