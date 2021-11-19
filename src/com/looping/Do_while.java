package com.looping;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = sc.nextInt();
		do {
			System.out.println("True");
			a--;
		} while (a > 10);
	}

}
