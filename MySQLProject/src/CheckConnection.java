import java.sql.Connection;
import java.sql.DriverManager;
public class CheckConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			System.out.println("Database is connected");
			conn.close();
			
		}catch(Exception e){
			System.out.println("Do not connrct to DB-Error: "+e);
			
		}

	}

}

