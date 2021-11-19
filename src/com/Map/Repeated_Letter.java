package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Letter {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		String s = "By the people for the people and the people";
		String[] sp = s.split("");
		for (String st : sp) {
			if(m.containsKey(st)) {
			Integer in = m.get(st);
			m.put(st, in+1);				
			}
			else {
				m.put(st, 1);
			}
			System.out.println(st);
		}
		Set<Entry<String, Integer>> entry = m.entrySet();
		for (Entry<String, Integer> ent : entry) {
			if(ent.getValue()>=0) {
				System.out.println(ent);
			}
			
		}
	}

}
