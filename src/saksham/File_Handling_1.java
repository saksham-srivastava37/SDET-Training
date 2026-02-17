package saksham;

import java.io.File;
import java.io.IOException;

//import java.util.*;

public class File_Handling_1 {
	public static void main(String[] args) {
		try {
			File file = new File("File_Handling_1.txt"); 
		
			
			if(file.createNewFile()) {
				System.out.println("File created successfully.");
			}
			else {
				System.out.println("File not created");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
