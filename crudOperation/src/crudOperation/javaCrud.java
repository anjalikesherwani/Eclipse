package crudOperation;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class javaCrud {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// Driver Register
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
//		System.out.println("connected" + conn);


//1. <--------------Create Databases----------------> 

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		Statement st = conn.createStatement();
//		st.executeUpdate("create database testdb");
//		System.out.println("created database");
		
		
//2. <---------------Create Table--------------------->
//		add datadase name in conn variable
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");		
//		String sql = "create table users(id int,name varchar(30), mail varchar(45) primary key,age int)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");
		

//3. <---------------insert data--------------------->
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
//		String sql = "insert into users values (101,'jyoti','jyoti@123',23),(102,'Anjali','anjali@123',22),(103,'vaishu','vaishu@123',22),"
//				+ "(104,'anaya','anaya@123',12)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("data inserted!!");
		
		
//4. < -----------------show data----------------------->
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
//		String sql = "select * from users";
//		Statement st = conn.createStatement(); 
//        ResultSet rs = st.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+" - "+ rs.getString("mail")+"-"+rs.getInt("age"));
//	}
			

//5.  <-------------------Update data------------------> 
			
//			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
//		     String updateQuery = "UPDATE users SET name = 'navi' WHERE name = 'jyoti'";
//		     Statement st = conn.createStatement();
//		     st.executeUpdate(updateQuery);
//		     System.out.println("Data updated");
		
		
//6. <-------------------Delete data from mail ---------------------->
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
	    String deleteQuery = "DELETE FROM users WHERE mail = 'jyoti@123'";
	    Statement st = conn.createStatement();
	    st.executeUpdate(deleteQuery);
	    System.out.println("Data deleted Successfully");
			
		
	}

}
