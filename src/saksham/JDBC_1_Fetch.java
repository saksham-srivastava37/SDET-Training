package saksham;
 
import java.sql.*;
 
public class JDBC_1_Fetch {
 
public static void main(String[] args)
{
	
try {
	
Class.forName("com.mysql.cj.jdbc.Driver"); 
	   
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_db", "root", "1234");
 
Statement stmt = con.createStatement();
 
ResultSet rs = stmt.executeQuery(" select * from Employees");

ResultSetMetaData md = rs.getMetaData();
int cols = md.getColumnCount();



for(int i=1; i<=cols; i++){
 System.out.printf("%-15s", md.getColumnName(i));
}
System.out.println();


//while (rs.next())
//{
//	System.out.println(rs.getInt("Employee_ID") + " " + rs.getString("First_Name"));
//}



while(rs.next()){
 for(int i=1; i<=cols; i++){
     System.out.printf("%-15s", rs.getString(i));
 }
 System.out.println();
}




con.close();
}
	catch (Exception e)
   {
		System.out.println(e);
   }
}
 
}