package com.nt.dao;

import java.util.ArrayList;

import com.nt.beans.Student;

public interface StudentDAO {
	public int registerStudent(ArrayList<Student> studList) throws Exception;

}
