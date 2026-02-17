package saksham;

import java.sql.*;

public class JDBC_2_Create {

    public static void main(String[] args) {

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_db","root","1234");

            
            Statement stmt = con.createStatement();

           
            String query = "CREATE TABLE Empl ("
                    + "Employee_ID INT PRIMARY KEY, "
                    + "First_Name VARCHAR(50), "
                    + "Last_Name VARCHAR(50), "
                    + "Salary INT)";

            
            stmt.executeUpdate(query);

            System.out.println("Success");

         
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

