package com.nt.test;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

import com.nt.beans.Student;
import com.nt.controller.College;

public class FrontOffice {
	public static void main(String[] args) throws Exception {
		Scanner sc = null;
		Student st = null;
		boolean flag=true;
		char ch =' ';
		College college = null;
		
		college = new College();
		sc = new Scanner(System.in);
		
		
		ArrayList<Student> al = new ArrayList<Student>();	
		while(flag) {
			st= new Student();
		System.out.println("enter Student reg Id:");
		st.setSno(sc.nextInt());sc.nextLine();
		System.out.println("Enter Student name:");
		st.setSname(sc.nextLine());
		System.out.println("Enter Course:");
		st.setCourse(sc.nextLine());
		System.out.println("Enter Course Fee:");
		st.setFee(sc.nextDouble());sc.nextLine();
		System.out.println("Enter Student Mobile:");
		st.setMobile(sc.nextLong());sc.nextLine();
		System.out.println("Enter Email I'D");
		st.setEmail(sc.nextLine());
		al.add(st);
		System.out.println("Do you Want Enter One More Y/N:?");
		ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y')
			flag=true;
		else 
		flag =false;
		System.out.println("=======================================");
		}
		college.display(al);
		System.out.println("==========================");
		System.out.println("inserted no of rows: "+college.registerStudent(al));
		System.out.println("=============================================");
		ArrayList<Student> stlist = college.extractCoreJavaStudents(al);
		System.out.println(stlist.isEmpty());
		
		  for(Student s:stlist) { System.out.println(s.getSname()+
		  "----->"+s.getCourse()+" "); }
		 sc.close();
		
	}
	
	

}
