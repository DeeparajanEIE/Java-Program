package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {

	public static void main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		Set<Object> s1 = new LinkedHashSet<Object>();
		Set<Object> s2 = new TreeSet<Object>();
		s.add(10);
		s.add(10.33);
		s.add('a');
		s.add("Deepak");
		s.add(null);
		s.add(10.33);
		s1.add(20);
		s1.add(11.33);
		s1.add('a');
		s1.add(null);
		s2.add(50);
		s2.add(10);
		s2.add(30);
		s2.add(3);
		s2.add(5);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		int size = s.size();
		System.out.println(size);
		// Object object = s.get(1);
		// System.out.println(object);
		// s.set(1, 30);
		// System.out.println(s);
		s.remove(10);
		System.out.println(s);
		// int indexOf = s.indexOf(10);
		// System.out.println(indexOf);
		// int lastIndexOf = s.lastIndexOf(10.33);
		// System.out.println(lastIndexOf);
		boolean contains = s.contains("Deepak");
		System.out.println(contains);
		s.addAll(s1);
		System.out.println(s);
		s.retainAll(s1);
		System.out.println(s);
		// s.addAll(s2);
		// System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		s.clear();
		System.out.println(s);

	}

}
