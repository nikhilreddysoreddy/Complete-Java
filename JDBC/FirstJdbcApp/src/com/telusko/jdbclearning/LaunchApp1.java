package com.telusko.jdbclearning;
import java.sql.*;
public class LaunchApp1 {

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
        String str="INSERT INTO studentinfo(id,sname,sage,scity) values(3,'Venky',23,'Badvel')";
        int affectedRows=statement.executeUpdate(str);
        // process the result
        if(affectedRows==0){
            System.out.println("unable to insert data");
        }
        else{
            System.out.println("data inserted successfully");
        }
        // close the resources
        statement.close();
        connect.close();

	}

}
