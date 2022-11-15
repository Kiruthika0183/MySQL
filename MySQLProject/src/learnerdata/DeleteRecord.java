package learnerdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
		    Statement stmt=conn.createStatement();
		    
		    String sql="delete from learner where lid=1";
		    stmt.executeUpdate(sql);
		    
		    ResultSet rs=stmt.executeQuery("select * from learner");
		    while(rs.next()) {
		    	//Display values
		    	System.out.println(rs.getInt(1));
		    	System.out.println(rs.getString(2));
		    	System.out.println(rs.getString(3));
		    }
		    System.out.println("Deleted sucessfully...");
		    rs.close();

		}
		
       catch(Exception e) {
    	   e.printStackTrace();
			
		}
		}
	}
