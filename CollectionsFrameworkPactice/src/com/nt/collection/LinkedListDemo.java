package com.nt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	LinkedListDemo() {
		System.out.println("LinkedListDemo.LinkedListDemo()");
	}

	public static void main(String[] args) {
		ArrayListDemo al = new ArrayListDemo();
		List<String> l = new LinkedList<String>();
		System.out.println("List capacity: "+new ArrayList<String>().size());
		l.add("B");
		l.add("A");
		l.add("E");
		l.add("C");
		l.add("D");
		l.add("Y");
		l.add("X");
		l.add("Z");
		System.out.println(l);
		l.add(1,"A1");
		l.add("Z");
		System.out.println(l);
	
		System.out.println(al.toString());
		System.out.println(l.contains(al));
	}

}
