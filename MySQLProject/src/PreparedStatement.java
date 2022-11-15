import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbcop","root","root");
			
			/*String str="insert  into emp2(eid,age,firstname,lastname) values(?,?,?,?)";
			java.sql.PreparedStatement ps=conn.prepareStatement(str);
			ps.setInt(1,3);
			ps.setInt(2,24);
			ps.setString(3,"Deebi");
			ps.setString(4,"Raj");
			ps.execute();
			System.out.println("inserted sucessfully..");*/
			
			/*String str="delete from emp2 where eid=?";
			java.sql.PreparedStatement ps=conn.prepareStatement(str);
			  ps.setInt(1,4);
			  ps.execute();
			 System.out.println("deleted sucessfully..");
			 */
			
			
			/*java.sql.PreparedStatement ps=conn.prepareStatement("update emp2 set age=? where eid=?");
			ps.setInt(1,32);
			ps.setInt(2,5);
			int i=ps.executeUpdate();
			System.out.println("records updated..." );*/
			
			java.sql.PreparedStatement ps=conn.prepareStatement("select * from emp2 where eid=?");
			
			ps.setInt(1,2);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			System.out.println(" done search...");
			
			
			conn.close();
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
