package com.Interview_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = s.nextInt();
		int fact = n;
		while (n > 1) {
			n--;
			fact = fact * n;
		}
		System.out.println(fact);
	}

}
// n=5 1*2*3*4*5=120