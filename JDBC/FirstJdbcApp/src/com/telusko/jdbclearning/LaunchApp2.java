package com.telusko.jdbclearning;

import java.sql.*;

public class LaunchApp2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        String str="DELETE FROM studentinfo where id=3";
        int affectedRows=statement.executeUpdate(str);
        // process the result
        if(affectedRows==0) {
        	System.out.println("not able to execute the query");
        }
        else {
        	System.out.println("query executed successfully");
        }
        // close the resources
        statement.close();
        connect.close();


	}

}
