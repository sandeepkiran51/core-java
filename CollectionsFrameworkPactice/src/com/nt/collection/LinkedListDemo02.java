package com.nt.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo02 {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		System.out.println(l.isEmpty());
		l.add("sandeep");
		l.add("Deepika");
		l.add("sandeep");
		l.add("Dhulappa");
		l.add("saraswathi");
		l.add(null);
		l.add(2, "Pradeep");
		l.set(3," ");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.peek());
		System.out.println(l.getLast());
		System.out.println(l.contains("Sandeep".toLowerCase()));
		
		Iterator<Object> it = l.descendingIterator();
		System.out.println("linkedlist:"+l);
		System.out.println(it);
		while(it.hasNext()) {
			System.out.println("::"+it.next());
		}
		System.out.println("===========================");
		ListIterator< Object> lit = l.listIterator();
		System.out.println(lit.getClass().getName());
		while(lit.hasNext()) {
			System.out.println(lit.next());
			System.out.println(lit.nextIndex());
		}
		
		System.out.println("================================");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		lit.set("Sandyy");
		System.out.println(l);
		lit.set("sandy");
		System.out.println(l);
	}

}
