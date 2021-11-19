package com.Stringtypes;

public class Immutable {

	public static void main(String[] args) {
		String s1 = "kutty";
		String s2 = "kutty";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

	}

}
