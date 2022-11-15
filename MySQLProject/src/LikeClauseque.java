import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LikeClauseque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			Statement stmt=conn.createStatement();
			
			System.out.println("Fetching records with condition...");
			String sql="select eid,firstname,lastname,age from emp2 where lastname like 'Raj'";
			stmt.executeQuery(sql);
			
			ResultSet rs=stmt.executeQuery("select eid,firstname,lastname,age from emp2");
			while(rs.next()) {
				//Display values
				System.out.println("EId:" +rs.getInt("eid"));
				System.out.println("Age:" +rs.getInt("age"));
				System.out.println("FirstName:" +rs.getString("firstname"));
				System.out.println("LastName:" +rs.getString("lastname"));
			}
			System.out.println("Like Clause run sucessfully... ");
			rs.close();		
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
