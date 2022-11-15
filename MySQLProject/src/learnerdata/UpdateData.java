package learnerdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt=conn.createStatement();
			String sql="Update learner set lcity='madhurai' where lid in(1)";
			stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery("select * from learner");
		while(rs.next()) {
			//Display values
            System.out.println("Lid : "+rs.getInt("lid"));
		    System.out.println("LName : "+rs.getString("lname"));
			System.out.println("Lcity : "+rs.getString("lcity"));
		}
		//rs.last();
		System.out.println("Updated Successfully...");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	

			

	}

}
