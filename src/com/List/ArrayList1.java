package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add("Kutty");
		list1.add(100l);
		list1.add(10.12f);
		list1.add(null);
		list1.add("Kutty");
// Print the output within the array		
		System.out.println(list1);
// print the output in one by one by using foreach
		System.out.println("--------------------------------------");
		for (Object list2 : list1) {
			System.out.println(list2);
		}
		System.out.println("--------------------------------------");
// print the output in one by one by using List Iterator
		ListIterator<Object> iterator1 = list1.listIterator();
// when next input is present the output will be printed		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("--------------------------------------");
		Iterator<Object> iterator2 = list1.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("-------------------------------------");
		list1.set(1, "Deepak");
// print the output in last index to first index		
		while (iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}
		List<Object> list3 = new ArrayList<Object>();
// add previous list data into new list		
		list3.addAll(list1);
		System.out.println(list3);
		list3.remove(2);
		System.out.println(list3);
		
	}

}
