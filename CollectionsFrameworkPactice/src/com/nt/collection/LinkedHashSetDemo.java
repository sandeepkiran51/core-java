package com.nt.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		s.add("S");
		s.add("A");
		s.add("N");
		s.add("D");
		s.add("E");
		s.add("E");
		s.add("P");
		
		System.out.println(s);
	}

}
