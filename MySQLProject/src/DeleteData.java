import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			Statement stmt=conn.createStatement();
			String sql="DELETE FROM EMP2 WHERE eid=3";
			stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery("Select * from emp2");
			while(rs.next()) {
				//Display values
				System.out.println("EID : "+rs.getInt("eid"));
				System.out.println("Age : "+rs.getInt("age"));
				System.out.println(" FirstName : "+rs.getString("firstname"));
				System.out.println("LastName : "+rs.getString("lastname"));
				
			}
			System.out.println("Records deleted sucessfully...");
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
				
		}

	}

}
