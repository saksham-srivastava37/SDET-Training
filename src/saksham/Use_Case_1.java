package saksham;
import java.util.Scanner;

public class Use_Case_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("City :");
	        String city = sc.nextLine();
	        
	        System.out.print("Temp: ");
	        Float temp = sc.nextFloat();
	        
	        boolean isHot;
	        int threshold = 30;
	        String condition;
	        
	        if(temp > threshold){
	             System.out.println("City: "+city);
	        System.out.println("Temperature: "+temp);
	        System.out.println("Condition: Hot Day");
	        }
	        
	        else{
	           System.out.println("City: "+city);
	        System.out.println("Temperature: "+temp);
	        System.out.println("Condition: Normal Day");
	        }
	        
	       sc.close();
	        
	    }


}
