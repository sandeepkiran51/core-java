package com.nt.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nt.beans.Student;

public class StudentDAOImpl implements StudentDAO {
	/*
	 * private int sno; private String sname; private String course; private double
	 * fee; private long mobile; private String email;
	 */
	public static int  JdbcConnection(ArrayList<Student> studList) throws ClassNotFoundException, SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		Student st = null;
		int count = 0;
		st= new Student();
		
		String INSERT_QUERY="INSERT INTO STUDENTNIT(SNO,SNAME,COURSE,FEE,MOBILE,EMAIL)  VALUES(?,?,?,?,?,?)";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		ps = con.prepareStatement(INSERT_QUERY);
		for (Student student : studList) {
			ps.setInt(1, student.getSno());
			ps.setString(2, student.getSname());
			ps.setString(3, student.getCourse());
			ps.setDouble(4, student.getFee());
			ps.setLong(5, student.getMobile());
			ps.setString(6,student.getEmail() );
			count = count +ps.executeUpdate();
			
		}
		
		return count;
	}

	
	public int registerStudent(ArrayList<Student> studList) throws ClassNotFoundException, SQLException {

		return JdbcConnection(studList);
	}

}
