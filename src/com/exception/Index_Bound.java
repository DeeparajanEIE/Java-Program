package com.exception;

import java.util.ArrayList;
import java.util.List;

public class Index_Bound {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		Integer in = l.get(5);
		System.out.println(in);
	}

}
