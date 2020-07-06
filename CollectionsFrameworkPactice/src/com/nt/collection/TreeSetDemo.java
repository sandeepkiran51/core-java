package com.nt.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Iterator<Integer> it=null;
		System.out.println(ts.size());
		ts.add(10);
		ts.add(6);
		ts.add(8);
		ts.add(7);
		ts.add(9);
		ts.add(5);
		System.out.println(ts);
		System.out.println(ts.last());
		System.out.println(ts.first());
		System.out.println(ts.pollFirst());
		
		System.out.println(ts.add(11));
		//it = ts.descendingIterator();
		it= ts.iterator();
		System.out.println(it.toString());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
	}

}
