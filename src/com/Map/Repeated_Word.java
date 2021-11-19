package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Word {

	public static void main(String[] args) {
		Map<String, Integer> s = new HashMap<String, Integer>();
		String a="By the people for the people and the people for the people";
		String[] sp = a.split(" ");
		for (String st : sp) {
			if(s.containsKey(st)) {
				Integer in = s.get(st);
				s.put(st, in+1);
		}
			else {
				s.put(st, 1);
			}
			System.out.println(st);
	}
		Set<Entry<String, Integer>> en = s.entrySet();
		for (Entry<String, Integer> ent : en) {
			if(ent.getValue()>=0) {
			System.out.println(ent);
		}
}
}
}