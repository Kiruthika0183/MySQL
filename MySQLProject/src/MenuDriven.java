import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int lid,age,Ch,k;
	String lname,lcity;
	Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=null;
			conn=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
			Statement stmt=conn.createStatement();
			do {
				System.out.println("1.Insert \n 2.Update \n 3.Delete \n 4.Search \n 5.Display \n 6.Count \n7.Minimum age \n 8.Mximum age \n 9.Average age \n 10.Exit");
				System.out.println("\nSelect your option");
				Ch=Integer.parseInt(sc.nextLine());
				
				
		
		switch(Ch) {
		case 1:
	        
			System.out.println(" How many records do you want to insert? ");
	        Integer n=Integer.parseInt(sc.nextLine());
	        for(int i=0;i<n;i++) {
	        	System.out.println("\n Enter the Lid");
	        	lid=Integer.parseInt(sc.nextLine());
	        	System.out.println("\n Enter the Lname");
	        	lname=(sc.nextLine());
	        	System.out.println("\n Enter the Lcity");
	        	lcity=(sc.nextLine());
	        	
	        	k=stmt.executeUpdate("Insert into Learner value(" +lid+ ",'" +lname+ "','" +lcity+ "')");
	        	
	        }
			break;
		case 2:
			
			System.out.println("\n Enter the Lid");
        	lid=Integer.parseInt(sc.nextLine());
        	System.out.println("\n Enter the Lcity");
        	lcity=(sc.nextLine());
        	
        	k=stmt.executeUpdate("Update learner set lcity='"+lcity+"' where lid=13");
        	
        	System.out.println("Record is updated....");
        	System.out.println("--------------");
        	
			break;	
		case 3:
			
			System.out.println("\n Enter the Lid");
        	lid=Integer.parseInt(sc.nextLine());
        	
        	k=stmt.executeUpdate("delete from learner where lid='"+lid+"' ");
        	
        	System.out.println("Record is deleted....");
        	System.out.println("--------------");
		 
			break;	
		case 4:
			
			System.out.println("\n Enter the Lid to search data: ");
        	lid=Integer.parseInt(sc.nextLine());
        	ResultSet rs=stmt.executeQuery("select * from learner where lid= " +lid);
        	while(rs.next()) {
        		System.out.println(rs.getInt(1));
        		System.out.println(rs.getString(2));
        		System.out.println(rs.getString(3));
        	}
        	System.out.println("--------------");
       
			break;
		case 5:
			
			ResultSet rs1=stmt.executeQuery("select * from learner");
        	while(rs1.next()) {
        		System.out.println(rs1.getInt(1));
        		System.out.println(rs1.getString(2));
        		System.out.println(rs1.getString(3));
        	}
        	System.out.println("--------------");
		  
			break;	
		case 6:
			
	       
			break;
		case 7:
			String q="select count(*) from learner";
			ResultSet rs2=stmt.executeQuery(q);
			rs2.next();
			int count=rs2.getInt(1);
			System.out.println("number of learners : "+count);
			System.out.println("------------------");
			
			
			
			break;
		case 8:
	       
			break;
		case 9:
	       
			break;
		case 10:
	        
			break;

	
		}
		
			}while(true);
				}
          catch(Exception e) {
				e.printStackTrace();
			}
		}
}

		