package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp3 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 // load and register the driver class
       Class.forName("com.mysql.cj.jdbc.Driver");

       // establish the connection
       String url="jdbc:mysql://localhost:3306/jdbclearning";
       String pass="nikhil23";
       String user="root";
       Connection connect=DriverManager.getConnection(url, user, pass);

       // create the statement
       Statement statement=connect.createStatement();

       // execute the query
       String str="SELECT * FROM studentinfo";
       ResultSet rs=statement.executeQuery(str);
       // process the result
       while(rs.next()) {
    	   System.out.println(rs.getInt("id")+"   "+rs.getString("sname")+"   "+rs.getInt("sage")+"   "+rs.getString("scity"));
       }
       // close the resources
       statement.close();
       connect.close();

	}
}
