package com.condition;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		//OR gate if any one condition is true o/p will be executed
		if ((num % 2 == 0) || (num % 3 == 0)) {
			System.out.println("The given number is divisible by 2 and 3");
		} else
			System.out.println("The given number is not divisible by 2 and 3");
		//AND gate if both the condition is true o/p will be executed
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("The given number is divisible by 2 and 3");
		} else
			System.out.println("The given number is not divisible by 2 and 3");
	}

}
