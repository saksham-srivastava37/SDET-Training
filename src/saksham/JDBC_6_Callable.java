package saksham;
import java.sql.*;

public class JDBC_6_Callable {

    public static void main(String[] args) {

        try {

           
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/wipro_db","root","1234");

           
            CallableStatement cs =
                con.prepareCall("{CALL getAllEmployees()}");

          
            ResultSet rs = cs.executeQuery();

           
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
                    
   }

            rs.close();
            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

