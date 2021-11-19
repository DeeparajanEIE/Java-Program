package com.looping;

public class Nested_For {

	public static void main(String[] args) { // outer loop
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) { // Inner loop
				System.out.print(j); // print is used to print the o/p in column
			}
			System.out.println(); // println is used to print the o/p in row

		}
		System.out.println("---------------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("---------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("---------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
