package com.nt.controller;

import java.util.ArrayList;

import com.nt.beans.Student;
import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOImpl;

public class College {
	StudentDAO dao;

	public int registerStudent(ArrayList<Student> studList) throws Exception {
		dao = new StudentDAOImpl();
		return dao.registerStudent(studList);
	}

	public void display(ArrayList<Student> studentList) {
		for (Student s : studentList) {
			System.out.println(s.getSno() + "," + s.getSname().toUpperCase() + "," + "," + s.getFee() + ","
					+ s.getMobile() + "," + s.getEmail());
		}
	}

	public ArrayList<Student> extractCoreJavaStudents(ArrayList<Student> studList) {
		ArrayList<Student> al = new ArrayList<Student>();
		for (Student s : studList) {
			if (s.getCourse().equals("core java")) {
				al.add(s);
				// al.remove(s);
				// al.contains(s);

			}
		}
		return al;
	}

	public void modifyNameUpperCase(ArrayList<Student> studentList) {
		for (Student s : studentList) {
			s.setSname(s.getSname().toUpperCase());
		}
	}

}
