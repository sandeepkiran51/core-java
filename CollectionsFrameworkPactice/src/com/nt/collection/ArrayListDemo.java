package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	private static List<String> l;
	ArrayListDemo() {
		l=new ArrayList<String>();
		System.out.println("ArrayListDemo.ArrayListDemo()");
	}

	public static void main(String[] args) {
		// create ArrayList
		ArrayListDemo al = new ArrayListDemo();
		System.out.println("initial arraylist size: " + ((ArrayList<String>) l).size());
		//new ArrayList<String>().ensureCapacity(1);
		l.add("c");
		l.add("a");
		l.add("e");
		l.add("f");
		l.add("f");
		System.out.println("final arraylist size: " + ((ArrayList<String>) l).size());
		System.out.println("Arraylist contents: " + l);
		l.add(1, "A");
		System.out.println("final arraylist size: " + ((ArrayList<String>) l).size());
		System.out.println("Arraylist contents: " + l);
		l.remove(1);
		System.out.println("final arraylist size: " + ((ArrayList<String>) l).size());
		System.out.println("Arraylist contents: " + l);
		System.out.println(l.remove("F"));
		System.out.println("final arraylist size: " + ((ArrayList<String>) l).size());
		System.out.println("Arraylist contents: " + l);
	}

	@Override
	public String toString() {
		return "ArrayListDemo []"+l.toArray();
	}
	
	

}
