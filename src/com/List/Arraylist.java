package com.List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Object> s = new ArrayList<Object>();
		List<Object> s1 = new ArrayList<Object>();
		s.add(10);
		s.add(10.33);
		s.add('a');
		s.add("Deepak");
		s.add(null);
		s.add(10.33);
		s1.add(20);
		s1.add(11.33);
		s1.add('a');
		System.out.println(s);
		System.out.println(s1);
		int size = s.size();
		System.out.println(size);
		Object object = s.get(1);
		System.out.println(object);
		s.set(4, 10);
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		int indexOf = s.indexOf(10);
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf(10.33);
		System.out.println(lastIndexOf);
		boolean contains = s.contains("Deepak");
		System.out.println(contains);
		s.addAll(s1);
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		s.clear();
		System.out.println(s);
	}

}
