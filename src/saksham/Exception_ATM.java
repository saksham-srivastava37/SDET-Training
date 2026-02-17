package saksham;
import java.util.*;


public class Exception_ATM{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int orgPin = 1234;
		while(true) {
			
		try {		
			System.out.print("Enter your Pin : ");
			int pin = sc.nextInt();
		  if(pin == orgPin) {		  
			  System.out.println("Pin Matched ");
			  break;
		  }else {
			  throw new Exception("Try again with correct pin");		  
		  }
		}catch(Exception e) {
			System.out.println("Wrong Input!!  Please try Again" + e.getMessage());
			
			sc.next();
		}
		finally{
			System.out.println("Logged in  Successfully !!");
			
		}
 
	}
 
}}
 
