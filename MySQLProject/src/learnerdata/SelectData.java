package learnerdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs=null;
			rs=stmt.executeQuery("select * from learner");
			System.out.println("No of Records :");
		while(rs.next()) {
			//Display values
			System.out.println("Lid : "+rs.getInt("lid"));
			
			System.out.println("LName : "+rs.getString("lname"));
			System.out.println("Lcity : "+rs.getString("lcity"));
		}
		rs.last();
		System.out.println("Table Contains " +rs.getRow()+ "rows");
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
		

	}


