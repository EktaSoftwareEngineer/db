package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
String dburl ="jdbc:mysql://127.0.0.1:3306/dbjavatraining";
String username ="root";
String password = "aaaa";
String query = "Select * from login1";
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection(dburl,username,password);
Statement stmt = con.createStatement();
ResultSet rs =stmt.executeQuery(query);
rs.next();
{
String name =rs.getString("name");
String rollno = rs.getString("rollno");
String sal = rs.getString("sal");

System.out.println(name);
System.out.println(rollno);
System.out.println(sal);

con.close();
}
	}

}