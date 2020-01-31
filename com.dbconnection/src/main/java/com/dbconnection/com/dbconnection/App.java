package com.dbconnection.com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
		public static void main(String[] args) throws ClassNotFoundException, SQLException {

	String dburl ="jdbc:mysql://127.0.0.1:3306/store";
	String username ="root";
	String password = "root";
	String query = "Select * from customers";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection(dburl,username,password);
	Statement stmt = con.createStatement();
	ResultSet rs =stmt.executeQuery(query);
	rs.next();
	{
	String name =rs.getString("first_name");
	String rollno = rs.getString("last_name");
	//String sal = rs.getString("sal");

	System.out.println(name);
	System.out.println(rollno);
	//System.out.println(sal);

	con.close();
	}
		}

	}

