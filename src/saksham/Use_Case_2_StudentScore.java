package saksham;

public class Use_Case_2_StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
             
	         
		        String name = args[0];
		        
		       
		        int eng = Integer.parseInt(args[1]);
		        
		        int maths = Integer.parseInt(args[2]);
		        
		        
		        
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
		        
		       
		        
		     
		        
		    }


	}


