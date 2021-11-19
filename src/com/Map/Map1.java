package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> s = new HashMap<Integer, String>();
		s.put(1, "Kutty");
		s.put(2, "Deepak");
		s.put(1, "Hii");
		s.put(3, "Gud");
		s.put(null, "Mrng");
		s.put(4, null);
		s.put(null, "Nit");
		s.put(5, "Deepak");
        System.out.println(s);
        int si = s.size();
        System.out.println(si);
        String st = s.get(2);
        System.out.println(st);
        Set<Integer> ks = s.keySet();
        System.out.println(ks);
        Collection<String> v = s.values();
        System.out.println(v);
        boolean cs = s.containsKey(4);
        System.out.println(cs);
        boolean b = s.containsValue("Deepak");
        System.out.println(b);
        Set<Entry<Integer, String>> es = s.entrySet();
        System.out.println(es);
        for (Entry<Integer, String> a :es) {
        	System.out.println(a);
        }
	}

}
