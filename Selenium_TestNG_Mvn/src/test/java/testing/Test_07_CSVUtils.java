package testing;

import java.io.*;
import java.util.*;

public class Test_07_CSVUtils {

    public static Object[][] getCSVData(String path) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(path));

        List<Object[]> list = new ArrayList<>();
        String line;

       
        br.readLine();

        
        while ((line = br.readLine()) != null) {

            String[] values = line.split(",");

            String username = values[0];
            String password = values[1];

            list.add(new Object[]{username, password});
        }

        br.close();

       
        Object[][] data = new Object[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }

        return data;
    }
}
