package com.scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nextline = sc.nextLine();
		System.out.println(nextline);
		
		String next = sc.next();
		System.out.println(next);
		
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		float nextfloat = sc.nextFloat();
		System.out.println(nextfloat);
		
		char charAt = sc.next().charAt(0);
		System.out.println(charAt);
		
		long nextLong = sc.nextLong();
		System.out.println(nextLong);
		
		double nextdouble = sc.nextDouble();
		System.out.println(nextdouble);	

	}

}
