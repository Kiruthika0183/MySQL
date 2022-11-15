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
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs=null;
			rs=stmt.executeQuery("select * from EMP2");
			System.out.println("No of Records :");
		while(rs.next()) {
			//Display values
			System.out.println("EID : "+rs.getInt("eid"));
			System.out.println("Age : "+rs.getInt("age"));
			System.out.println("FirstName : "+rs.getString("firstname"));
			System.out.println("LastName : "+rs.getString("lastname"));
		}
		rs.last();
		System.out.println("Table Contains " +rs.getRow()+ "rows");
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}}
