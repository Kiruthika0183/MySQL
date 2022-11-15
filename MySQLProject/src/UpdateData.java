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
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			Statement stmt=conn.createStatement();
			String sql="Update emp2 set age=21 where eid in(1)";
			stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery("select * from EMP2");
		while(rs.next()) {
			//Display values
			System.out.println("EID : "+rs.getInt("eid"));
			System.out.println("Age : "+rs.getInt("age"));
			System.out.println("FirstName : "+rs.getString("firstname"));
			System.out.println("LastName : "+rs.getString("lastname"));
		}
		//rs.last();
		System.out.println("Updated Successfully...");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	

			

	}

}
