package learnerdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt=conn.createStatement();
			System.out.println("Inserting records into the table...");
			String sql="INSERT INTO learner VALUES(1,'mathi','chennai')";
			stmt.executeUpdate(sql);
		    sql="INSERT INTO learner VALUES(2,'Sowmi','banglore')";
			stmt.executeUpdate(sql);
			sql="INSERT INTO learner VALUES(3,'janu','mettupalayam')";
			stmt.executeUpdate(sql);
			
			System.out.println("Inserted records into the table...");
			}
			catch(Exception e){
				e.printStackTrace();
			}
				
			}


	}


