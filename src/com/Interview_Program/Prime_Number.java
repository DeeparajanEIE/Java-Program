package com.Interview_Program;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = s.nextInt();
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				System.out.println("The given number is not prime");
				break;
			}
		}
		if (prime == true) {
			System.out.println("The given number is Prime");
		}
	}
}

// Eg : 5 the given number is divided by 1 and given number it is prime otherwise not a prime
// 5/1 =5, 5/2=2.5,5/3=1.6,5/4=1.2