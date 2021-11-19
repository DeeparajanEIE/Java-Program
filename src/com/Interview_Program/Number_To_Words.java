package com.Interview_Program;

import java.util.Scanner;

public class Number_To_Words {
	public static String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	public static String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(int n) {
		if (n < 0) {
			return "Minus" + convert(-n);
		}
		if (n < 20) {
			return units[n];
		}
		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : " ") + units[n % 10];
		}

		return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : " ") + convert(n % 100);

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		Integer n = s.nextInt();
		System.out.println(convert(n));
	}
} 