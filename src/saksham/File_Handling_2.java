package saksham;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class File_Handling_2 {
	public static void main(String[] args) {
		
//		 String fileName = "File_Handling_1.txt"; 
		
		String append = "\nThis statement is appended.";
		
		try {
			 FileWriter fw = new FileWriter("File_Handling_1.txt", true);
			 fw.write(append);
			 fw.close();
			 
			 System.out.println("Appended successfully");
		}
		
		
		
		
		//BUFFEREDREADER//
		
//		try(BufferedReader reader = new BufferedReader(new FileReader("File_Handling_1.txt"))){
//			String line;
//			
//			 while ((line = reader.readLine()) != null) {
//	                System.out.println(line);
//	            }
//		}
		
		//FILE READER//
		
//		try(FileReader filereader = new FileReader("File_Handling_1.txt")) {
//			
//			int character;
//			
//			while ((character = filereader.read()) != -1) {
//                System.out.print((char) character); 
//            }
//			
		//FILE WRITER//
		
////			FileWriter fw = new FileWriter("File_Handling_1.txt");
////			fw.write("Hello this is my text file");
////			fw.close();
//		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
