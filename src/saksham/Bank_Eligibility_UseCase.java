package saksham;

import java.util.*;

public class Bank_Eligibility_UseCase {
	public static void main(String[] args) {
		Integer age = 29;
		Integer cibil = 720;
		
		ArrayList<Double> monthly_income = new ArrayList();
		
		monthly_income.add(51000.0);
		
		System.out.println("Loan Eligibility Check . . .");
		System.out.println();
		
		  Double income = monthly_income.get(0);
		
		  if (age >= 21 && income >= 50000 && cibil >= 700) {
			  
			  System.out.println("Age: " +age);
			  System.out.println("Cibil Score: "+cibil);
			  System.out.println("Income: "+Double.toString(income));
			  
			  System.out.println();
			  
	            System.out.println("Eligible for loan");
	        } else {
	            System.out.println("Not Eligible for loan");
	        }
		  
		 
	}
	
}
