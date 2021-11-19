package com.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Student Name: M.Deepak");
			break;
		case 2:
			System.out.println("Student id: 12345 ");
			break;
		case 3:
			System.out.println("Student class: XII");
			break;
		case 4:
			System.out.println("Student Record: Half-Yearly");
			break;
		case 5:
			System.out.println("Subject Name: Tamil 100 ");
			break;
		case 6:
			System.out.println("Subject Name: English 100 ");
			break;
		case 7:
			System.out.println("Subject Name: Maths 100 ");
			break;
		case 8:
			System.out.println("Subject Name: Physics 100 ");
			break;
		case 9:
			System.out.println("Subject Name: Chemistry 100 ");
			break;
		case 10:
			System.out.println("Subject Name: Biology 100 ");
			break;
		}
	}

}
