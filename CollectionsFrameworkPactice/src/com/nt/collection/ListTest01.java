package com.nt.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ListTest01 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof List);
		System.out.println(al instanceof RandomAccess);
		System.out.println(al instanceof Collection);
		//System.out.println(al instanceof LinkedList);
		
		
	}

}
