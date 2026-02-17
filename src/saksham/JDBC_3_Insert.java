package saksham;

import java.sql.*;

public class JDBC_3_Insert {

    public static void main(String[] args) {

        try {

         
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee_db","root","1234");

           
            Statement stmt = con.createStatement();
            
            
            stmt.executeUpdate("INSERT INTO Empl VALUES (101,'Saksham','Srivastava',40000)");
            stmt.executeUpdate("INSERT INTO Empl VALUES (102,'Ankit','Kumar',50000)");
            stmt.executeUpdate("INSERT INTO Empl VALUES (103,'Abhay','Sharma',60000)");
            stmt.executeUpdate("INSERT INTO Empl VALUES (104,'Shubham','Sinha',37000)");
            stmt.executeUpdate("INSERT INTO Empl VALUES (105,'Manish','Singh',55000)");

          
          
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
