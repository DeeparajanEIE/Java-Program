package com.Impotant_Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s = "My name is Deepak";
		String s1 = "";
		int l = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i));
			s1 = s1 + s.charAt(i);

		}
		System.out.println(s1);
		if (s1.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
