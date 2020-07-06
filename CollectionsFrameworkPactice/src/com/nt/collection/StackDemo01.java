package com.nt.collection;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

import javax.lang.model.element.Element;

public class StackDemo01 {
	public static void main(String[] args) {
		Stack<Object> s1 = new Stack<Object>();
		s1.push("Sandeepkiran");
		Class c = s1.getClass();
		System.out.println(c);
		System.out.println(c.getClass().getName());
		Class[] c2 = c.getClasses();
		for(Class c3:c2) {
			System.out.println(c3);
		}
		Field[] f= c.getFields();
		for(Field f1:f ) {
			System.out.println(f1);
		}
		System.out.println(f.getClass().getName());
		System.out.println(f.length);
		TypeVariable<GenericDeclaration>[] type= c.getTypeParameters();
		for(TypeVariable<GenericDeclaration> t:type) {
			System.out.println(t.getName());
		}
		s1.push("Sandeep");
		s1.push("Sandeep");
		System.out.println(s1.size()+" : "+s1);
		s1.pop();
		System.out.println(s1.size()+" : "+s1);
		System.out.println(s1.peek());
		s1.add("Deepika");
		System.out.println(s1.peek());
		System.out.println(s1.search("deepika"));
		Enumeration<Object> e=s1.elements();
		System.out.println("======================");
		System.out.println("Enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("=================================");
		System.out.println("Iterator");
		Iterator< Object> i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		i1.remove();
		System.out.println("==============================");
		System.out.println(i1.hasNext());
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
