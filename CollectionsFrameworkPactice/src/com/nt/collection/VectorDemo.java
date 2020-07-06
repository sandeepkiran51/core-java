package com.nt.collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<Object>();
		for(int i=1;i<=10;i++) {
			v1.add(i*10);
		}
		System.out.println(v1);
		v1.remove(2);
		System.out.println(v1);
		v1.remove(2);
		System.out.println(v1);
	}

}
