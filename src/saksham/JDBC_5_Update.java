package saksham;

import java.sql.*;

public class JDBC_5_Update {

    public static void main(String[] args) {

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee_db","root","1234");

         
            Statement stmt = con.createStatement();

          
            String query = "UPDATE Empl SET Salary = 67000"
                         + "WHERE Employee_ID = 103";

        
            int rows = stmt.executeUpdate(query);

            System.out.println("Update Success");

            
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
