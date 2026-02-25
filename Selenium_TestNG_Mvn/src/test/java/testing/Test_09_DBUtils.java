package testing;

import java.sql.*;
import java.util.*;

public class Test_09_DBUtils {

    public static Object[][] getDBData() throws Exception {

        
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";          
        String pass = "1234";       

        
        Connection conn = DriverManager.getConnection(url, user, pass);

       
        String query = "SELECT username, password FROM Login_data";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

      
        List<Object[]> list = new ArrayList<>();

        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");

            list.add(new Object[]{username, password});
        }

       
        rs.close();
        stmt.close();
        conn.close();

     
        Object[][] data = new Object[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }

        return data;
    }
}
