package com.nt.collection;

import java.util.Vector;

public class VectorDemo02 {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<Object>();
		v1.add(5);
		v1.add(8);
		v1.add(10);
		Example e = new Example(50,60);
		//v1.add(new Example(50, 60));
		v1.add(e);
		v1.addElement(55);
		System.out.println(v1);
		System.out.println("v1.contains(1):"+v1.contains(1));
		System.out.println(v1.contains(new Integer(5)));
		//System.out.println("v1.contains(new Example(50,60)"+v1.contains(e));
		System.out.println(v1.capacity());
		for(int i=0;i<10;i++) {
			v1.add(i);
			System.out.println(v1.get(i));
		}
		System.out.println(v1.capacity());
		
	}

}
