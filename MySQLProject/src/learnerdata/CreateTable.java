package learnerdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt=conn.createStatement();
			
			String sql="CREATE TABLE Learner "+"(lid INTEGER not NULL," +"lname VARCHAR(255),"+"lcity VARCHAR(255))";
			stmt.executeUpdate(sql);
			
			System.out.println("Created table in given database...");
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}

	

	}

}
