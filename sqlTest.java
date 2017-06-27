package sqlwork;
import java.io.*;
import java.sql.*;

public class sqlTest {

	public static void main(String[] args) {
		try{Class.forName("com.mysql.jdbc.Driver");}
		catch(Exception e){System.out.println("Failed to load Driver " + e.getMessage());}
		
		Connection con = null;
		
		try{
			String url = "";
			String username = "roakes";
			String password = "admin";
			
			con = DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e){
			System.out.println("Failed to get connection " + e.getMessage());
			return;
		}
		
		try{
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM QA";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			stmt.close();
		}
		catch(SQLException e){System.out.println("SQLException: " + e.getMessage());}
		try {con.close();}
	    catch(SQLException e) {System.out.println("Failed to close connection " + e.getMessage()) ;}
	}

}
