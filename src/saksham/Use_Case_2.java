package saksham;
import java.util.Scanner;

public class Use_Case_2 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Name :");
	        String name = sc.nextLine();
	        
	        System.out.print("Marks in Eng: ");
	        int eng = sc.nextInt();
	        
	        System.out.print("Marks in Maths: ");
	        int maths = sc.nextInt();
	        
	        
	        
	        int total = eng + maths;
	        double percentage = (total / 200.0) * 100;
	        
	        String grade;
	         if (percentage >= 90){
	             grade = "A";
	         }
	         else if(percentage >= 75){
	             grade = "B";
	         }
	         else if(percentage >= 50){
	             grade = "C";
	         }
	         else{
	             grade = "Fail";
	         }
	        
	        System.out.println("Student's name: " +name);
	        System.out.println("Marks in English: " +eng);
	        System.out.println("Marks in Maths: " +maths);
	        System.out.println("Total: " +total);
	        System.out.println("Percentage: " +percentage+"%");
	        System.out.println("Grade: " +grade);
	        
	       
	        
	       sc.close();
	        
	    }
	    

}
