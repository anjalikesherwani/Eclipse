package javaS;

import java.sql.DriverManager;
import java.sql.*;

public class sqljava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Driver Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Anjali","root","");
		System.out.println("connected" + conn);
//		String sql = "create table adit(id int,name varchar(30), mail varchar(45) primary key)";
//		String sql = "insert into adit values (2,'jyoti','jyo@123')";
		String sql = "select * from adit";
		Statement st = conn.createStatement();
//		5. 
        ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+" - "+ rs.getString("mail"));
			
		}
//		4.
//		st.executeUpdate(sql);
//		System.out.println("data inserted");
		
		
		

//		3.
//		st.executeUpdate(sql);
//		System.out.println("table created");
//		2.
//		st.executeUpdate("create database Anjali");
//		System.out.println("created database");
//		1.
//		ResultSet rs = st.executeQuery("show databases");
//		
//		System.out.println("databases are : " + rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//			
//		}
		

	}

}
