import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class sqljava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Driver Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
		System.out.println("connected" + conn);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("show databases");
		
		System.out.println("databases are : " + rs);
		while(rs.next()) {
			System.out.println(rs.getString(1));
			
		}
		

	}

}
