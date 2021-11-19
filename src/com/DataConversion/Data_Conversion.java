package com.DataConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Data_Conversion {
	public static void int_String() {
		System.out.println("****** int to String ******");
		// TYpe 1
		int a = 10;
		System.out.println("int value of a :" + a);
		String value = String.valueOf(a);
		System.out.println("String value of a :" + value);
		// Type 2
		int b = -20;
		System.out.println("int value of a :" + b);
		String string = Integer.toString(b);
		System.out.println("String value of a :" + string);
	}

	public static void int_Double() {
		System.out.println("****** int to Double ******");
		// Type 1
		int a = 30;
		System.out.println("int value of a :" + a);
		Double value = Double.valueOf(a);
		System.out.println("Double value of a :" + value);
		// Type 2
		int b = -20;
		System.out.println("int value of a :" + b);
		Double value1 = new Double(b);
		System.out.println("Double value of a :" + value1);
	}

	public static void string_int() {
		System.out.println("****** String to int ******");
		// Type 1
		String a = "50";
		System.out.println("String value of a :" + a);
		int value = Integer.parseInt(a);
		System.out.println("int value of a :" + value);
	}

	public static void string_Integer() {
		System.out.println("****** String to Integer ******");
		// Type 1
		String a = "60";
		System.out.println("String value of a :" + a);
		Integer value = Integer.valueOf(a);
		System.out.println("Integer value of a :" + value);
	}

	public static void array_List() {
		Integer a[] = { 1, 2, 3, 4 };
		List<Integer> list = Arrays.asList(a);
		System.out.println(list);
	}

	public static void list_Array() {
		List<String> list = new ArrayList<String>();
		list.add("My");
		list.add("Name");
		list.add("Is");
		list.add("Deepak");
		System.out.println(list);
		String[] list1 = new String[list.size()];
		String[] array = list.toArray(list1);
		for (String string : array) {
			System.out.println(string);
		}

	}
	public static void list_Set() {
		List<String> list = new ArrayList<String>();
		list.add("Good");
		list.add("Morning");
		list.add("Good");
		list.add("Evening");
		System.out.println(list);
		Set s=new LinkedHashSet(list);
		System.out.println(s);
		
	}
	public static void set_List() {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Good");
		set.add("Morning");
		set.add("Good");
		set.add("Evening");
		System.out.println(set);
		List s=new ArrayList(set);
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		int_String();
		int_Double();
		string_int();
		string_Integer();
		array_List();
		list_Array();
		list_Set();
		set_List();
	}

}
